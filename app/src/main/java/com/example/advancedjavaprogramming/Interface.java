package com.example.advancedjavaprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Interface extends AppCompatActivity {

    private TextView txtPolymorphism;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface);

        txtPolymorphism=findViewById(R.id.txtPolymorphism);

        LifeInsuranceInterface[] lifeInsuranceInterface=new LifeInsuranceInterface[3];
        lifeInsuranceInterface[0]=new StudentInterface("Jhon","Android Development",1000);
        lifeInsuranceInterface[1]=new BoxingInterface("Boxing","Fighting by using only hands",
                "Boxing Uniform",1000,800,2000,
                5000,6000);
        lifeInsuranceInterface[2]=new KickBoxingInterface("KickBoxing","Fighting by Punching And Kicking",
                "kickBoxing Uniform",2000,3000,4000,
        7000,3000,5000,2000);

        String oldTxtPolymorphism;
        for(LifeInsuranceInterface insuranceObject:lifeInsuranceInterface){

            oldTxtPolymorphism=txtPolymorphism.getText().toString();

             txtPolymorphism.setText(String.format(oldTxtPolymorphism+"%s%n%s: %f%n%n%n ",
                    insuranceObject.toString(),"Life Insurance Cost",insuranceObject.evaluateCostOfInsurance()));
        }
    }
}