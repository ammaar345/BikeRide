package bicycles;

public  class BicycleSpecification {
    private int accelerationSpeed;
    private int brakeSpeed;

    public BicycleSpecification(int speed, int brake) {
        this.accelerationSpeed = speed;
        this.brakeSpeed = brake;

    }

    public int getAccelerationSpeed() {
        return accelerationSpeed;

    }

    public int getBrakeSpeed() {
        return brakeSpeed;

    }
}
