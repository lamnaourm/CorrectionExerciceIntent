package com.example.correctionexerciceintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;

public class DetailsUtilisateur extends AppCompatActivity {

    ArrayList<Utilisateur> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_utilisateur);

        users.add(new Utilisateur("login1","pass1","Thomas","Yan", new Date(88,1,19),R.drawable.image1));
        users.add(new Utilisateur("login2","pass2","Mohamed","Tyn", new Date(68,2,13),R.drawable.image2));
        users.add(new Utilisateur("login3","pass3","Nicolas","Kid", new Date(95,3,16),R.drawable.image3));
        users.add(new Utilisateur("login4","pass4","Zaid","Man", new Date(66,8,17),R.drawable.image4));
        users.add(new Utilisateur("login5","pass5","Riayd","San", new Date(83,9,19),R.drawable.image5));
        users.add(new Utilisateur("login6","pass6","Isabelle","Babilot", new Date(87,11,10),R.drawable.image6));
        users.add(new Utilisateur("login7","pass7","Nicole","Depelchin", new Date(100,4,4),R.drawable.image7));
        users.add(new Utilisateur("login8","pass8","James","Tan", new Date(86,5,6),R.drawable.image8));
    }
}