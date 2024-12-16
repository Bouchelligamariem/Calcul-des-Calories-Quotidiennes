package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b ;
EditText e1, e2 ,e3 ;
TextView t1, t2 ,t3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        e3=findViewById(R.id.et3);
        t1=findViewById(R.id.tt1);
        t2=findViewById(R.id.tt2);
        t3=findViewById(R.id.tt3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String age = e1.getText().toString();
                String taille =e3.getText().toString();
                String hauteur = e2.getText().toString() ;
                if (age.isEmpty()|| taille.isEmpty()|| hauteur.isEmpty()) {
                    Toast.makeText(MainActivity.this, "veillez saisir votre coordonné ", Toast.LENGTH_SHORT).show();
                }
                else{
                    try {

                        int valeurage = Integer.parseInt(age);
                        double valeurtaille = Double.parseDouble(taille);
                        double valeurhauteur = Double.parseDouble(hauteur);

                        Intent intent = new Intent(MainActivity.this, second.class);
                        intent.putExtra("age", valeurage);
                        intent.putExtra("taille", valeurtaille);
                        intent.putExtra("hauteur", valeurhauteur);
                        
                        startActivity(intent);
                    }catch(NumberFormatException e){
                        Toast.makeText(MainActivity.this, "saisir des nombre valide ! ", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });

    }
}
