package specification;

import bicycles.BicycleFromSpec;
import bicycles.BicycleSpecification;
import bicycles.BicycleType;
import models.Bicycle;
import models.MountainBike;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationTest {
    @Test
    public void shouldTestAccelerateMtBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        assertEquals(mountainBike.currentSpeed(), 15);
    }

    @Test
    public void shouldTestBrakeMtBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.brake();
        assertEquals(mountainBike.currentSpeed(), 13);
    }

    @Test
    public void shouldTestStopMtBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(5, 3, BicycleType.MountainBike);
        Bicycle mountainBike = new BicycleFromSpec(bicycleSpecification);
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.accelerate();
        mountainBike.stop();
        assertEquals(mountainBike.currentSpeed(), 0);
    }

    @Test
    public void shouldTestAccelerateRdBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.accelerate();
        assertEquals(roadBike.currentSpeed(), 33);

    }

    @Test
    public void shouldTestBrakeRdBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        roadBike.accelerate();
        roadBike.accelerate();
        roadBike.brake();
        assertEquals(roadBike.currentSpeed(), 26);
    }

    @Test
    public void shouldTestStopRdBike() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(11, 4, BicycleType.RoadBike);
        Bicycle roadBike = new BicycleFromSpec(bicycleSpecification);
        roadBike.accelerate();
        roadBike.brake();
        roadBike.stop();
        assertEquals(roadBike.currentSpeed(), 0);
    }

    @Test
    public void shouldTestAccelerateTandem() {
        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);
        tandem.accelerate();
        tandem.accelerate();
        tandem.accelerate();
        assertEquals(tandem.currentSpeed(), 36);
    }

    @Test
    public void shouldTestBrakeTandem() {

        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);
        tandem.accelerate();
        tandem.brake();
        tandem.accelerate();
        assertEquals(tandem.currentSpeed(), 31);
    }

    @Test
    public void shouldTestStopTandem() {

        BicycleSpecification bicycleSpecification = new BicycleSpecification(12, 7, BicycleType.Tandem);
        Bicycle tandem = new BicycleFromSpec(bicycleSpecification);
        tandem.accelerate();
        tandem.stop();
        assertEquals(tandem.currentSpeed(), 0);
    }
}
