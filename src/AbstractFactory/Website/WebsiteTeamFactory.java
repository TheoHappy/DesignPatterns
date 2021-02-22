package AbstractFactory.Website;

import AbstractFactory.IDeveloper;
import AbstractFactory.IProjectManager;
import AbstractFactory.IProjectTeamFactory;
import AbstractFactory.ITester;

public class WebsiteTeamFactory implements IProjectTeamFactory {

    @Override
    public IDeveloper getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ITester getTester() {
        return new ManualTester();
    }

    @Override
    public IProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
