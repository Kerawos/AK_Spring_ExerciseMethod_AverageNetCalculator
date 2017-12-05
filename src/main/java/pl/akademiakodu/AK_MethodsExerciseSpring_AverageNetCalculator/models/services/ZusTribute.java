package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;
import pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.FinancialData2017;

/**
 * Service responsible for calculations of potential zus commission.
 */
@Service
public class ZusTribute {

    /**
     * In this example this service will be singleton
     */
    private static ZusTribute ourInstance = new ZusTribute();

    public static ZusTribute getInstance() {
        return ourInstance;
    }

    private ZusTribute() {
    }

    /**
     * Method to calculate all 3 zus tributes
     * @param totalGrossAmount
     * @return total zus commission
     */
    public double calcZUSTribute(double totalGrossAmount){
        double retirementContribution = calcRetirementContribution(totalGrossAmount);
        double pensionContribution = calcPensionContribution(totalGrossAmount);
        double sicknessContribution = calcSicknessContribution(totalGrossAmount);
        return FinancialData2017.roundFinancial(retirementContribution + pensionContribution + sicknessContribution);
    }

    /**
     * Method to calculate potential Retirement Contribution
     * @param grossAmount
     * @return
     */
    public double calcRetirementContribution(double grossAmount){
        return FinancialData2017.roundFinancial(grossAmount * FinancialData2017.getRateRetirementContribution());
    }

    /**
     * Method to calculate potential Pension Contribution
     * @param grossAmount
     * @return
     */
    public double calcPensionContribution(double grossAmount) {
        return FinancialData2017.roundFinancial(grossAmount * FinancialData2017.getRatePensionContribution());
    }

    /**
     * Method to calculate potential Sickness Contribution
     * @param grossAmount
     * @return
     */
    public double calcSicknessContribution(double grossAmount) {
        return FinancialData2017.roundFinancial(grossAmount * FinancialData2017.getRateSicknessContribution());
    }
}
