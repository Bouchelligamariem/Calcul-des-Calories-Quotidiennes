package com.example.examen;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
public class second extends Activity  {
    Button b ;

    RadioButton b1 , b2 ;
    TextView t ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitysecond);
        b=findViewById(R.id.bt2);
        //g=findViewById(R.id.rg);
        b1=findViewById(R.id.rb1);
        b2=findViewById(R.id.rb2);
        t=findViewById(R.id.textview);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int age =getIntent().getIntExtra("age",0);
              double taille = getIntent().getDoubleExtra("taille",0.0);
              double hauteur =getIntent().getDoubleExtra("hauteur",0.0);
                if(b2.isChecked()) {
                  double calorique=100*taille+6.25*hauteur-5*age+5;
                  t.setText("Your required calorie intake is : "+calorique);
                }
                else if(b1.isChecked()) {
                    double calorique=100*taille+6.25*hauteur-5*age-161;
                    t.setText("Your required calorie intake is : "+calorique);
                }
                else{
                    Toast.makeText(getApplicationContext() , "veuillez choisir ton sexe ",Toast.LENGTH_SHORT  ).show();
                }
            }

        });

    }
}