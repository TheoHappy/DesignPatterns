package CreationalPatterns.AbstractFactory.Website;

import CreationalPatterns.AbstractFactory.IDeveloper;
import CreationalPatterns.AbstractFactory.IProjectManager;
import CreationalPatterns.AbstractFactory.IProjectTeamFactory;
import CreationalPatterns.AbstractFactory.ITester;

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
