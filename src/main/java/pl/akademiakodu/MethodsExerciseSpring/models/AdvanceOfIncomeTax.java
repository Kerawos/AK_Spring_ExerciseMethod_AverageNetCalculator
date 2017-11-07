package pl.akademiakodu.MethodsExerciseSpring.models;

public class AdvanceOfIncomeTax {

    private static AdvanceOfIncomeTax ourInstance = new AdvanceOfIncomeTax();

    public static AdvanceOfIncomeTax getInstance() {
        return ourInstance;
    }

    private AdvanceOfIncomeTax() {
    }

    public int calcAdvanceOfIncomeTax(double grossAfterZus, int distanceFromWorkPlace){
        //calc income cost
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

    public double calcIncomeCost(int distanceFromWorkPlace){
        if (isLocal(distanceFromWorkPlace)){
            return FinancialData2017.getIncomeAmountLocal();
        }
        return FinancialData2017.getIncomeAmountOutside();
    }

    public boolean isLocal(int distanceFromWorkPlace){
        if (distanceFromWorkPlace > FinancialData2017.getDistanceMaxToWork()){
            return false;
        }
        return true;
    }

    public double calcTempHealthTribute(double grossAfterZUS){
        return FinancialData2017.roundFinancial(grossAfterZUS * FinancialData2017.getTaxHealthTemp());
    }
}
