package models;

import bicycles.BicycleType;

public class MountainBike extends BicycleBase {
    public void accelerate() {

        changeSpeed(+5);

    }

    public void brake() {

        changeSpeed(-3);

    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.MountainBike;
    }

}
