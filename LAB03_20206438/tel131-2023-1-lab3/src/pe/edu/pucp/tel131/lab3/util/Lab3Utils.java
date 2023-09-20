package pe.edu.pucp.tel131.lab3.util;

public class Lab3Utils {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String IPV4_CIDR_REGEX = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)(\\.(?!$)|$)){4}$";

    public static void launchVirtualMachine() {
        System.out.println();
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(120);
                System.out.print("[" + "*".repeat(i + 1) + " ".repeat(9 - i) + "] " + (i +1) * 10 +  "%\r");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nVirtual Machine launched!");
    }
}
