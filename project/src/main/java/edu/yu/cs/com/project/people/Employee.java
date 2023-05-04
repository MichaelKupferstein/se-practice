package edu.yu.cs.com.project.people;


public class Employee extends Person {

    private double hours;
    private String position;
    private boolean isOn = false;

    public Employee(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.ID = id;
    }

    public double getHours() {
        return hours;
    }

    public String getPosition() {
        return position;
    }

    public void setIsOn(){
        this.isOn = true;
    }

    public boolean isOn(){
        return this.isOn;
    }
}
