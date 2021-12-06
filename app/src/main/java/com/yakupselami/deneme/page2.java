package com.yakupselami.deneme;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }
    public void play(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Adventure is beginning!");
        alert.setMessage("Are you sure?");
        alert.show();
        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Macera başlıyor!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(page2.this,page3.class);
                startActivity(intent);
            }
        }).show();

        alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Demek kaçıyorsun...", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(page2.this,Lose.class);
                startActivity(intent);
            }
        }).show();





    }

    public void exit(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Are you sure?");
        alert.show();
        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Seni korkak!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(page2.this,Lose.class);
                startActivity(intent);
            }
        }).show();

        alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Bayburt'un sana ihtiyacı var, geri dön!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(page2.this,page2.class);
                startActivity(intent);

            }
        }).show();





    }
}