package FunRideTest;

import org.junit.jupiter.api.Test;
import Rides.FunRide;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldTestCountForTandem() {
        FunRide funRide = new FunRide(5);
        funRide.accept("Tandem");
        funRide.accept("Tandem");
        funRide.accept("Tandem");
        System.out.println(funRide.getCountForType("Tandem"));
    }

    @Test
    public void shouldTestCountForMtBike() {
        FunRide funRide = new FunRide(2);
        funRide.accept("MountainBike");
        funRide.accept("MountainBike");
        funRide.accept("MountainBike");
        funRide.accept("MountainBike");
        funRide.accept("MountainBike");
        funRide.accept("MountainBike");
        System.out.println(funRide.getCountForType("MountainBike"));
    }

    @Test
    public void shouldTestCountForRoadBike() {
        FunRide funRide = new FunRide(4);
        funRide.accept("RoadBike");
        funRide.accept("RoadBike");
        funRide.accept("RoadBike");
        funRide.accept("RoadBike");
        funRide.accept("RoadBike");
        System.out.println(funRide.getCountForType("RoadBike"));
    }

    @Test
    public void shouldTestCountAllBikes() {
        FunRide funRide = new FunRide(10);
        funRide.accept("Tandem");
        funRide.accept("MountainBike");
        funRide.accept("Tandem");
        funRide.accept("RoadBike");
        funRide.accept("MountainBike");
        funRide.accept("Tandem");
        funRide.accept("Tandem");
        funRide.accept("RoadBike");
        funRide.accept("Tandem");
        funRide.accept("RoadBike");
        funRide.accept("MountainBike");
        System.out.println(funRide.getEnteredCount());
        assertEquals(funRide.getEnteredCount(), 10);
    }
    @Test

    public void shouldTestAllCount2(){
        FunRide funRide = new FunRide(2);
        funRide.accept("Tandem");
        assertEquals(funRide.getEnteredCount(),1);
    }
}
