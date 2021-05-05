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
        //push bikeselected into the arraylist

        if (bikeCount < maxBikes) {
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
                //   return specificBikeList.size();
            }

            if (typeOfBike == "RoadBike") {
                specificBikeList.add(typeOfBike);
                //  return specificBikeList.size();
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
