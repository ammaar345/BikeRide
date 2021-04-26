package Rides;

import bicycles.BikeRide;
import models.Bicycle;

public class BikeRideOne implements BikeRide {
    private Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {

        this.bicycle= bicycle;
    }

    public void ride(Bicycle bicycle) {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();

    }


    @Override
    public void ride() {
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate();
    }
}
