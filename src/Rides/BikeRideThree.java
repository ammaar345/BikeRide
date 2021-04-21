package Rides;

import bicycles.BikeRide;
import models.Bicycle;

public class BikeRideThree implements BikeRide {
    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();

    }


}
