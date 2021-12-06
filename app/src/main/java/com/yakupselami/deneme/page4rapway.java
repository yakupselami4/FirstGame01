package com.yakupselami.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class page4rapway extends AppCompatActivity {
    Button button6;
    Button button7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4rapway);

    }
    public void killa(View view){
        Random r= new Random();
        int a= r.nextInt();
        if(a>0){
            Toast.makeText(getApplicationContext(), "Win", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(page4rapway.this,Win.class);
            startActivity(intent);


        }else{
            Toast.makeText(getApplicationContext(), "Lose", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(page4rapway.this,Lose.class);
            startActivity(intent);

        }

    }
    public void uzi(View view){
        Random r= new Random();
        int b= r.nextInt();
        if(b>0){
            Toast.makeText(getApplicationContext(), "Win", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(page4rapway.this,Win.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(), "Lose", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(page4rapway.this,Lose.class);
            startActivity(intent);
        }

    }
}