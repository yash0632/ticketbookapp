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

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public Map<String, LocalTime> getStationTimes() {
        return stationTimes;
    }

    public void setStationTimes(Map<String, LocalTime> stationTimes) {
        this.stationTimes = stationTimes;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }
}
