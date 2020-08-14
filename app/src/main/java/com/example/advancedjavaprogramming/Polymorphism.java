package com.example.advancedjavaprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Polymorphism extends AppCompatActivity {

    private TextView txtAnimal,txtLion,txtPolymorphism,txtCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polymorphism);

        txtAnimal=findViewById(R.id.txtAnimal);
        txtLion=findViewById(R.id.txtLion);
        txtPolymorphism=findViewById(R.id.txtPolymorphism);
        txtCat=findViewById(R.id.txtCat);

        AnimalPolymorphism animalPolymorphism=new AnimalPolymorphism("Bear","Black",
                                                                    200,300);
        LionPolymorphism lionPolymorphism=new LionPolymorphism("myLion","Yellow",
                                             400,700,true,170);
      CatPolymorphism myCat=new CatPolymorphism("myCat","Black",500,700);

      AnimalPolymorphism animal2=myCat;
        txtAnimal.setText(animalPolymorphism.toString());
        txtLion.setText(lionPolymorphism.toString());

        AnimalPolymorphism myAnimal=lionPolymorphism;
       txtPolymorphism.setText(myAnimal.toString());

       txtCat.setText(animal2.toString());
    }
}