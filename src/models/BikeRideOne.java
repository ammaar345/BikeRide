package models;

import bicycles.BikeRide;

public abstract class BikeRideOne implements BikeRide {
    public void ride(Tandem tandem) {
//        Tandem tandem = new Tandem();
        tandem.accelerate();
        tandem.accelerate();
        tandem.brake();
        tandem.accelerate();
        System.out.println(tandem.currentSpeed());

    }

    public void main(String[] args) {
        ride();
    }
}
