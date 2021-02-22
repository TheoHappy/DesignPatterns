package AbstractFactory.Website;

import AbstractFactory.ITester;

public class ManualTester implements ITester {
    @Override
    public void tesCode() {
        System.out.println("Manual tester tests website...");
    }
}
