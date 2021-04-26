package bicycles;

public  class BicycleSpecification {

//    public static Object BicycleType;
    private BicycleType bicycleType;
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(int speed, int brake,BicycleType bicycleType) {
        this.accelerationSpeed = speed;
        this.brakeSpeed = brake;
        this.bicycleType = bicycleType;
    }
    public BicycleType getBicycleType(){
        return bicycleType;
    }
    public int getAccelerationSpeed() {
        return accelerationSpeed;

    }

    public int getBrakeSpeed() {
        return brakeSpeed;

    }

}
