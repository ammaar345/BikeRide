package models;
import bicycles.BikeRide;
public abstract class BikeRideThree implements BikeRide{
public  void ride (Bicycle MountainBike){
//    MountainBike mountainBike = new MountainBike();
    MountainBike.accelerate();
    MountainBike.accelerate();
    MountainBike.accelerate();
    MountainBike.accelerate();
    MountainBike.stop();
    System.out.println(MountainBike.currentSpeed());

}


}
