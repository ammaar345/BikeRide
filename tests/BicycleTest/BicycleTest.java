package BicycleTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import models.*;
import bicycles.*;
public class BicycleTest {
    @Test
    public void shouldTestBikeRideOneMountain() {
        MountainBike mountainBike = new MountainBike();
        BikeRideOne bikeRideOne = new BikeRideOne();
        bikeRideOne.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(), 17);
    }

    @Test
    public void shouldTestBikeRideOneRoad() {
        RoadBike roadBike = new RoadBike();
        BikeRideOne bikeRideOne = new BikeRideOne();
        bikeRideOne.ride(roadBike);
        assertEquals(roadBike.currentSpeed(), 40);
    }

    @Test
    public void shouldTestBikeRideOneTandem() {
        Tandem tandem = new Tandem();
        BikeRideOne bikeRideOne = new BikeRideOne();
        bikeRideOne.ride(tandem);
        assertEquals(tandem.currentSpeed(), 41);
    }

    @Test
    public void shouldTestBikeRideTwoTandem() {
        Tandem tandem = new Tandem();
        BikeRideTwo bikeRideTwo = new BikeRideTwo();
        bikeRideTwo.ride(tandem);
        assertEquals(tandem.currentSpeed(), 60);
    }

    @Test
    public void shouldTestBikeRideTwoMountain() {
        MountainBike mountainBike = new MountainBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo();
        bikeRideTwo.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(), 25);
    }

    @Test
    public void shouldTestBikeRideTwoRoad() {
        RoadBike roadBike = new RoadBike();
        BikeRideTwo bikeRideTwo = new BikeRideTwo();
        bikeRideTwo.ride(roadBike);
        assertEquals(roadBike.currentSpeed(), 55);
    }

    @Test
    public void shouldTestBikeRideThreeMountain() {
        MountainBike mountainBike = new MountainBike();
        BikeRideThree bikeRideThree = new BikeRideThree();
        bikeRideThree.ride(mountainBike);
        assertEquals(mountainBike.currentSpeed(), 0);
    }

    @Test
    public void shouldTestBikeRideThreeRoad() {
        RoadBike roadBike = new RoadBike();
        BikeRideThree bikeRideThree = new BikeRideThree();
        bikeRideThree.ride(roadBike);
    }

    @Test
    public void shouldTestBikeRideThreeTandem() {
        Tandem tandem = new Tandem();
        BikeRideThree bikeRideThree = new BikeRideThree();
        bikeRideThree.ride(tandem);
        assertEquals(tandem.currentSpeed(), 0);

    }

    @Test
   public void shouldBread(){
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);

        // use one of your classes that implements BikeRide
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();

        // MountainBike
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);

        // use one of your classes that implements BikeRide
        BikeRide mBikeRide = new YourBikeRideImplementationHere(mountainBike);
        mBikeRide.ride();
    }
}