package pl.akademiakodu.MethodsExerciseSpring.models.employees;

public class Employee {
    private double gross;
    private double bonus;
    private int distanceFromWork;

    public Employee() {
    }

    public Employee(double gross, double bonus, int distanceFromWork) {
        this.gross = gross;
        this.bonus = bonus;
        this.distanceFromWork = distanceFromWork;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getDistanceFromWork() {
        return distanceFromWork;
    }

    public void setDistanceFromWork(int distanceFromWork) {
        this.distanceFromWork = distanceFromWork;
    }
}
