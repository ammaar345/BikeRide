package models;

import bicycles.Bicycle;

public class MountainBike implements Bicycle {
    private int speed;
    @Override
    public void accelerate() {
speed=speed+5;
    }

    @Override
    public void brake() {
speed=speed-3;
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
