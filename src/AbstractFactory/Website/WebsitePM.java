package AbstractFactory.Website;

import AbstractFactory.IProjectManager;

public class WebsitePM implements IProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project manager manage website project...");
    }
}
