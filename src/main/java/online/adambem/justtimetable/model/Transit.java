package online.adambem.justtimetable.model;

import java.time.LocalTime;

public class Transit {

    private Train train;
    private LocalTime start;

    public Transit() {
    }

    public Transit(Train train, LocalTime start) {
        this.train = train;
        this.start = start;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }
}
