package bicycles;
import models.*;
import bicycles.BicycleFromSpec;
public  class BicycleFromSpec extends BicycleBase {

  BicycleSpecification bicycleSpecification=new BicycleSpecification(0,0);

    @Override
    public void accelerate() {
        bicycleSpecification.getAccelerationSpeed();


    }

    @Override
    public void brake() {
        bicycleSpecification.getBrakeSpeed();
    }
}
