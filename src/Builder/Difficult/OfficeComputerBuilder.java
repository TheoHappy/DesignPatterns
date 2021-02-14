package Builder.Difficult;

public class OfficeComputerBuilder extends ComputerBuilderAbstract {
    @Override
    void buildCpu() {
        computer.setCpu("Intel Core i3-10100");
    }

    @Override
    void buildMotherboard() {
        computer.setMotherboard("MSI B460M-A Pro");
    }

    @Override
    void buildRam() {
        computer.setRam(8);
    }

    @Override
    void buildRom() {
        computer.setRom(1000);
    }

    @Override
    void buildGpu() {
        computer.setGpu("Integrated Graphics");
    }

    @Override
    void buildPowerSupply() {
        computer.setPowerSupply("EVGA 450 BR");
    }
}
