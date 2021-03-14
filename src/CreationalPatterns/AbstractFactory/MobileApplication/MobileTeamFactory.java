package CreationalPatterns.AbstractFactory.MobileApplication;

import CreationalPatterns.AbstractFactory.IDeveloper;
import CreationalPatterns.AbstractFactory.IProjectManager;
import CreationalPatterns.AbstractFactory.IProjectTeamFactory;
import CreationalPatterns.AbstractFactory.ITester;

public class MobileTeamFactory implements IProjectTeamFactory {
    @Override
    public IDeveloper getDeveloper() {
        return new KotlinDeveloper();
    }

    @Override
    public ITester getTester() {
        return new QATester();
    }

    @Override
    public IProjectManager getProjectManager() {
        return new MobileAppPM();
    }
}
