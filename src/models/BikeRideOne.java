package models;

import bicycles.BikeRide;

public class BikeRideOne implements BikeRide {

    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();

    }


}
