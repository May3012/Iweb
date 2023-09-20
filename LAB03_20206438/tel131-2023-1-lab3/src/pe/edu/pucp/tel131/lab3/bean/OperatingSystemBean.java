package pe.edu.pucp.tel131.lab3.bean;

public class OperatingSystemBean {

    public static final String WINDOWS = "windows";
    public static final String LINUX = "linux";
    public static final String MACOS = "macos";
    public static final String[] availableTypes = { WINDOWS, LINUX, MACOS };
    public static final String[] windowsDistros = {"home", "pro", "server"};
    public static final String[] linuxDistros = {"ubuntu", "fedora", "arch", "suse"};
    public static final String[] macosDistros = {"ventura", "monterey"};

    private String type = "";
    private String distro = "";

    public OperatingSystemBean() {
    }

    public OperatingSystemBean(String type, String distro) {
        this.type = type;
        this.distro = distro;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDistro() {
        return distro;
    }

    public void setDistro(String distro) {
        this.distro = distro;
    }
}
