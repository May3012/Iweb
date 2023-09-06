import java.util.Scanner;

public class Cliente {
    private String nombre;
    private int dni;
    private int edad;
    private double consumo = 0.0;
    private int cantidadVacunas;

    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public int getCantidadVacunas() {
        return cantidadVacunas;
    }

    public void setCantidadVacunas(int cantidadVacunas) {
        this.cantidadVacunas = cantidadVacunas;
    }

    //metodos

    public void registrarCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        this.setNombre(scanner.nextLine());

        boolean centinela = true;
        while(centinela){
            System.out.print("Ingrese el dni del cliente: ");
            String identidad = scanner.nextLine();

            if(identidad.length() == 8){
                int identi = Integer.parseInt(identidad);
                this.setDni(identi);
                centinela = false;
                break;
            }else{
                System.out.println("DNI invalido");
            }
        }

        boolean centinela2 = true;
        while(centinela2){
            System.out.print("Ingrese la edad del cliente (tiene que ser mayor de edad): ");
            int edadStr = Integer.parseInt(scanner.nextLine());

            if(edadStr>=18){
                this.setEdad(edadStr);
                centinela2 = false;
                break;
            }else{
                System.out.println("Datos incorrectos");
            }
        }


        boolean centinela3 = true;
        while(centinela3){
            System.out.print("Ingrese la cantidad de vacunas de "+ this.getNombre()+":");
            int vac = Integer.parseInt(scanner.nextLine());

            if(vac == 3){
                this.setCantidadVacunas(vac);
                System.out.println("Cliente registro satisfactoriamente, su codigo es "+ this.getDni());
                consumo = consumo + 40.00;
                centinela3 = false;
                break;
            }else{
                System.out.println("Debe tener 3 vacunas para ingresar");
            }
        }




    }



}
