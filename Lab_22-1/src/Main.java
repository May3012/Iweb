import java.util.Scanner;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Bebida> bebidas = new ArrayList<Bebida>();


        boolean estado = true;
        Scanner scanner = new Scanner(System.in);
        while(estado){
            switch (Main.menuPrincipal()){
                case "1":
                    System.out.println("\nRegistrar nuevo cliente");
                    System.out.println("--------------------------");
                    Cliente cliente = new Cliente();
                    cliente.registrarCliente();
                    clientes.add(cliente);
                    break;
                case "2":
                    System.out.println("\nBuscar detalle del cliente por DNI");
                    System.out.println("--------------------------");
                    System.out.print("Ingrese el dni del cliente  que quiere buscar : ");
                    int dni_buscar = Integer.parseInt(scanner.nextLine());

                    if(String.valueOf(dni_buscar).length() != 8){
                        System.out.println("No es correcto ");
                    }else{
                        Cliente cliente_encontrado = Main.buscarDNI(clientes,dni_buscar);
                        if(cliente_encontrado != null){
                            System.out.println("Se encontró el cliente, sus datos son los siguietnes: ");

                            System.out.println("Nombre: "+cliente_encontrado.getNombre());
                            System.out.println("DNI: "+cliente_encontrado.getDni());
                            System.out.println("Consumo: S/"+cliente_encontrado.getConsumo());
                            System.out.println("Cantidad de vacunas: "+cliente_encontrado.getCantidadVacunas());
                        }
                        else{
                            System.out.println("No se encontro el dni");
                        }
                    }
                    break;
                case "3":
                    System.out.println("\nAñadir bebida a cliente");
                    System.out.println("--------------------------");
                    System.out.print("Indique el codigo(dni) del cliente que desea comprar la bebida: ");
                    String momem = scanner.nextLine();

                    if(momem.length() == 8){
                        Cliente client_encontrado = Main.buscarDNI(clientes,Integer.parseInt(momem));
                        if(client_encontrado != null){
                            System.out.println("Se encuentran disponibles las siguientes bedias: ");
                            int j = 1;
                            for(Bebida i: bebidas){
                                System.out.println(j+") "+ i.getNombre() +" : S/ "+ i.getPrecio());
                                j++;
                            }
                            System.out.print("Indique el número de bebida a agregar: ");
                            int num = Integer.parseInt(scanner.nextLine());
                            if(num >bebidas.size()){
                                System.out.println("Ingrese una opcion valida");

                            }
                            else{

                            }
                        }
                        else{
                            System.out.println("El dni no se encuentra registrado");
                        }
                    }else{
                        System.out.println("Datos incorrectos");
                    }

                    break;
                case "4":
                    System.out.println("\nAñadir nueva bebida");
                    System.out.println("--------------------------");
                    Bebida bebida = new Bebida();
                    System.out.print("Ingrese el nombre de la bebida: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio de "+nombre+": ");
                    String price = scanner.nextLine();
                    double precio = Double.parseDouble(price);
                    System.out.print("Ingrese el stock: ");
                    String stock1 = scanner.nextLine();
                    int stock = Integer.parseInt(stock1);
                    bebida.registrarBebida(nombre,precio,stock);
                    bebidas.add(bebida);
                    System.out.println("Se agrego la bebida correctamente");
                    break;
                case "5":
                    estado = false;
                    System.out.println(" --- Cerrando Programa --- ");
                    break;

                default:
                    System.out.println("\nIngrese una opcion válida ");
                    break;

            }
        }

    }

    private static String menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|            Menú                             |");
        System.out.println("| [1]  Registrar nuevo cliente                |");
        System.out.println("| [2]  Buscar detalle del cliente por  DNI    |");
        System.out.println("| [3]  Añadir bebida a cliente                |");
        System.out.println("| [4]  Añadir nueva bebida                    |");
        System.out.println("| [9]  Salir                                  |");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Ingrese opción : ");
        return scanner.nextLine();

    }
    private static Cliente buscarDNI(ArrayList<Cliente> clientes, int dni){
        boolean condicion = false; //vamos a iniciar con que no existe ese nombre
        for (Cliente i: clientes){
            if(i.getDni() == dni){
                return i;
            }
        }
        return null;
    }
}