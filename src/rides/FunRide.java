package rides;

import bicycles.BicycleType;
import models.*;

import java.util.*;

public class FunRide {
    public int bikeCount;
    public int maxBikes;
    private List<Object> bikeList = new ArrayList<Object>();

    public FunRide(int max) {
        this.maxBikes = max;
    }


    public void accept(Bicycle bicycle) {
        if (bikeCount < maxBikes) {
            //push bikeSelected into the arraylist
            bikeList.add(bicycle);
            bikeCount++;
        } else {
            bikeCount = bikeCount;
        }
    }

        public int getCountForType(BicycleType bicycleType) {
//
        List <Object>specificBikeList = new ArrayList<Object>();
        for (int i = 0; i < bikeList.size(); i++) {
            if (bicycleType == BicycleType.tandem) {
                specificBikeList.add(bicycleType);
            }

            if (bicycleType == BicycleType.roadBike) {
                specificBikeList.add(bicycleType);
            }
            if (bicycleType == BicycleType.mountainBike) {
                specificBikeList.add(bicycleType);
            }

        }
        return specificBikeList.size();

    }

    public int getEnteredCount() {
        return bikeCount;
    }

}
