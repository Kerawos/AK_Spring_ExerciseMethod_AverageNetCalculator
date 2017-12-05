package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;
import pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.FinancialData2017;

/**
 * Service responsible for general calculations of potential net salary.
 */
@Service
public class SalaryCalculator {

    /**
     * Method to calculate net salary from gross
     * @param grossAmount
     * @param bonus
     * @param distanceFromWorkPlace
     * @return net salary
     */
    public double salaryNetCalculator(double grossAmount, double bonus, int distanceFromWorkPlace){

        //1 calc total base
        double grossBase = grossAmount + bonus;
        if (grossBase<1){
            throw new IllegalArgumentException("Gross Base must be bigger than 0");
        }
        if (distanceFromWorkPlace<0){
            throw new IllegalArgumentException("Distance from work must be positive!");
        }

        //2 calc zus tribute
        double zusTribute = ZusTribute.getInstance().calcZUSTribute(grossBase);
        double grossAfterZus = grossBase - zusTribute;

        //3 calc healthTribute
        double healthTribute = MedicalInsurance.getInstance().calcMedicalInsurance(grossAfterZus);

        //4 calc advanceForIncomeTax
        double advanceForIncomeTax = AdvanceOfIncomeTax.getInstance().calcAdvanceOfIncomeTax(grossAfterZus, distanceFromWorkPlace);

        return FinancialData2017.roundFinancial(grossBase - zusTribute - healthTribute - advanceForIncomeTax);
    }
}
