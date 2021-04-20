package models;

public abstract class BicycleBase implements Bicycle {
    private int speed;

    protected void changeSpeed(int speedFactor) {
speed=speed+speedFactor;

    }

    public void stop() {

        speed = 0;
    }

    public int currentSpeed() {

        return speed;
    }
}
