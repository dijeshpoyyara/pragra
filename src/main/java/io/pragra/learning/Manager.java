package io.pragra.learning;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, int age, int empID, int hourlyRates, double bonus) {
        super(name, age, empID, hourlyRates);
        this.bonus = bonus;
    }

    @Override
    public double salary(){
        return super.salary()+bonus;
    }
}
