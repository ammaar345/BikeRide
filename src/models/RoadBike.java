package models;
//
//import models.Bicycle;

public class RoadBike implements Bicycle {
private int speed;
    @Override
    public void accelerate() {
speed=speed+11;
    }

    @Override
    public void brake() {
speed=speed-4;
    }

    @Override
    public int currentSpeed() {
        return speed;
    }

    @Override
    public void stop() {
speed=0;
    }
}
