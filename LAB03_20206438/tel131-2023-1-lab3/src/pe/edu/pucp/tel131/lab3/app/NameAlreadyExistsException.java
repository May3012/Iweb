package pe.edu.pucp.tel131.lab3.app;

public class NameAlreadyExistsException extends Exception{
    @Override
    public String getMessage(){
        return "El nombre de VM ya existe";
    }
}
