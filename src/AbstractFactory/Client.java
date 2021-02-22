package AbstractFactory;

import AbstractFactory.MobileApplication.MobileTeamFactory;
import AbstractFactory.Website.WebsiteTeamFactory;


public class Client {
    public static void main(String[] args) {
        IProjectTeamFactory app1 = new WebsiteTeamFactory();
        IDeveloper developer = app1.getDeveloper();
        ITester tester = app1.getTester();
        IProjectManager projectManager = app1.getProjectManager();
        developer.writeCode();
        tester.tesCode();
        projectManager.manageProject();

    }
}
