package models;

import bicycles.BicycleType;

public class RoadBike extends BicycleBase {

    public void accelerate() {
        changeSpeed(+11);
    }


    public void brake() {
        changeSpeed(-4);
    }

    @Override
    public BicycleType getBicycleType() {
        return BicycleType.roadBike;
    }

}
