package online.adambem.justtimetable.repository;

import online.adambem.justtimetable.model.*;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SampleRepository {

    public SampleRepository() {

        List<Platform> zachodniaPlatforms = Arrays.asList(
                new Platform(1, 2),
                new Platform(3, 4),
                new Platform(5, 6));
        Station zachodnia = new Station("Warszawa Zachodnia", zachodniaPlatforms);
        Stop zachodniaStop = new Stop(zachodnia, 0, 1);


        List<Platform> ochotaPlatforms = Arrays.asList(
                new Platform(1, 2),
                new Platform(3, 4),
                new Platform(5, 6));
        Station ochota = new Station("Warszawa Ochota", ochotaPlatforms);
        Stop ochotaStop = new Stop(ochota, 2, 1);

        List<Platform> srodmiesciePlatforms = Arrays.asList(
                new Platform(1, 2),
                new Platform(3, 4),
                new Platform(5, 6));
        Station srodmiescie = new Station("Warszawa Śródmieście", srodmiesciePlatforms);
        Stop srodmiesiceStop = new Stop(srodmiescie, 5, 2);

        List<Platform> wschodniaPlatforms = Arrays.asList(
                new Platform(1, 2),
                new Platform(3, 4),
                new Platform(5, 6));
        Station wschodnia = new Station("Warszawa Wchodnia", wschodniaPlatforms);
        Stop wschodniaStop = new Stop(zachodnia, 7, 1);

        List<Stop> stops = List.of(zachodniaStop, ochotaStop, srodmiesiceStop, wschodniaStop);

        Train train1 = new Train("Wołodymir");
        Train train2 = new Train("Karol");
        Train train3 = new Train("Tadzik");

        Transit transit1 = new Transit(train1, LocalTime.of(10, 00, 00));
        Transit transit2 = new Transit(train2, LocalTime.of(11, 00, 00));
        Transit transit3 = new Transit(train3, LocalTime.of(12, 00, 00));

        List<Transit> transits = List.of(transit1, transit2, transit3);

        Line S1 = new Line(stops, transits);

    }
}
