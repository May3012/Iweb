import java.util.ArrayList;
import java.util.Scanner;
public class AppController {

    public void registrarNuevoEquipo(ArrayList<Equipo> equipos){
        Scanner scanner = new Scanner(System.in);
        Equipo equipo = new Equipo();
        System.out.print("Nombre: ");
        equipo.setNombre(scanner.nextLine());

        boolean condicion = buscarEquipoXNombre(equipos, equipo);
        if(condicion){
            System.out.println("\"Error, ya existe el nombre\"");
            return;
        }

        System.out.print("Pais: ");
        equipo.setPais(scanner.nextLine());
        System.out.print("Iniciales: ");
        equipo.setIniciales(scanner.nextLine());

        if(equipo.getIniciales().length()>3) {
            System.out.println("\"Error, el inicial no puede tener mas de 3 caracteres\"");
            return;
        }

        System.out.print("Estadio: ");
        equipo.setEstadio(scanner.nextLine());
        System.out.print("Tecnico: ");
        equipo.setIniciales(scanner.nextLine());
        System.out.print("Presupuesto: ");
        equipo.setPresupuesto(Float.parseFloat(scanner.nextLine()));
        equipos.add(equipo);

        }

    public void registrarNuevoJugador(ArrayList<Jugador> jugadores){
        Scanner scanner = new Scanner(System.in);
        Jugador jugador = new Jugador();
        System.out.print("Nombre: ");
        jugador.setNombre(scanner.nextLine());
        System.out.print("Posicion: ");
        jugador.setPosicion(scanner.nextLine());
        System.out.print("Numero de camiseta: ");
        jugador.setNum_camiseta(Integer.parseInt(scanner.nextLine()));
        /*
        System.out.print("Numero de camiseta: ");
        String ncam = scanner.nextLine();
        int n_cam = Integer.parseInt(ncam);
        jugador.setNum_camiseta(n_cam);
        * */
        System.out.print("Edad: ");
        jugador.setEdad(scanner.nextLine());
        //System.out.print("Salario: ");
        //jugador.setSalario(scanner.nextLine());
        System.out.print("DNI: ");
        jugador.setDni(scanner.nextLine());
        boolean centinela2 = buscarJugadorXDni(jugadores,jugador);
        if(centinela2){
            System.out.println("\nError, ya existe el dni");
            return;
        }


    }
    public void listarEquipos(ArrayList<Equipo> equipos){
        System.out.println("Lista de Equipos");
        System.out.println("----------------------------");
        for (Equipo i: equipos){
            System.out.println("Nombre: " + i.getNombre()+
                    "|Pais: "+ i.getPais()+
                    "|Iniciales: "+i.getIniciales()+
                    "|Estadio: "+ i.getEstadio()+
                    "|Tecnico: "+ i.getTecnico()+
                    "|Presupuesto: "+ i.getPresupuesto());
        }
    }
    public void listarJugadoresXSalario(ArrayList<Jugador> jugadores){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salario mayor a : ");
        float salary = Float.parseFloat(scanner.nextLine());
        for (Jugador player: jugadores){
            if(player.getSalario()>salary){
                System.out.println("Nombre: "+player.getNombre()+
                        "|Posicion: " + player.getPosicion()+
                        "|numero de camisera: "+player.getNum_camiseta());
            }
        }

    }
    public boolean buscarEquipoXNombre(ArrayList<Equipo> equipos, Equipo equipo){
        boolean condicion = false; //vamos a iniciar con que no existe ese nombre
        for (Equipo team: equipos){
            if(team.getNombre().equalsIgnoreCase(equipo.getNombre())){
                condicion = true;
                break;
            }
        }
        return condicion;
    }
    public boolean buscarJugadorXDni(ArrayList<Jugador> jugadores, Jugador jugador){
        boolean condicion = false;
        for (Jugador jugador1: jugadores){
            if(jugador1.getDni().equalsIgnoreCase(jugador.getDni())){
                condicion = false;
                break;
            }
        }
        return condicion;
    }

}
