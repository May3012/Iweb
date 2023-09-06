import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class AppController {

    public void registrarNuevoEquipo(ArrayList<Equipo> equipos){
        Equipo equipo = new Equipo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Marca: ");
        equipo.setMarca(scanner.nextLine());
        System.out.print("Tipo: ");
        equipo.setTipo(scanner.nextLine());
        System.out.print("Cantidad de puertos: ");
        equipo.setCantPuertos(Integer.parseInt(scanner.nextLine()));
        System.out.print("Costo: ");
        equipo.setCosto(Float.parseFloat(scanner.nextLine()));
        System.out.print("Número de serie: ");
        String num = scanner.nextLine();
        equipo.setNumSerie(num);


        for (Equipo existingEquipo : equipos) {
            if (existingEquipo.getNumSerie().equals(equipo.getNumSerie())) {
                System.out.println("Error, ya existe el número de serie");
                return;
            }
        }
        equipos.add(equipo);
    }
    public void registrarNuevoTecnico(ArrayList<Tecnico> tecnicos){
        Tecnico tecnico = new Tecnico();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        tecnico.setNombre(scanner.nextLine());
        System.out.print("Apellidos: ");
        tecnico.setApellido(scanner.nextLine());
        System.out.print("DNI: ");
        tecnico.setDni(scanner.nextLine());

        // Verificar si el DNI ya existe
        for (Tecnico existingTecnico : tecnicos) {
            if (existingTecnico.getDni().equals(tecnico.getDni())) {
                System.out.println("Error, ya existe el DNI");
                return;
            }
        }

        System.out.print("Edad: ");
        tecnico.setEdad(scanner.nextLine());
        System.out.print("Telefono: ");
        tecnico.setTelefono(Integer.parseInt(scanner.nextLine()));
        System.out.print("Salario: ");
        tecnico.setSalario(Float.parseFloat(scanner.nextLine()));
        System.out.print("Cargo: ");
        tecnico.setCargo(scanner.nextLine());

        tecnicos.add(tecnico);
    }
    public void listarEquipos(ArrayList<Equipo> equipos){
        System.out.println("Listado de Equipos:");
        for (Equipo equipo : equipos) {
            System.out.println("Marca: " + equipo.getMarca()
                            + "|Nombre: " + equipo.getTipo()
                            + "|Cantidad de puertos: " + equipo.getCantPuertos()
                            + "|Costo: "+ equipo.getCosto()
                            + "|Numero de serie: "+ equipo.getNumSerie());
                            System.out.println("----------------------------");
        }

    }

    public void listarTecnicos(ArrayList<Tecnico> tecnicos){
        System.out.println("Listado de Tecnicos:");
        for (Tecnico tecnico : tecnicos) {
            System.out.print("Ingrese el salario minimo: ");
            Scanner scanner = new Scanner(System.in);
            int salario = Integer.parseInt(scanner.nextLine());
            if (tecnico.getSalario() > salario) {
                System.out.println("Nombre: " + tecnico.getNombre()
                        + "|Apellidos: " + tecnico.getApellido()
                        + "|DNI: " + tecnico.getDni()
                        + "|Edad: " + tecnico.getEdad()
                        + "|Teléfono: " + tecnico.getTelefono()
                        + "|Salario: " + tecnico.getSalario()
                        + "|Cargo: " + tecnico.getCargo());
                System.out.println("----------------------------");

            }
        }

    }



    public boolean buscarNumSerie(ArrayList<Equipo> equipos, Equipo equipo){
        boolean condicion = false; //vamos a iniciar con que no existe ese nombre
        for (Equipo team: equipos){
            if(team.getNumSerie().equalsIgnoreCase(equipo.getNumSerie())){
                condicion = true;
                break;
            }
        }
        return condicion;
    }

    public boolean buscarDni(ArrayList<Tecnico> tecnicos, Tecnico tecnico){
        boolean condicion = false;
        for (Tecnico i: tecnicos){
            if(i.getDni().equals(tecnico.getDni())){
                condicion = false;
                break;
            }
        }
        return condicion;
    }


}
