package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models;

/**
 * Imports section
 */
import org.junit.Test;
import pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.services.ZusTribute;

import static org.junit.Assert.*;

/**
 * Class for testing zus commission logic
 */
public class ZusTributeTest {

    /**
     * Method for testing class methods
     */
    @Test public void zusTest(){
        double x = ZusTribute.getInstance().calcZUSTribute(250);
        double y = 34.28;
        assertEquals(y, x, 0);
        assertEquals(ZusTribute.getInstance().calcZUSTribute(1), 0.14, 0);
        assertEquals(ZusTribute.getInstance().calcZUSTribute(1504.15), 206.22, 0);
        assertNotEquals(ZusTribute.getInstance().calcZUSTribute(100), 10);
    }

}