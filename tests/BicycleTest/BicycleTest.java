package BicycleTest;

import Rides.BikeRideOne;
import Rides.BikeRideThree;
import Rides.BikeRideTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import models.*;
import bicycles.*;

public class BicycleTest {
//    @Test
//    public void shouldTestBikeRideOneMountain() {
//        MountainBike mountainBike = new MountainBike();
//        BikeRideOne bikeRideOne = new BikeRideOne();
//        bikeRideOne.ride(mountainBike);
//        assertEquals(mountainBike.currentSpeed(), 17);
//    }
//
//    @Test
//    public void shouldTestBikeRideOneRoad() {
//        RoadBike roadBike = new RoadBike();
//        BikeRideOne bikeRideOne = new BikeRideOne();
//        bikeRideOne.ride(roadBike);
//        assertEquals(roadBike.currentSpeed(), 40);
//    }
//
//    @Test
//    public void shouldTestBikeRideOneTandem() {
//        Tandem tandem = new Tandem();
//        BikeRideOne bikeRideOne = new BikeRideOne();
//        bikeRideOne.ride(tandem);
//        assertEquals(tandem.currentSpeed(), 41);
//    }
//
//    @Test
//    public void shouldTestBikeRideTwoTandem() {
//        Tandem tandem = new Tandem();
//        BikeRideTwo bikeRideTwo = new BikeRideTwo();
//        bikeRideTwo.ride(tandem);
//        assertEquals(tandem.currentSpeed(), 60);
//    }
//
//    @Test
//    public void shouldTestBikeRideTwoMountain() {
//        MountainBike mountainBike = new MountainBike();
//        BikeRideTwo bikeRideTwo = new BikeRideTwo();
//        bikeRideTwo.ride(mountainBike);
//        assertEquals(mountainBike.currentSpeed(), 25);
//    }
//
//    @Test
//    public void shouldTestBikeRideTwoRoad() {
//        RoadBike roadBike = new RoadBike();
//        BikeRideTwo bikeRideTwo = new BikeRideTwo();
//        bikeRideTwo.ride(roadBike);
//        assertEquals(roadBike.currentSpeed(), 55);
//    }
//
//    @Test
//    public void shouldTestBikeRideThreeMountain() {
//        MountainBike mountainBike = new MountainBike();
//        BikeRideThree bikeRideThree = new BikeRideThree();
//        bikeRideThree.ride(mountainBike);
//        assertEquals(mountainBike.currentSpeed(), 0);
//    }
//
//    @Test
//    public void shouldTestBikeRideThreeRoad() {
//        RoadBike roadBike = new RoadBike();
//        BikeRideThree bikeRideThree = new BikeRideThree();
//        bikeRideThree.ride(roadBike);
//    }
//
//    @Test
//    public void shouldTestBikeRideThreeTandem() {
//        Tandem tandem = new Tandem();
//        BikeRideThree bikeRideThree = new BikeRideThree();
//        bikeRideThree.ride(tandem);
//        assertEquals(tandem.currentSpeed(), 0);
//
//    }

    @Test
    public void shouldTestRideOneRoadBk() {
        // RoadBike
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);

        // use one of your classes that implements BikeRide
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();
        assertEquals(bicycle.currentSpeed(), 48);
    }

    @Test
    public void shouldTestRideTwoRoadBk() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride();
        assertEquals(bicycle.currentSpeed(), 55);
    }

    @Test
    public void shouldTestRideThreeRoadBk() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, 4);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);
        bikeRideThree.ride();
        assertEquals(bicycle.currentSpeed(), 0);
    }

    @Test
    public void shouldTestRideOneMtBk() {
        BicycleSpecification mtBikeSpec = new BicycleSpecification(5, 3);
        Bicycle bicycle = new BicycleFromSpec(mtBikeSpec);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();
        assertEquals(bicycle.currentSpeed(), 23);
    }

    @Test
    public void shouldTestRideTwoMtBk() {


        BicycleSpecification mtBikeSpec = new BicycleSpecification(5, 3);
        Bicycle bicycle = new BicycleFromSpec(mtBikeSpec);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride();
        assertEquals(bicycle.currentSpeed(), 25);
    }

    @Test
    public void shouldTestRideThreeMtBk() {

        BicycleSpecification mtBikeSpec = new BicycleSpecification(5, 3);
        Bicycle bicycle = new BicycleFromSpec(mtBikeSpec);
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);
        bikeRideThree.ride();
        assertEquals(bicycle.currentSpeed(), 0);
    }

    @Test
    public void shouldTestRideOneTandem() {
        BicycleSpecification tandemBike = new BicycleSpecification(12, 7);
        Bicycle bicycle = new BicycleFromSpec(tandemBike);
        BikeRideOne bikeRideOne = new BikeRideOne(bicycle);
        bikeRideOne.ride();
        assertEquals(bicycle.currentSpeed(), 55);
    }

    @Test
    public void shouldTestRideTwoTandem() {
        BicycleSpecification tandemBike = new BicycleSpecification(12, 7);
        Bicycle bicycle = new BicycleFromSpec(tandemBike);
        BikeRideTwo bikeRideTwo = new BikeRideTwo(bicycle);
        bikeRideTwo.ride();
        assertEquals(bicycle.currentSpeed(), 60);
    }

    @Test
    public void shouldTestRideThreeTandem() {
        BicycleSpecification tandemBike = new BicycleSpecification(12, 7);
        Bicycle bicycle = new BicycleFromSpec(tandemBike);
        BikeRideThree bikeRideThree = new BikeRideThree(bicycle);
        bikeRideThree.ride();
        assertEquals(bicycle.currentSpeed(), 0);
    }
    // MountainBike
//        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, 3);
//        Bicycle mountainBike = new BicycleFromSpec(mountainBikeSpec);
//
//        // use one of your classes that implements BikeRide
//        BikeRide mBikeRide = new YourBikeRideImplementationHere(mountainBike);
//        mBikeRide.ride();

}