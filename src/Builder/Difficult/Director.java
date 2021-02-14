package Builder.Difficult;

import Builder.Computer;
import Builder.Simple.ComputerBuilder;

public class Director {
    ComputerBuilderAbstract builder;

    public void setBuilder(ComputerBuilderAbstract builder) {
        this.builder = builder;
    }

    public Computer buildComputer(){
        builder.createComputer();
        builder.buildCpu();
        builder.buildMotherboard();
        builder.buildRam();
        builder.buildRom();
        builder.buildGpu();
        builder.buildPowerSupply();
        Computer computer = builder.getComputer();
        return computer;
    }
}
