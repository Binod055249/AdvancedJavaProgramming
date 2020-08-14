package com.example.advancedjavaprogramming;

public class SmartPhoneComputerAbstractClass extends ComputerAbstractClass {

    private String operatingSystem;
    private double cpuPower;
    private double ram;

    public SmartPhoneComputerAbstractClass(String name, String screen, String keyboard,
                                           String operatingSystem, double cpuPower, double ram) {
        super(name, screen, keyboard);
        if(cpuPower<=0){
            throw new IllegalArgumentException("The value of the cpuPower must be greater than 0");
        }
        if(ram<=0){
            throw  new IllegalArgumentException("The value of the Ram must be greater than 0");
        }
        this.operatingSystem = operatingSystem;
        this.cpuPower = cpuPower;
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {

        if(cpuPower<=0) {
            throw new IllegalArgumentException("The value of the cpuPower must be greater than 0");
        }
                    this.cpuPower = cpuPower;
        }


    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
    if(ram<=0){
        throw new IllegalArgumentException("The value of the ram must be greater than 0");
    }
        this.ram = ram;
    }


    @Override
    public double evaluatePerformance() {
    return getCpuPower()*getRam();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %f%n%s: %f",super.toString(),"CPU Power",getCpuPower(),"Ram",getRam());
    }
}
