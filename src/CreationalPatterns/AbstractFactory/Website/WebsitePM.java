package CreationalPatterns.AbstractFactory.Website;

import CreationalPatterns.AbstractFactory.IProjectManager;

public class WebsitePM implements IProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project manager manage website project...");
    }
}
