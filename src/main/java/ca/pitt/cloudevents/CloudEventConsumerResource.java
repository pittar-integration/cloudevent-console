package ca.pitt.cloudevents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ce")
public class CloudEventConsumerResource {

    private List<String> cloudEvents;

    public CloudEventConsumerResource() {
        this.cloudEvents = new ArrayList<>();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void postCloudEvent(String data) {
        System.err.println("Data: " + data);
        cloudEvents.add(data);
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public EventsDTO getCloudEvents() {
        List<String> sentEvents = new ArrayList<>(cloudEvents);
        cloudEvents.clear();
        return new EventsDTO(sentEvents);
    }
}
