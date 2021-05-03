package Rides;

import bicycles.BicycleType;

public class FunRide {
    public int bikeCount;
    public int maxBikes;
    public BicycleType bicycleType;

    //public int count;
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
//
        if (bikeType == BicycleType.Tandem) {
            return //bikeTypeCount;
            // }
            if (bikeType == BicycleType.RoadBike) {
                return //bikeTypeCount;
            }
                if (bikeType == BicycleType.MountainBike) {
                    return //bikeTypeCount;
                }
//        }etc..
//
//        return bikeType;
                }

            }
