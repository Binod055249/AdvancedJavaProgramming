package com.example.advancedjavaprogramming;

public class BoxingInterface extends SportInterface {

    private int punchingPowerRequired;
    private int punchingSpeedRequired;
    private int costOfInsuranace;

    public BoxingInterface(String name, String rules, String uniform, int speedRequired, int powerRequired,
                           int punchingPowerRequired, int punchingSpeedRequired, int costOfInsuranace) {
        super(name, rules, uniform, speedRequired, powerRequired);
        this.punchingPowerRequired = punchingPowerRequired;
        this.punchingSpeedRequired = punchingSpeedRequired;
        this.costOfInsuranace = costOfInsuranace;
    }

    public int getPunchingPowerRequired() {
        return punchingPowerRequired;
    }

    public void setPunchingPowerRequired(int punchingPowerRequired) {
        this.punchingPowerRequired = punchingPowerRequired;
    }

    public int getPunchingSpeedRequired() {
        return punchingSpeedRequired;
    }

    public void setPunchingSpeedRequired(int punchingSpeedRequired) {
        this.punchingSpeedRequired = punchingSpeedRequired;
    }

    @Override
    public double evaluateCostOfInsurance() {
        return costOfInsuranace;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %d%n%s: %d",super.toString(),
                "Punching Power Required",getPunchingPowerRequired(),
                "Punching Speed Required",getPunchingSpeedRequired());
    }
}
