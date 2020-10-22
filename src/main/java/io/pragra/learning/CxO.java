package io.pragra.learning;

public class CxO extends Manager{
    private double incentive;

    public CxO(String name, int age, int empID, int hourlyRates, double bonus, double incentive) {
        super(name, age, empID, hourlyRates, bonus);
        this.incentive = incentive;
    }

    @Override
    public double salary() {
        return super.salary()+incentive;
    }
}