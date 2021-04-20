package models;
import bicycles.BikeRide;
public abstract class BikeRideThree implements BikeRide{
public static void ride (){
    MountainBike mountainBike = new MountainBike();
    mountainBike.accelerate();
    mountainBike.accelerate();
    mountainBike.accelerate();
    mountainBike.accelerate();
    mountainBike.stop();
    System.out.println(mountainBike.currentSpeed());

}

    public static void main(String[] args) {
        ride();
    }
}
