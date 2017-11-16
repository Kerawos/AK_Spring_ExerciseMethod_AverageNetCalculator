package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models;

public class ZusTribute {
    private static ZusTribute ourInstance = new ZusTribute();

    public static ZusTribute getInstance() {
        return ourInstance;
    }

    private ZusTribute() {
    }

    public double calcZUSTribute(double totalGrossAmount){
//        //todo
//        return 0;
        double retirementContribution = calcRetirementContribution(totalGrossAmount);
        double pensionContribution = calcPensionContribution(totalGrossAmount);
        double sicknessContribution = calcSicknessContribution(totalGrossAmount);
        return FinancialData2017.roundFinancial(retirementContribution + pensionContribution + sicknessContribution);
    }

    public double calcRetirementContribution(double grossAmount){
//        //todo
//        return 0;
        return FinancialData2017.roundFinancial(grossAmount * FinancialData2017.getRateRetirementContribution());
    }

    public double calcPensionContribution(double grossAmount) {
//        //todo
//        return 0;
        return FinancialData2017.roundFinancial(grossAmount * FinancialData2017.getRatePensionContribution());
    }

    public double calcSicknessContribution(double grossAmount) {
//        //todo
//        return 0;
        return FinancialData2017.roundFinancial(grossAmount * FinancialData2017.getRateSicknessContribution());
    }
}
