package seminars.sem3.DependencyInjection;

public class ConsoleLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println(message);
    }

}
