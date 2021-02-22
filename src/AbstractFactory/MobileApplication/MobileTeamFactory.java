package AbstractFactory.MobileApplication;

import AbstractFactory.IDeveloper;
import AbstractFactory.IProjectManager;
import AbstractFactory.IProjectTeamFactory;
import AbstractFactory.ITester;

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
