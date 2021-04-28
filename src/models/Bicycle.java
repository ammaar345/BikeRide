package models;

import bicycles.BicycleType;

public interface Bicycle {

    void accelerate();

    void brake();

    int currentSpeed();

    BicycleType getBicycleType();

    void stop();

}
