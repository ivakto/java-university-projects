package labs.lab7.EventLogger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventLog {
    
    private List<Event> events = new ArrayList<>(); // List to store events

    public void addEvent(String date, String description) {
        // Assuming date is in ISO format (YYYY-MM-DD)
        LocalDate d = LocalDate.parse(date); 
        events.add(new Event(d, description)); // Create and add new event
    }

    public List<Event> getEventsBetween(String from, String to) {
        LocalDate start = LocalDate.parse(from); // Parse the from date
        LocalDate end = LocalDate.parse(to);     // Parse the to date

        List<Event> result = new ArrayList<>(); // List to store filtered events

        for (Event e : events) { // Iterate through all events
            
            if (!e.getDate().isBefore(start) && !e.getDate().isAfter(end)) { 
                result.add(e);
            }
        }
        return result; // Return the filtered list
    }
}
