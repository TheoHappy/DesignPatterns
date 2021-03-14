package CreationalPatterns.Factory;

public class App {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = getDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
    public static DeveloperFactory getDeveloperBySpeciality(String speciality){
        switch (speciality){
            case "java" : return new JavaDeveloperFactory();
            case "php" : return new PhpDeveloperFactory();
            case  "python" : return new PythonDeveloperFactory();
            default: throw new RuntimeException("This programming language (" + speciality + ") is unknown!");
        }
    }
}
