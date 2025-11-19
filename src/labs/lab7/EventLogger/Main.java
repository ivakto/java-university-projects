package labs.lab7.EventLogger;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventLog log = new EventLog();

        log.addEvent("2021-01-01", "Нова година");
        log.addEvent("2025-03-08", "8-ми март");
        log.addEvent("2022-07-01", "Лято");

        List<Event> filtered = log.getEventsBetween("2020-01-01", "2026-06-01");

        for (Event e : filtered) {
            System.out.println(e);
        }
    }
}
