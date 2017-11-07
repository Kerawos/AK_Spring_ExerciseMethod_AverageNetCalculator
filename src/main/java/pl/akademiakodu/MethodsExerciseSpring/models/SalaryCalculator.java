package pl.akademiakodu.MethodsExerciseSpring.models;

public class SalaryCalculator {

    //method to calculate net salary from gross
    public double salaryNetCalculator(double grossAmount, double bonus, int distanceFromWorkPlace){
        //todo
        //1 calc total base
        //2 calc zus tribute
        //3 calc healthTribute
        //4 calc advanceForIncomeTax
        return 0;

//        //1 calc total base
//        double grossBase = grossAmount + bonus;
//        if (grossBase<1){
//            throw new IllegalArgumentException("Gross Base must be bigger than 0");
//        }
//        if (distanceFromWorkPlace<0){
//            throw new IllegalArgumentException("Distance from work must be positive!");
//        }
//
//        //2 calc zus tribute
//        double zusTribute = ZusTribute.getInstance().calcZUSTribute(grossBase);
//        double grossAfterZus = grossBase - zusTribute;
//
//        //3 calc healthTribute
//        double healthTribute = MedicalInsurance.getInstance().calcMedicalInsurance(grossAfterZus);
//
//        //4 calc advanceForIncomeTax
//        double advanceForIncomeTax = AdvanceOfIncomeTax.getInstance().calcAdvanceOfIncomeTax(grossAfterZus, distanceFromWorkPlace);
//
//        return FinancialData2017.roundFinancial(grossBase - zusTribute - healthTribute - advanceForIncomeTax);
    }
}
