package labs.lab7.RequestExrecise;

public class Main {
    public static void main(String[] args) {
        WebServer server = new WebServer();

        server.addRequest(new Request("/home", 200));
        server.addRequest(new Request("/login", 404));
        server.addRequest(new Request("/api/data", 200));

        server.getRequestStats();
    }
}
