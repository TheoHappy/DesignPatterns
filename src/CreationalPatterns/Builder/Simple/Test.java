package CreationalPatterns.Builder.Simple;

import CreationalPatterns.Builder.Computer;

public class Test {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .buildCpu("i5")
                .buildRam(8)
                .buildRom(1000)
                .buildGpu("NVIDIA 1050TI")
                .build();
        System.out.println(computer);
    }
}
