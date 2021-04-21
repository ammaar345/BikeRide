package models;

import bicycles.BikeRide;

public class BikeRideTwo implements BikeRide {
    public void ride(Bicycle bicycle) {

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
    }


}
