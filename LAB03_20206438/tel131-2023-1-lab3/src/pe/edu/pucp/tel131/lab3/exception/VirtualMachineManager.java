package pe.edu.pucp.tel131.lab3.exception;

import pe.edu.pucp.tel131.lab3.app.NameAlreadyExistsException;
import pe.edu.pucp.tel131.lab3.bean.OperatingSystemBean;
import pe.edu.pucp.tel131.lab3.bean.VirtualMachineBean;
import pe.edu.pucp.tel131.lab3.exception.*;
import pe.edu.pucp.tel131.lab3.util.CommandLineTable;
import pe.edu.pucp.tel131.lab3.util.Lab3Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirtualMachineManager {

    private final Scanner scanner;
    private VirtualMachineBean vm = new VirtualMachineBean();

    private List<VirtualMachineBean> virtualMachineBeans = new ArrayList<>();

    /* NO MODIFICAR */
    public VirtualMachineManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void createVirtualMachineName() {
        System.out.print("Ingrese nombre de la VM: ");
        String name = scanner.nextLine();
        try{
            for(VirtualMachineBean maquina: virtualMachineBeans){
                if(maquina.getName().equals(name)){
                    throw new NameAlreadyExistsException();
                }
            }
            vm.setName(name);
        }
        catch(NameAlreadyExistsException ex){
            System.out.println(ex.getMessage());
        }

    }
    public void configureVirtualMachine() {
        System.out.println("\n############ Configura tu VM ############");

        // Elegir número de cores
        while (true) {
            try {
                System.out.print("Ingrese número de cores: ");
                int cores = Integer.parseInt(scanner.nextLine());
                if (cores % 2 == 1) {
                    throw new InvalidCoresException();
                }
                vm.setCores(cores);
                break;
            }
            catch (InvalidCoresException ex) {
                System.out.println(ex.getMessage());
            }
            catch (NumberFormatException ex) {
                System.out.println("Ingrese un número entero");
            }
            finally {
                System.out.println();
            }
        }

        //Elegir la ram(GB):
        while (true) {
            try {
                System.out.print("Ingrese la RAM(GB): ");
                int ram = Integer.parseInt(scanner.nextLine());
                if (!(ram % 4 == 0)) {
                    throw new NumberFormatException();
                }
                System.out.println("0. 128");
                System.out.println("1. 256");
                System.out.println("2. 512");
                System.out.println("3. 1024");
                vm.setRam(ram);
                break;
            }
            catch (NumberFormatException ex) {
                System.out.println("Ingrese un número válido de RAM(múltiplo de 4)");
            }

            finally {
                System.out.println();
            }
        }
        //Elegir el volumen (GB):
        while (true) {
            try {
                System.out.print("Ingrese la volumen(GB): ");
                int disco = Integer.parseInt(scanner.nextLine());
                boolean found=false;
                for(int d : VirtualMachineBean.availableDisks){
                    if(disco==d){
                        found=true;
                    }
                }
                if(!found){
                    throw new NumberFormatException();
                }
                vm.setDisk(disco);
                break;

            }
            catch (NumberFormatException ex) {
                System.out.println("Ingrese un valor de la lista");
            }

            finally {
                System.out.println();
            }
        }
        System.out.println("\n############ VM Configurada! ############");
    }

    // TODO: Completar
    public void chooseOperatingSystem() {

        // Elige el tipo de sistema operativo
        while (true) {
            for (int i = 0; i < OperatingSystemBean.availableTypes.length; i++) {
                System.out.printf("%d. %s\n", i, OperatingSystemBean.availableTypes[i]);
            }
            System.out.print("Elija una opción de tipo de OS: ");
            try {
                String osType = OperatingSystemBean.availableTypes[Integer.parseInt(scanner.nextLine())];
                vm.getOperatingSystem().setType(osType);
                break;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Ingrese un valor de la lista");
            } catch (NumberFormatException ex) {
                System.err.println("Ingrese un número entero");
            } finally {
                System.out.println();
            }
        }

        // Completar...

    }

    /* NO MODIFICAR */
    public void printVirtualMachine() {
        CommandLineTable ct = new CommandLineTable();
        ct.setShowVerticalLines(true);
        ct.setHeaders("name", "cores", "ram (GBs)", "disk (GBs)", "ip", "OS type", "OS distro");
        ct.addRow(vm.getName(),
                String.valueOf(vm.getCores()),
                String.valueOf(vm.getRam()),
                String.valueOf(vm.getDisk()),
                vm.getIp(),
                String.valueOf(vm.getOperatingSystem().getType()),
                String.valueOf(vm.getOperatingSystem().getDistro()));
        ct.print();
    }

    // TODO: completar
    public void deployVirtualMachine() {
        // completar validación

        /* Descomentar las 3 siguientes líneas cuando esté completa la validación: */
        //virtualMachineBeans.add(vm);
        //vm = new VirtualMachineBean();
        //Lab3Utils.launchVirtualMachine();
    }

    /* NO MODIFICAR */
    public void listVirtualMachines() {
        System.out.println("######################## Virtual Machines ########################");
        CommandLineTable ct = new CommandLineTable();
        ct.setShowVerticalLines(true);
        ct.setHeaders("name", "cores", "ram (GBs)", "disk (GBs)", "ip", "OS type", "OS distro");
        for (VirtualMachineBean vm: virtualMachineBeans) {
            ct.addRow(vm.getName(),
                    String.valueOf(vm.getCores()),
                    String.valueOf(vm.getRam()),
                    String.valueOf(vm.getDisk()),
                    vm.getIp(),
                    String.valueOf(vm.getOperatingSystem().getType()),
                    String.valueOf(vm.getOperatingSystem().getDistro()));
        }
        ct.print();
    }

    /* NO MODIFICAR */
    public void exit() {
        System.out.println("\nbye!\n");
    }

    /* NO MODIFICAR */
    public void setVirtualMachineBeans(List<VirtualMachineBean> virtualMachineBeans) {
        this.virtualMachineBeans = virtualMachineBeans;
    }

    /* NO MODIFICAR */
    public List<VirtualMachineBean> getVirtualMachineBeans() {
        return virtualMachineBeans;
    }
}
