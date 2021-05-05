package rides;
import bicycles.BicycleType;
import Rides.BikeRideOne;
import Rides.BikeRideThree;
import Rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.*;
import bicycles.*;

public class RidesTest {
    @Test
    public void shouldTestRideOneRoadBk() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4,BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);


        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();
        assertEquals(bicycle.currentSpeed(), 48);
    }

    @Test
    public void shouldTestRideTwoRoadBk() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4,BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride();
        assertEquals(bicycle.currentSpeed(), 55);
    }

    @Test
    public void shouldTestRideThreeRoadBk() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);
        bikeRideThree.ride();
        assertEquals(bicycle.currentSpeed(), 0);
    }

    @Test
    public void shouldTestRideOneMtBk() {
        BicycleSpecification mtBikeSpec = new BicycleSpecification(5, 3,BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mtBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();
        assertEquals(bicycle.currentSpeed(), 23);
    }

    @Test
    public void shouldTestRideTwoMtBk() {


        BicycleSpecification mtBikeSpec = new BicycleSpecification(5, 3,BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mtBikeSpec);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride();
        assertEquals(bicycle.currentSpeed(), 25);
    }

    @Test
    public void shouldTestRideThreeMtBk() {

        BicycleSpecification mtBikeSpec = new BicycleSpecification(5, 3,BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(mtBikeSpec);
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);
        bikeRideThree.ride();
        assertEquals(bicycle.currentSpeed(), 0);
    }

    @Test
    public void shouldTestRideOneTandem() {
        BicycleSpecification tandemBike = new BicycleSpecification(12, 7,BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemBike);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();
        assertEquals(bicycle.currentSpeed(), 55);
    }
//
    @Test
    public void shouldTestRideTwoTandem() {
        BicycleSpecification tandemBike = new BicycleSpecification(12, 7,BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemBike);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride();
        assertEquals(bicycle.currentSpeed(), 60);
    }
//
    @Test
    public void shouldTestRideThreeTandem() {
        BicycleSpecification tandemBike = new BicycleSpecification(12, 7,BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(tandemBike);
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);
        bikeRideThree.ride();
        assertEquals(bicycle.currentSpeed(), 0);
    }

}