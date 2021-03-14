package CreationalPatterns.Builder.Difficult;

public class GamingComputerBuilder extends ComputerBuilderAbstract{
    @Override
    void buildCpu() {
        computer.setCpu("Intel Core i7 10700K OEM Comet Lake LGA1200");
    }

    @Override
    void buildMotherboard() {
        computer.setMotherboard("ASUS TUF GAMING Z490-PLUS WIFI LGA1200");
    }

    @Override
    void buildRam() {
        computer.setRam(32);
    }

    @Override
    void buildRom() {
        computer.setRom(5000);
    }

    @Override
    void buildGpu() {
        computer.setGpu("GeForce RTX 3080 GamingPro 10GB");
    }

    @Override
    void buildPowerSupply() {
        computer.setPowerSupply("850W DeepCool DQ850-M-V2L Gold");
    }
}

