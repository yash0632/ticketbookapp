package ticket.booking.entities;

import java.util.*;
import java.time.*;

public class Train {
    private String trainId;
    private List<List<Integer>> seats;
    private String trainNo;
    private Map<String,LocalTime> stationTimes;

    private List<String> stations;

    public Train(String trainId,List<List<Integer>> seats,String trainNo,Map<String,LocalTime> stationTimes,List<String> stations) {
        this.trainId = trainId;
        this.seats = seats;
        this.trainNo = trainNo;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    
}
