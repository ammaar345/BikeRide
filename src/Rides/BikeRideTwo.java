package Rides;

import bicycles.BikeRide;
import models.Bicycle;

public class BikeRideTwo implements BikeRide {
    private Bicycle bicycle;
    public BikeRideTwo (Bicycle bicycle) {
        this.bicycle = bicycle;
    }
    public void ride(Bicycle bicycle) {

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
    }


}
