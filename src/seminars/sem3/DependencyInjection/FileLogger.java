package seminars.sem3.DependencyInjection;

public class FileLogger implements Logger{
    private static final String fileName = "file.log";

    @Override
    public void log(String message) {
        System.out.println("Text in file: '" + fileName + "': " + message);
    }
}
