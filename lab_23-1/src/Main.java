// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppController appController = new AppController();
        ArrayList<Equipo> equipos = new ArrayList<Equipo>();
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        boolean centinela = true;

        while(centinela){
            switch (Main.menuPrincipal()){
                case "1":
                    System.out.println("\nRegistrar Nuevo Equipo");
                    System.out.println("--------------------------");
                    appController.registrarNuevoEquipo(equipos);
                    break;
                case "2":
                    System.out.println("\nRegistrar Nuevo Jugador");
                    System.out.println("--------------------------");
                    appController.registrarNuevoJugador(jugadores);
                    break;
                case "3":
                    System.out.println("\nListar Jugadores por Salario");
                    System.out.println("--------------------------");
                    appController.listarJugadoresXSalario(jugadores);
                    break;
                case "4":
                    System.out.println("\nListar equipos");
                    System.out.println("--------------------------");
                    appController.listarEquipos(equipos);
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
        System.out.println("| 2 <- Registrar Nuevo Jugador         |");
        System.out.println("| 3 <- Lista de jugadores x salario    |");
        System.out.println("| 4 <- Lista de Equipos                |");
        System.out.println("| 9 <- Salir                           |");
        System.out.println(" Ingrese opcion: ");
        return scanner.nextLine();
    }
}