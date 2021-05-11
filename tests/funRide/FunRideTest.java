package funRide;

import models.MountainBike;
import models.RoadBike;
import models.Tandem;
import org.junit.jupiter.api.Test;
import rides.FunRide;

import bicycles.BicycleType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldTestCountForTandem() {
        FunRide funRide = new FunRide(5);
        Tandem tandem = new Tandem();
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(tandem);

        assertEquals(funRide.getCountForType(BicycleType.tandem), 3);
    }


    @Test
    public void shouldTestCountForMtBike() {
        FunRide funRide = new FunRide(4);
        MountainBike mountainBike = new MountainBike();
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);
        funRide.accept(mountainBike);

        assertEquals(funRide.getCountForType(BicycleType.mountainBike), 4);

    }

    @Test
    public void shouldTestCountForRoadBike() {
        FunRide funRide = new FunRide(4);
        RoadBike roadBike = new RoadBike();
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        funRide.accept(roadBike);
        assertEquals(funRide.getCountForType((BicycleType.roadBike)), 4);
    }

    @Test
    public void shouldTestCountAllBikes() {
        FunRide funRide = new FunRide(10);
        Tandem tandem = new Tandem();
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();
        funRide.accept(tandem);
        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(mountainBike);
        assertEquals(funRide.getEnteredCount(), 10);
    }

    @Test
    public void shouldTestAllCount2() {
        FunRide funRide = new FunRide(2);
        Tandem tandem = new Tandem();
        funRide.accept(tandem);
        assertEquals(funRide.getEnteredCount(), 1);
    }

    @Test
    public void shouldTestAllCount3() {
        FunRide funRide = new FunRide(5);
        Tandem tandem = new Tandem();
        MountainBike mountainBike = new MountainBike();
        RoadBike roadBike = new RoadBike();
        funRide.accept(roadBike);
        funRide.accept(tandem);
        funRide.accept(mountainBike);
        funRide.accept(tandem);
        funRide.accept(roadBike);
        funRide.accept(tandem);


        assertEquals(funRide.getEnteredCount(), 5);
    }
}
