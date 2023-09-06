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

/*
  public void registrarCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        this.setNombre(scanner.nextLine());

        boolean centinela = true;
        while(centinela){
            System.out.print("Ingrese el dni del cliente: ");
            String identidad = scanner.nextLine();
            int identi = Integer.parseInt(identidad);
            this.setDni(identi);

            if(identidad.length() == 8){
                this.setDni(identi);
                centinela = false;
                break;
            }else{
                System.out.println("DNI invalido");
            }
        }
        
        /*
        
        public void registrarCliente(ArrayList<Cliente> clientes) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el nombre del cliente: ");
    this.setNombre(scanner.nextLine());

    boolean centinela = true;
    while (centinela) {
        System.out.print("Ingrese el DNI del cliente (8 caracteres numéricos): ");
        String identidad = scanner.nextLine();

        if (identidad.length() == 8 && esNumero(identidad)) {
            int dni = Integer.parseInt(identidad);
            
            // Verificar si el DNI ya existe en la lista de clientes
            if (!existeDNI(clientes, dni)) {
                this.setDni(dni);
                centinela = false;
            } else {
                System.out.println("El DNI ya está registrado, por favor, ingrese otro.");
            }
        } else {
            System.out.println("DNI inválido. Debe contener exactamente 8 caracteres numéricos.");
        }
    }
}

// Método para verificar si un DNI ya existe en la lista de clientes
private boolean existeDNI(ArrayList<Cliente> clientes, int dni) {
    for (Cliente cliente : clientes) {
        if (cliente.getDni() == dni) {
            return true;
        }
    }
    return false;
}

// Método para verificar si una cadena es numérica
private boolean esNumero(String cadena) {
    try {
        Integer.parseInt(cadena);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}






*/

    
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
