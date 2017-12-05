package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models;

/**
 * Imports section
 */
import org.junit.Test;
import pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.services.MedicalInsurance;

import static org.junit.Assert.*;

/**
 * Class for testing medical insurance logic
 */
public class MedicalInsuranceTest {

    /**
     * Method for testing class methods
     */
    @Test public void medicalInsuranceTest(){
        double x = MedicalInsurance.getInstance().calcMedicalInsurance(250);
        double y = 22.5;
        assertEquals(y, x, 0);
        assertEquals(MedicalInsurance.getInstance().calcMedicalInsurance(1), 0.09, 0);
        assertEquals(MedicalInsurance.getInstance().calcMedicalInsurance(1504.15), 135.37, 0);
        assertNotEquals(MedicalInsurance.getInstance().calcMedicalInsurance(100), 10);
    }

}