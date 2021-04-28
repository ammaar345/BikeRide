package Rides;

import bicycles.BicycleType;

public class FunRide {
    public int bikeCount;
    public int maxBikes;
    public BicycleType bicycleType;

    public FunRide(int max, BicycleType bicycleType) {
        this.maxBikes = max;
        this.bicycleType = bicycleType;


    }


    public void accept() {
        if (bikeCount < maxBikes) {
            bikeCount++;
        } else {
            return;
        }


    }

    public BicycleType getCountForType(BicycleType bikeType) {
//        if (//biketype){
//            return //bikeTypeCount;
//
//        }etc..
//
//        return bikeType;
    }

}
