package com.example.advancedjavaprogramming;

public class CatPolymorphism extends AnimalPolymorphism{

   public CatPolymorphism(String animalName,String animalColor,int animalPower,int animalSpeed){

       super(animalName,animalColor,animalPower,animalSpeed);

    }

    @Override
    public int calculateTheOverallPowerOfAnimal() {
        return super.calculateTheOverallPowerOfAnimal();
    }

    @Override
    public String toString() {
        return "Cat : "+super.toString();
    }
}
