package models;

public class RoadBike extends BicycleBase {
    @Override
    public void accelerate() {
changeSpeed(+11);
    }

    @Override
    public void brake() {
changeSpeed(-4);
    }

}
