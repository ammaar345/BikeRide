package models;

import bicycles.BicycleType;

public abstract class BicycleBase implements Bicycle {
    private int speed;

    protected void changeSpeed(int speedFactor) {

        speed = speed + speedFactor;

    }

    public void stop() {

        speed = 0;
    }

    public int currentSpeed() {
        if (speed < 0) {
            return 0;
        } else {
            return speed;
        }
    }
}
