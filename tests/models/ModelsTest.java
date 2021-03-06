package models;

//import bicycles.Bicycle;

import models.*;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModelsTest {
    @Test
    public void shouldTestAcceleratingAndBrakingRoadBike() {
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.brake();
        roadBike.accelerate();
        assertEquals(roadBike.currentSpeed(), 18);
//        RoadBike.accelerate();
    }

    @Test
    public void shouldTestAcceleratingMultipleTimes() {
        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        assertEquals(roadBike.currentSpeed(), 44);
    }

    @Test
    public void shouldTestStopMethodRoadBike() {

        RoadBike roadBike = new RoadBike();
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.brake();
        roadBike.brake();
        roadBike.stop();
        assertEquals(roadBike.currentSpeed(), 0);
    }

    @Test
    public void shouldTestAcceleratingAndBrakingMtBike() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.brake();
        mountainBike.accelerate();
        assertEquals(mountainBike.currentSpeed(), 9);
    }

    @Test
    public void shouldTestAcceleratingMultipleTimesMtBike() {
        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.accelerate();
        assertEquals(mountainBike.currentSpeed(), 10);
    }

    @Test
    public void shouldTestStopMethodMtBike() {

        MountainBike mountainBike = new MountainBike();
        mountainBike.accelerate();
        mountainBike.brake();
        mountainBike.stop();
        assertEquals(mountainBike.currentSpeed(), 0);
    }

    @Test
    public void shoutTestAccelerateAndBrakeTandem() {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.brake();
        tandem.accelerate();
        tandem.accelerate();
        assertEquals(tandem.currentSpeed(), 29);
    }

    @Test
    public void shouldTestTandemAccelerate() {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();
        assertEquals(tandem.currentSpeed(), 36);
    }

    @Test
    public void shouldTestTandemStop() {
        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.brake();
        tandem.accelerate();
        tandem.brake();
        tandem.stop();
        assertEquals(tandem.currentSpeed(), 0);
    }
}