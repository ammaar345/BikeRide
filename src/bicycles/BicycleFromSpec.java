package bicycles;

import models.*;
import bicycles.BicycleFromSpec;

public class BicycleFromSpec extends BicycleBase {
    BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {

        this.bicycleSpecification = bicycleSpecification;

    }

    @Override
    public void accelerate() {

        this.changeSpeed(this.bicycleSpecification.getAccelerationSpeed());


    }

    @Override
    public void brake() {
        this.changeSpeed(-this.bicycleSpecification.getBrakeSpeed());
    }


    public BicycleType getBicycleType() {
        return this.bicycleSpecification.getBicycleType();
    }

}
