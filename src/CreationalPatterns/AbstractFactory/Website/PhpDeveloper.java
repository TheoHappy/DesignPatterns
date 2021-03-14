package CreationalPatterns.AbstractFactory.Website;

import CreationalPatterns.AbstractFactory.IDeveloper;

public class PhpDeveloper implements IDeveloper {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes codes in php for website...");
    }
}
