package models;

import bicycles.BicycleType;

public interface Bicycle {

     void accelerate();
      void brake();
//BicycleType BicycleType();
          int currentSpeed();
 BicycleType getBicycleType();
      void stop();

}
