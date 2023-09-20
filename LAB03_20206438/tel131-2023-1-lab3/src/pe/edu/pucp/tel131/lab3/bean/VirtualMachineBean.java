package pe.edu.pucp.tel131.lab3.bean;

public class VirtualMachineBean {

    public static final int[] availableDisks = {128, 256, 512, 1024};

    private String name = "";
    private int cores = 0;
    private int ram = 0;
    private int disk = 0;
    private String ip = "";
    private OperatingSystemBean operatingSystem = new OperatingSystemBean();

    public VirtualMachineBean() {
    }

    public VirtualMachineBean(String name, int cores, int ram, int disk, String ip, OperatingSystemBean operatingSystem) {
        this.name = name;
        this.cores = cores;
        this.ram = ram;
        this.disk = disk;
        this.ip = ip;
        this.operatingSystem = operatingSystem;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public OperatingSystemBean getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystemBean operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
