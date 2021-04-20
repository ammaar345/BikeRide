package models;

import bicycles.BikeRide;

public abstract class BikeRideTwo implements BikeRide {
  public static void ride (){

      RoadBike roadBike = new RoadBike();
roadBike.accelerate();
roadBike.accelerate();
roadBike.brake();
roadBike.brake();
roadBike.brake();
roadBike.brake();
System.out.println(roadBike.currentSpeed());
  }

    public static void main(String[] args) {
        ride();
    }
}
