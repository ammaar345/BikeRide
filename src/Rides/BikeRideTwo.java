package Rides;

import bicycles.BikeRide;
import models.Bicycle;

public class BikeRideTwo implements BikeRide {
    public void ride(Bicycle bicycle) {

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
    }


}
