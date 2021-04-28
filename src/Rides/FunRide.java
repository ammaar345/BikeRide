package Rides;

public class FunRide {
    public int bikeCount;
    public int maxBikes;

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

    public int getCountForType(Biketype bikeType) {

    }

}
