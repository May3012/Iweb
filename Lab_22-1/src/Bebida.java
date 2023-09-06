public class Bebida {
    private String nombre;
    private double precio;
    private int cantidad;

    //getter and setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //metodos


    public void registrarBebida(String name, double price, int stock){
        this.setNombre(name);
        this.setCantidad(stock);
        this.setPrecio(price);
    }



}
