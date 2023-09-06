import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppController appController = new AppController();
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();
        ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();

        boolean centinela = true;

        while(centinela){
            switch (Main.menuPrincipal()){
                case "1":
                    System.out.println("\nRegistrar Nuevo Equipo");
                    System.out.println("--------------------------");
                    appController.registrarNuevoEquipo(equipos);
                    break;
                case "2":
                    System.out.println("\nRegistrar Nuevo Técnico");
                    System.out.println("--------------------------");
                    appController.registrarNuevoTecnico(tecnicos);
                    break;
                case "3":
                    System.out.println("\nListar Equipos");
                    System.out.println("--------------------------");
                    appController.listarEquipos(equipos);
                    break;
                case "4":
                    System.out.println("\nListar Técnicos x Salario");
                    System.out.println("--------------------------");
                    appController.listarEquipos(equipos);
                case "5":
                    System.out.println("\nListar Técnico x DNI");
                    System.out.println("--------------------------");
                    appController.listarTecnicos(tecnicos);
                case "9":
                    centinela = false;
                    System.out.println(" --- Cerrando programa --- ");
                    break;
                default:
                    System.out.println("\nIngrese una opcion válida ");
                    break;

            }
        }
    }


    public static String menuPrincipal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("|               Menú                   |");
        System.out.println("| 1 <- Registrar Nuevo Equipo          |");
        System.out.println("| 2 <- Registrar Nuevo Técnico         |");
        System.out.println("| 3 <- Listar Equipos                  |");
        System.out.println("| 4 <- Listar técnicos x salario       |");
        System.out.println("| 5 <- Buscar técnico x DNI            |");
        System.out.println("| 9 <- Salir                           |");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" Ingrese opcion: ");
        return scanner.nextLine();
    }
}