package bicycles;
import models.*;
import bicycles.BicycleFromSpec;
public  class BicycleFromSpec extends BicycleBase {
    BicycleSpecification bicycleSpecification;

   public BicycleFromSpec (BicycleSpecification bicycle) {
       this.bicycleSpecification = bicycle;
   }
    @Override
    public void accelerate() {
//        BicycleSpecification bicycleSpecification=new BicycleSpecification(0,0);


    this.changeSpeed(this.bicycleSpecification.getAccelerationSpeed());


    }

    @Override
    public void brake() {

//        BicycleSpecification bicycleSpecification=new BicycleSpecification(0,0);

     this.changeSpeed(this.bicycleSpecification.getBrakeSpeed());
    }
}