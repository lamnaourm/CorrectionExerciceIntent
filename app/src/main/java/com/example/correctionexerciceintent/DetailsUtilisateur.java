package com.example.correctionexerciceintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DetailsUtilisateur extends AppCompatActivity {

    ImageView im;
    TextView t1, t2, t3;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_utilisateur);

        im = findViewById(R.id.img);
         t1 = findViewById(R.id.nom);
         t2 = findViewById(R.id.prenom);
         t3 = findViewById(R.id.date);

         Utilisateur user = (Utilisateur) getIntent().getExtras().get("user");

         im.setImageResource(user.getImage());
         t1.setText("Nom : " + user.getNom());
         t2.setText("Prenom : " + user.getPrenom());
         SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
         t3.setText("Date naissance : "+ f.format(user.getDateNaissance()));

    }

    public void deconnecter(View view) {
         finish();
    }
}