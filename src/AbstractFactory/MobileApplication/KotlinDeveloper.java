package AbstractFactory.MobileApplication;

import AbstractFactory.IDeveloper;

public class KotlinDeveloper implements IDeveloper {
    @Override
    public void writeCode() {
        System.out.println("Kotlin developer writes Kotlin code for mobile app...");
    }
}
