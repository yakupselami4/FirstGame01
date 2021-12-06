package com.yakupselami.deneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }
    public void rap(View view){
        Intent intent = new Intent(page3.this,page4rapway.class);
        startActivity(intent);

    }
    public void fight(View view){
        Intent intent = new Intent(page3.this,page4rfighterway.class);
        startActivity(intent);

    }
}