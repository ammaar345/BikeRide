package models;

import bicycles.BikeRide;

public abstract class BikeRideOne implements BikeRide {

    public  void ride(Bicycle Tandem) {
       // Tandem tandem = new Tandem();
        Tandem.accelerate();
        Tandem.accelerate();
        Tandem.brake();
        Tandem.accelerate();
        System.out.println(Tandem.currentSpeed());

    }


}
