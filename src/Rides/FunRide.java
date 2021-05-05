package Rides;

import bicycles.BicycleType;

import java.util.*;

public class FunRide {
    public int bikeCount;
    public int maxBikes;
    public int bikeCountForType;
    private List<String> bikeList = new ArrayList<String>();

    public FunRide(int max) {
        this.maxBikes = max;
    }


    public void accept(String bikeSelected) {
        if (bikeCount < maxBikes) {
            //push bikeSelected into the arraylist
            bikeList.add(bikeSelected);
            bikeCount++;
        } else {
            bikeCount = bikeCount;
        }
    }

    public int getCountForType(String typeOfBike) {
//
        List specificBikeList = new ArrayList<String>();
        for (int i = 0; i < bikeList.size(); i++) {
            if (typeOfBike == "Tandem") {
                specificBikeList.add(typeOfBike);
            }

            if (typeOfBike == "RoadBike") {
                specificBikeList.add(typeOfBike);
            }
            if (typeOfBike == "MountainBike") {
                specificBikeList.add(typeOfBike);
            }

        }
        return specificBikeList.size();

    }

    public int getEnteredCount() {
        return bikeCount;
    }

}
