package CreationalPatterns.Builder.Difficult;

import CreationalPatterns.Builder.Computer;

public class BuilderAbsTest {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new OfficeComputerBuilder());
        Computer computer = director.buildComputer();
        System.out.println(computer);
    }
}
