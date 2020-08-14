package com.example.advancedjavaprogramming;

public class LaptopComputerAbstractClass extends ComputerAbstractClass {

    private String mouse;
    private String touchPad;
    private double cpuPower;
    private double ram;

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public LaptopComputerAbstractClass(String name, String screen, String keyboard, String mouse, String touchPad,
                                       double cpuPower, double ram) {
        super(name, screen, keyboard);
        this.mouse=mouse;
        this.touchPad = touchPad;
        this.cpuPower = cpuPower;
        this.ram = ram;
    }

    public String getTouchPad() {
        return touchPad;
    }

    public void setTouchPad(String touchPad) {
        this.touchPad = touchPad;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {
        this.cpuPower = cpuPower;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    @Override
    public double evaluatePerformance() {
        return getCpuPower()*getRam();
    }

    @Override
    public String toString() {
        return String.format("%s%n %s: %s%n%s: %s",super.toString(),"Touch Pad",getTouchPad(),"Mouse",getMouse());

    }
}
