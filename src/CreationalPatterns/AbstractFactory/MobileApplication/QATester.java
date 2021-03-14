package CreationalPatterns.AbstractFactory.MobileApplication;

import CreationalPatterns.AbstractFactory.ITester;

public class QATester implements ITester {
    @Override
    public void tesCode() {
        System.out.println("QA Tester tests mobile app...");
    }
}
