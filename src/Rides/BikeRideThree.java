package Rides;

import bicycles.BikeRide;
import models.Bicycle;

public class BikeRideThree implements BikeRide {
    private Bicycle bicycle;
    public BikeRideThree (Bicycle bicycle) {
        this.bicycle = bicycle;
    }
    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();

    }


    @Override
    public void ride() {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.stop();
    }
}
