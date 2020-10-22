package io.pragra.learning;

public class Person {
 private String name;
 private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age < 49){
            this.age = age;
        }
        System.out.println("incorrect age");
    }

    public void printDetails(){
        System.out.println(name+" is " +age + " years old");
    }

}
