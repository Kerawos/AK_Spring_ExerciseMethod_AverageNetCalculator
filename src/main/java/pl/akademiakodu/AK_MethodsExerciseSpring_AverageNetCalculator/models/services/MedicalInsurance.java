package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;
import pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.FinancialData2017;

/**
 * Service responsible for calculations of potential medical insurance cost.
 */
@Service
public class MedicalInsurance {

    /**
     * In this example this service will be singleton
     */
    private static MedicalInsurance ourInstance = new MedicalInsurance();

    public static MedicalInsurance getInstance() {
        return ourInstance;
    }

    private MedicalInsurance() {
    }

    /**
     * Method calculate medical insurance cost
     * @param grossAfterZUS
     * @return medical insurance
     */
    public double calcMedicalInsurance(double grossAfterZUS){
        return FinancialData2017.roundFinancial(grossAfterZUS * FinancialData2017.getRateMedicalInsurance());
    }
}
