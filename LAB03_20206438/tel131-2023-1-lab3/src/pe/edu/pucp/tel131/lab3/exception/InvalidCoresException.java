package pe.edu.pucp.tel131.lab3.exception;

public class InvalidCoresException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Ingrese un número válido de cores (número par)";
    }
}
