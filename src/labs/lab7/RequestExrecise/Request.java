package labs.lab7.RequestExrecise;

public class Request {
    private String url;
    private int statusCode;

    public Request(String url, int statusCode) {
        this.url = url;
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return url + " : " + statusCode;
    }
}
