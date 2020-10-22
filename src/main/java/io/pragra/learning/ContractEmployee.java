package io.pragra.learning;

public class ContractEmployee implements IEmployee {
    @Override
    public void hire() {
        System.out.println("Hiring Temp");
    }

    @Override
    public void release() {
        System.out.println("Expiring the contract");
    }

    @Override
    public double salary() {
        return 60000;
    }

    @Override
    public String[] benefits() {
        return new String[] {"No benefits"};
    }
}
