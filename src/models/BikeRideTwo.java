package models;

import bicycles.BikeRide;

public abstract class BikeRideTwo implements BikeRide {
  public  void ride (Bicycle RoadBike){

//      RoadBike roadBike = new RoadBike();
      RoadBike.accelerate();
      RoadBike.accelerate();
      RoadBike.brake();
      RoadBike.brake();
      RoadBike.brake();
      RoadBike.brake();
System.out.println(RoadBike.currentSpeed());
  }


}
