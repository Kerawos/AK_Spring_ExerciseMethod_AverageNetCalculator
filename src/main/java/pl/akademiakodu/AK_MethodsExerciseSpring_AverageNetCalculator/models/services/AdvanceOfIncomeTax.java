package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;
import pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models.FinancialData2017;

/**
 * Service responsible for calculations of potential advance of income tax.
 */
@Service
public class AdvanceOfIncomeTax {

    /**
     * In this example this service will be singleton
     */
    private static AdvanceOfIncomeTax ourInstance = new AdvanceOfIncomeTax();

    public static AdvanceOfIncomeTax getInstance() {
        return ourInstance;
    }

    private AdvanceOfIncomeTax() {
    }

    /**
     * Method calculate advance of income tax
     * @param grossAfterZus already calculated gross salary after zus tribute
     * @param distanceFromWorkPlace
     * @return advance of income tax
     */
    public int calcAdvanceOfIncomeTax(double grossAfterZus, int distanceFromWorkPlace){
        double advanceForIncomeTax = grossAfterZus - calcIncomeCost(distanceFromWorkPlace);
        if (advanceForIncomeTax < FinancialData2017.getIncomeTaxThreshold()){
            advanceForIncomeTax =  FinancialData2017.roundFinancial((advanceForIncomeTax * FinancialData2017.getTaxThresholdFirst()));
        } else {
            advanceForIncomeTax = FinancialData2017.roundFinancial((advanceForIncomeTax * FinancialData2017.getTaxThresholdSecond()));
        }
        advanceForIncomeTax-=FinancialData2017.getAmountFreeOfTax();
        advanceForIncomeTax-=calcTempHealthTribute(grossAfterZus);
        return (int)advanceForIncomeTax;
    }

    /**
     * Method calculate cost of income
     * @param distanceFromWorkPlace
     * @return
     */
    public double calcIncomeCost(int distanceFromWorkPlace){
        if (isLocal(distanceFromWorkPlace)){
            return FinancialData2017.getIncomeAmountLocal();
        }
        return FinancialData2017.getIncomeAmountOutside();
    }

    /**
     * Method checks if user is life nearby work area
     * @param distanceFromWorkPlace
     * @return
     */
    public boolean isLocal(int distanceFromWorkPlace){
        if (distanceFromWorkPlace > FinancialData2017.getDistanceMaxToWork()){
            return false;
        }
        return true;
    }

    /**
     * Method calculate health insurance commission
     * @param grossAfterZUS
     * @return
     */
    public double calcTempHealthTribute(double grossAfterZUS){
        return FinancialData2017.roundFinancial(grossAfterZUS * FinancialData2017.getTaxHealthTemp());
    }
}
