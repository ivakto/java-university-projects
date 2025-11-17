package seminars.sem3.DependencyInjection;

public class Application {
    private final Logger loggerService;

    public Application(Logger logger) {
        this.loggerService = logger;
    }

    public void logInfo(String info) {
        this.loggerService.log("Message: " + info);
    }
}
