package labs.lab7.EventLogger;

import java.time.LocalDate;

public class Event {
    private LocalDate date;
    private String description;

    public Event(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return date + " - " + description;
    }
}
