package com.example.advancedjavaprogramming;

public class LionPolymorphism extends AnimalPolymorphism {

    private boolean canFight=true;
    private int fightingPower;

    public LionPolymorphism(String animalName,String animalColor,int animalPower,int animalSpeed,
                     boolean canFight,int fightingPower){

        super(animalName,animalColor,animalPower,animalSpeed);

        if(fightingPower<=0){
            throw new IllegalArgumentException("The Value Of Fighting Power must be greater than 0");
        }
        this.canFight=canFight;
        this.fightingPower=fightingPower;
    }

    public boolean getCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    public int getFightingPower() {
        return fightingPower;
    }

    public void setFightingPower(int fightingPower) {
        this.fightingPower = fightingPower;
    }

    @Override
    public int calculateTheOverallPowerOfAnimal() {
        return super.calculateTheOverallPowerOfAnimal()+fightingPower;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %b%n%s: %d",super.toString(),
                "Can our Lion Fight",getCanFight(),"The Fighting power Of our Lion is",getFightingPower());
    }
}
