package com.example.advancedjavaprogramming;

public class KickBoxingInterface extends BoxingInterface {

   private int kickPowerRequired;
    private int kickSpeedRequired;

    public KickBoxingInterface(String name, String rules, String uniform, int speedRequired,
                               int powerRequired, int punchingPowerRequired,
                               int punchingSpeedRequired, int costOfInsuranace,
                               int kickPowerRequired, int kickSpeedRequired) {
        super(name, rules, uniform, speedRequired, powerRequired, punchingPowerRequired, punchingSpeedRequired, costOfInsuranace);
        this.kickPowerRequired = kickPowerRequired;
        this.kickSpeedRequired = kickSpeedRequired;
    }

    public int getKickPowerRequired() {
        return kickPowerRequired;
    }

    public void setKickPowerRequired(int kickPowerRequired) {
        this.kickPowerRequired = kickPowerRequired;
    }

    public int getKickSpeedRequired() {
        return kickSpeedRequired;
    }

    public void setKickSpeedRequired(int kickSpeedRequired) {
        this.kickSpeedRequired = kickSpeedRequired;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %d%n%s: %d",super.toString(),
                "Kick Power Required",getKickPowerRequired(),
                "Kick Speed Requied",getKickSpeedRequired());
    }
}
