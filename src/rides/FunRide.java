package rides;

import bicycles.BicycleSpecification;
import bicycles.BicycleType;
import models.*;
import bicycles.BicycleFromSpec;

import java.util.*;

public class FunRide {
    public int bikeCount;
    public int maxBikes;
    private ArrayList<Bicycle> bikeList = new ArrayList<>();

    public FunRide(int max) {
        this.maxBikes = max;
    }


    public void accept(Bicycle bicycle) {
        if (bikeCount < maxBikes /*&& !bikeList.contains(bicycle)*/) {
            //push bikeSelected into the arraylist
            bikeList.add(bicycle);
            bikeCount++;
        }
    }

    public int getCountForType(BicycleType bicycleType) {

        int specificBikeList = 0;
        for (Bicycle bicycle : bikeList) {
            if (bicycleType == bicycle.getBicycleType()) {
                specificBikeList++;
            }
        }
        return specificBikeList;

    }

    public int getEnteredCount() {
        return bikeCount;
    }

}
