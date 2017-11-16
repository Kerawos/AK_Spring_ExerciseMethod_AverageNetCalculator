package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models;

public class MedicalInsurance {

    private static MedicalInsurance ourInstance = new MedicalInsurance();

    public static MedicalInsurance getInstance() {
        return ourInstance;
    }

    private MedicalInsurance() {
    }

    public double calcMedicalInsurance(double grossAfterZUS){
//        //todo
//        return 0;
        return FinancialData2017.roundFinancial(grossAfterZUS * FinancialData2017.getRateMedicalInsurance());
    }
}
