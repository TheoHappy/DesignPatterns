package Builder.Difficult;

import Builder.Computer;

public abstract class  ComputerBuilderAbstract {
    Computer computer;
    void createComputer(){
        computer = new Computer();
    }
    abstract void buildCpu();
    abstract void buildMotherboard();
    abstract void buildRam();
    abstract void buildRom();
    abstract void buildGpu();
    abstract void buildPowerSupply();

    Computer getComputer(){
        return computer;
    }
}
