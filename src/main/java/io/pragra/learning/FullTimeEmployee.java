package io.pragra.learning;

public class FullTimeEmployee implements IEmployee {


    @Override
    public void hire() {
        System.out.println("Hiring Full Time Employee.");
    }

    @Override
    public void release() {
        System.out.println("Terminating full time Employee.");
    }

    @Override
    public double salary() {
        return 45000;
    }

    @Override
    public String[] benefits() {
        return new String[] {"Medical Benefit", "Insurance", "Paid Holiday"};
    }
}
