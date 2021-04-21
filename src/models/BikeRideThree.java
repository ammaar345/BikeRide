package models;

import bicycles.BikeRide;

public class BikeRideThree implements BikeRide {
    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();

    }


}
