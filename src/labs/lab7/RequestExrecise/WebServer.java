package labs.lab7.RequestExrecise;

import java.util.ArrayList;
import java.util.List;

public class WebServer {
    private List<Request> requests = new ArrayList<>(); 

    public void addRequest(Request r) {
        requests.add(r);
    }

    public void getRequestStats() {
        int count200 = 0;
        int count404 = 0;
        int count500 = 0;

        for (Request r : requests) {
            if (r.getStatusCode() == 200) count200++;
            else if (r.getStatusCode() == 404) count404++;
            else if (r.getStatusCode() == 500) count500++;
        }

        System.out.println("200 OK: " + count200);
        System.out.println("404 Not Found: " + count404);
        System.out.println("500 Server Error: " + count500);
    }
}
