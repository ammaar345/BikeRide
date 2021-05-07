package rides;

import bicycles.BicycleType;

import java.util.*;

public class FunRide {
    public int bikeCount;
    public int maxBikes;
    public int bikeCountForType;
    private List<Object> bikeList = new ArrayList<Object>();

    public FunRide(int max) {
        this.maxBikes = max;
    }


    public void accept(BicycleType bicycleType) {
        if (bikeCount < maxBikes) {
            //push bikeSelected into the arraylist
            bikeList.add(bicycleType);
            bikeCount++;
        } else {
            bikeCount = bikeCount;
        }
    }

    public int getCountForType(BicycleType bicycleType) {
//
        List <Object>specificBikeList = new ArrayList<Object>();
        for (int i = 0; i < bikeList.size(); i++) {
            if (bicycleType == BicycleType.Tandem) {
                specificBikeList.add(bicycleType);
            }

            if (bicycleType == BicycleType.RoadBike) {
                specificBikeList.add(bicycleType);
            }
            if (bicycleType == BicycleType.MountainBike) {
                specificBikeList.add(bicycleType);
            }

        }
        return specificBikeList.size();

    }

    public int getEnteredCount() {
        return bikeCount;
    }

}
