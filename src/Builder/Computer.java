package Builder;

public class Computer {
    private String cpu;
    private String motherboard;
    private int ram;
    private int rom;
    private String gpu;
    private String powerSupply;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                ", gpu='" + gpu + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                '}';
    }
}
