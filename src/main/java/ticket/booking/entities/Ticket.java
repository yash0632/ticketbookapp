package ticket.booking.entities;

import java.util.*;

public class Ticket {
    private String ticketId;
    private String userId;
    private String source;
    private String destination;
    private String dateOfTravel;


    private Train train;

    public Ticket(String ticketId,String userId,String source,String destination,String dateOfTravel) {
        this.ticketId = ticketId;
        this.userId = userId;
        this.source = source;
        this.destination= destination;
        this.dateOfTravel = dateOfTravel;
    }

    public String getTicketId() {
        return this.ticketId;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getDateOfTravel() {
        return this.dateOfTravel;
    }

    public Train getTrain() {
        return this.train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public void setDateOfTravel(String dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }


}
