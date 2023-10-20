package online.adambem.justtimetable.model;

import java.util.ArrayList;
import java.util.List;

public class Station {

    private String name;
    private List<Platform> platforms;

    public Station() {}

    public Station(String name) {
        this.name = name;
        this.platforms = new ArrayList<>();
    }

    public Station(String name, List<Platform> platforms) {
        this.name = name;
        this.platforms = platforms;
    }
}
