package com.example.advancedjavaprogramming;

public class AnimalPolymorphism {

    private String animalName;
    private String animalColor;
    private int animalPower;
    private int animalSpeed;

    public AnimalPolymorphism(String animalName,String animalColor,int animalPower,int animalSpeed){

        if(animalPower<=0){
            throw new IllegalArgumentException("The Value of Animal Power must be greater than 0");
        }
        if(animalSpeed<=0){
            throw new IllegalArgumentException("The value of Animal Speed must be greater than 0");
        }

        this.animalName=animalName;
        this.animalColor=animalColor;
        this.animalPower=animalPower;
        this.animalSpeed=animalSpeed;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public int getAnimalPower() {
        return animalPower;
    }

    public void setAnimalPower(int animalPower) {
        this.animalPower = animalPower;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public void setAnimalSpeed(int animalSpeed) {
        this.animalSpeed = animalSpeed;
    }

    public int calculateTheOverallPowerOfAnimal(){

        return getAnimalPower()*getAnimalSpeed();
    }

    @Override
    public String toString() {

        return String.format("%s : %s%n%s : %s%n%s : %d%n%s : %d",
                "Animal Name",getAnimalName(),"Animal Color",getAnimalColor(),
                "Animal Power",getAnimalPower(),"Animal Speed",getAnimalSpeed());
    }
}
