package pl.akademiakodu.AK_MethodsExerciseSpring_AverageNetCalculator.models;

/**
 * A Employee class that represents the data that will be stored from the data source.
 */
public class Employee {

    /**
     * Variables declarations
     */
    private double gross;
    private double bonus;
    private int distanceFromWork;

    /**
     * Constructors
     */
    public Employee() {
    }

    public Employee(double gross, double bonus, int distanceFromWork) {
        this.gross = gross;
        this.bonus = bonus;
        this.distanceFromWork = distanceFromWork;
    }

    /**
     * Getters and setters section
     */
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
