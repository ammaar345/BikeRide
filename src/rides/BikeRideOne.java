package rides;

import bicycles.BikeRide;
import models.Bicycle;

public class BikeRideOne implements BikeRide {
    private Bicycle bicycle;

    public BikeRideOne(Bicycle bicycle) {

        this.bicycle = bicycle;
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
