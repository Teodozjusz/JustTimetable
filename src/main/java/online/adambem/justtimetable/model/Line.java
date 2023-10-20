package online.adambem.justtimetable.model;

import java.util.List;

public class Line {

    private String name;
    private List<Stop> stops;
    private List<Transit> transits;

    public Line() {
    }

    public Line(String name, List<Stop> stops, List<Transit> transits) {
        this.name = name;
        this.stops = stops;
        this.transits = transits;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    public List<Transit> getTransits() {
        return transits;
    }

    public void setTransits(List<Transit> transits) {
        this.transits = transits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
