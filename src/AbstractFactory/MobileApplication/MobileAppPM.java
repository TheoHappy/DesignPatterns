package AbstractFactory.MobileApplication;

import AbstractFactory.IProjectManager;

public class MobileAppPM implements IProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project manager manage mobile app project...");
    }
}
