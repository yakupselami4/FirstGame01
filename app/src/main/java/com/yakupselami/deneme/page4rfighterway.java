package com.yakupselami.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class page4rfighterway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4rfighterway);
    }
    public void byburt69(View view) {
        Random r = new Random();
        int a = r.nextInt();
        if (a > 0) {
            Toast.makeText(getApplicationContext(), "Win", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(page4rfighterway.this, Win.class);
            startActivity(intent);


        } else {
            Toast.makeText(getApplicationContext(), "Lose", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(page4rfighterway.this, Lose.class);
            startActivity(intent);
        }
    }


    public void lavas(View view ){
            Random r= new Random();
            int a= r.nextInt();
            if(a>0){
                Toast.makeText(getApplicationContext(), "Win", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(page4rfighterway.this, Win.class);
                startActivity(intent);


            }else{
                Toast.makeText(getApplicationContext(), "Lose", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(page4rfighterway.this, Lose.class);
                startActivity(intent);
        }

    }
}