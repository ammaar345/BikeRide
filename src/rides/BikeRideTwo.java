package rides;

import bicycles.BikeRide;
import models.Bicycle;

public class BikeRideTwo implements BikeRide {
    private Bicycle bicycle;

    public BikeRideTwo(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void ride() {

        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
        bicycle.accelerate();
    }
}
