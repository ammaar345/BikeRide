package Rides;

import bicycles.BicycleType;
import java.util.*;
public class FunRide {
    public int bikeCount;
    public int maxBikes;
    public int bikeCountForType;

    private List<String> list = new ArrayList<String>();
    public FunRide(int max) {
        this.maxBikes = max;
    }


    public void accept() {
        if (bikeCount < maxBikes) {
            bikeCount++;
        } else {
            return;
        }


    }

    public int getCountForType(BicycleType bikeType) {
//
        if (bikeType == BicycleType.Tandem) {
            this.bikeCountForType++;
            return bikeCountForType;
        }
        //bikeTypeCount;
        // }
        if (bikeType == BicycleType.RoadBike) {
            this.bikeCountForType++;
            return bikeCountForType;
        }
        if (bikeType == BicycleType.MountainBike) {
            this.bikeCountForType++;
            return bikeCountForType;
        }
//        }etc..
//
//        return bikeType;
    }

    public int getEnteredCount() {
        return bikeCount;


    }

}
