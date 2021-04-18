package BicycleTest;

import bicycles.Bicycle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTest {
    @Test
    public void shouldAccelerate() {

        Bicycle bicycle = new Bicycle();
        bicycle.accelerate();
        assertEquals(5, bicycle.currentSpeed());
    }


}
