package io.pragra.learning;

public class Employee  extends Person{
    private int empID;
    private int hourlyRates;

    public Employee(String name, int age, int empID, int hourlyRates) {
        super(name, age);
        this.empID = empID;
        this.hourlyRates = hourlyRates;
    }



    public void printDetails(){
        super.printDetails();
        System.out.println(super.getName() + "His/Her employee ID is : " + empID + " and salary is :"+salary());
    }

    public double salary(){
        return hourlyRates*21*8;
    }

}
