package AbstractFactory;


public interface IProjectTeamFactory {
    IDeveloper getDeveloper();
    ITester getTester();
    IProjectManager getProjectManager();
}
