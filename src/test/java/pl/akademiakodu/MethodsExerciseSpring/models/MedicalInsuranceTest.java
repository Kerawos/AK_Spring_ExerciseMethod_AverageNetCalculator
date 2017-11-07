package pl.akademiakodu.MethodsExerciseSpring.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedicalInsuranceTest {

    @Test
    public void medicalInsuranceTest(){
        double x = MedicalInsurance.getInstance().calcMedicalInsurance(250);
        double y = 22.5;
        assertEquals(y, x, 0);
        assertEquals(MedicalInsurance.getInstance().calcMedicalInsurance(1), 0.09, 0);
        assertEquals(MedicalInsurance.getInstance().calcMedicalInsurance(1504.15), 135.37, 0);
        assertNotEquals(MedicalInsurance.getInstance().calcMedicalInsurance(100), 10);
    }

}