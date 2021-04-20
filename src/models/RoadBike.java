package models;

public class RoadBike extends BicycleBase {

    public void accelerate() {
changeSpeed(+11);
    }


    public void brake() {
changeSpeed(-4);
    }

}
