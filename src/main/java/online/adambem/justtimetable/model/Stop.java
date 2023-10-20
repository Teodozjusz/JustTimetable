package online.adambem.justtimetable.model;

public class Stop {

    private Station station;
    private int minutesFromStart;
    private int durationOfStop;

    public Stop() {
    }

    public Stop(Station station, int minutesFromStart, int durationOfStop) {
        this.station = station;
        this.minutesFromStart = minutesFromStart;
        this.durationOfStop = durationOfStop;

    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public int getMinutesFromStart() {
        return minutesFromStart;
    }

    public void setMinutesFromStart(int minutesFromStart) {
        this.minutesFromStart = minutesFromStart;
    }

    public int getDurationOfStop() {
        return durationOfStop;
    }

    public void setDurationOfStop(int durationOfStop) {
        this.durationOfStop = durationOfStop;
    }
}
