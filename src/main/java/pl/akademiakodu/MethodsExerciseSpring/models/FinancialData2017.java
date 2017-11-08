package pl.akademiakodu.MethodsExerciseSpring.models;

//holder for financial statics from 2017
public class FinancialData2017 {

    //declaration & initialization our variables
    private static final double incomeTaxThreshold = 7127.333333333333;
    private static final double taxThresholdFirst = 0.18;
    private static final double taxThresholdSecond = 0.32;
    private static final double taxHealthTemp = 0.075;
    private static final double amountFreeOfTax = 46.33;
    private static final double incomeAmountLocal = 112.25;
    private static final double incomeAmountOutside = 139.06;
    private static final double rateMedicalInsurance = 0.09;
    private static final double rateRetirementContribution = 0.0976;
    private static final double ratePensionContribution = 0.015;
    private static final double rateSicknessContribution = 0.0245;
    private static final int distanceMaxToWork = 10;

    //method to rounded two decimal places (without using BigDecimals)
    public static double roundFinancial( double amountToRounded){
        return Math.round(amountToRounded*100.0)/100.0;
    }

    public static double getIncomeTaxThreshold() {
        return incomeTaxThreshold;
    }

    public static double getTaxThresholdFirst() {
        return taxThresholdFirst;
    }

    public static double getTaxThresholdSecond() {
        return taxThresholdSecond;
    }

    public static double getTaxHealthTemp() {
        return taxHealthTemp;
    }

    public static double getAmountFreeOfTax() {
        return amountFreeOfTax;
    }

    public static double getIncomeAmountLocal() {
        return incomeAmountLocal;
    }

    public static double getIncomeAmountOutside() {
        return incomeAmountOutside;
    }

    public static double getRateMedicalInsurance() {
        return rateMedicalInsurance;
    }

    public static double getRateRetirementContribution() {
        return rateRetirementContribution;
    }

    public static double getRatePensionContribution() {
        return ratePensionContribution;
    }

    public static double getRateSicknessContribution() {
        return rateSicknessContribution;
    }

    public static int getDistanceMaxToWork() {
        return distanceMaxToWork;
    }
}
