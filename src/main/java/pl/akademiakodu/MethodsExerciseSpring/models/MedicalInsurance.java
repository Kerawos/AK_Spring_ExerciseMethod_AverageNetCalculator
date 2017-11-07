package pl.akademiakodu.MethodsExerciseSpring.models;

public class MedicalInsurance {

    private static MedicalInsurance ourInstance = new MedicalInsurance();

    public static MedicalInsurance getInstance() {
        return ourInstance;
    }

    private MedicalInsurance() {
    }

    public double calcMedicalInsurance(double grossAfterZUS){
        return FinancialData2017.roundFinancial(grossAfterZUS * FinancialData2017.getRateMedicalInsurance());
    }
}
