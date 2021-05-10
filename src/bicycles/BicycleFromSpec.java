package bicycles;

import models.*;
import bicycles.BicycleFromSpec;

public class BicycleFromSpec extends BicycleBase {
    BicycleSpecification bicycleSpecification;

    public BicycleFromSpec(BicycleSpecification bicycle) {

        this.bicycleSpecification = bicycle;

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
