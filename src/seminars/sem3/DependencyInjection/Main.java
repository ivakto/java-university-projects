package seminars.sem3.DependencyInjection;

public class Main {
    public static void main(String[] args) {
        
        Logger consoleLogger = new ConsoleLogger();
        Application appWithConsoleLog = new Application(consoleLogger);
        appWithConsoleLog.logInfo("The admin was logged successfully.");
        
        Logger fileLogger = new FileLogger();
        Application appWithFileLog = new Application(fileLogger);
        appWithFileLog.logInfo("Text.");
    }
}
