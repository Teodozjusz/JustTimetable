package online.adambem.justtimetable.model;

public class Platform {

    private int trackAId;
    private int trackBId;

    public Platform() {}

    public Platform(int trackAId) {
        this.trackAId = trackAId;
    }

    public Platform(int trackAId, int trackBId) {
        this.trackAId = trackAId;
        this.trackBId = trackBId;
    }

    public int getTrackAId() {
        return trackAId;
    }

    public void setTrackAId(int trackAId) {
        this.trackAId = trackAId;
    }

    public int getTrackBId() {
        return trackBId;
    }

    public void setTrackBId(int trackBId) {
        this.trackBId = trackBId;
    }
}
