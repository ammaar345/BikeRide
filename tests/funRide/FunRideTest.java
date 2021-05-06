package funRide;

import bicycles.BicycleType;
import org.junit.jupiter.api.Test;
import rides.FunRide;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {
    @Test
    public void shouldTestCountForTandem() {
        FunRide funRide = new FunRide(5);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.Tandem);

        assertEquals(funRide.getCountForType(BicycleType.Tandem), 3);
    }

    //
    @Test
    public void shouldTestCountForMtBike() {
        FunRide funRide = new FunRide(2);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.MountainBike);

        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 2);

    }

    @Test
    public void shouldTestCountForRoadBike() {
        FunRide funRide = new FunRide(4);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.RoadBike);
        assertEquals(funRide.getCountForType((BicycleType.RoadBike)), 4);
    }

    @Test
    public void shouldTestCountAllBikes() {
        FunRide funRide = new FunRide(10);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.MountainBike);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.Tandem);
        funRide.accept(BicycleType.RoadBike);
        funRide.accept(BicycleType.MountainBike);
        assertEquals(funRide.getEnteredCount(), 10);
    }

    @Test
    public void shouldTestAllCount2() {
        FunRide funRide = new FunRide(2);
        funRide.accept(BicycleType.Tandem);
        assertEquals(funRide.getEnteredCount(), 1);
    }
}
