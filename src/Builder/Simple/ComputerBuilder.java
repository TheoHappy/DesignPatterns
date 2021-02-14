package Builder.Simple;

import Builder.Computer;

public class ComputerBuilder {
    private String cpu = "Core 2 Duo";
    private String motherboard = "Zebronics G41 Socket 775";
    private int ram = 2;
    private int rom = 500;
    private String gpu = "GTX 650";
    private String powerSupply = "Corsair cx600";

    ComputerBuilder buildCpu(String cpu){
        this.cpu = cpu;
        return this;
    }

    ComputerBuilder buildMotherBoard(String motherboard){
        this.motherboard = motherboard;
        return this;
    }

    ComputerBuilder buildRam(int ram){
        this.ram = ram;
        return this;
    }

    ComputerBuilder buildRom(int rom){
        this.rom = rom;
        return this;
    }

    ComputerBuilder buildGpu(String gpu){
        this.gpu = gpu;
        return this;
    }

    ComputerBuilder buildpowerSupply(String powerSupply){
        this.powerSupply = powerSupply;
        return this;
    }

    Computer build(){
        Computer computer = new Computer();
        computer.setCpu(cpu);
        computer.setMotherboard(motherboard);
        computer.setRam(ram);
        computer.setRom(rom);
        computer.setGpu(gpu);
        computer.setPowerSupply(powerSupply);
        return computer;
    }
}
