package com.example.advancedjavaprogramming;

public class StudentInterface implements LifeInsuranceInterface {

    private String name;
    private String courseName;
   private int costOfInsurance;

    public StudentInterface(String name, String courseName, int costOfInsurance) {
        this.name = name;
        this.courseName = courseName;
        this.costOfInsurance = costOfInsurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCostOfInsurance() {
        return costOfInsurance;
    }

    public void setCostOfInsurance(int costOfInsurance) {
        this.costOfInsurance = costOfInsurance;
    }

    @Override
    public double evaluateCostOfInsurance() {
        return getCostOfInsurance();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %s","Name",getName(),
                "Course Name",getCourseName());
    }
}
