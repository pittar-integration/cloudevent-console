package ca.pitt.cloudevents;

import java.util.ArrayList;
import java.util.List;

public class EventsDTO {

    private List<String> events;

    public EventsDTO() {
        this.events = new ArrayList<>();
    }

    public EventsDTO(List<String> events) {
        this.events = events;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }
    
    @Override
    public String toString() {
        String result = "Events: \n";
        for (String event : events) {
            result += "    " + event + "\n";
        }
        return result;
    }
    
}
