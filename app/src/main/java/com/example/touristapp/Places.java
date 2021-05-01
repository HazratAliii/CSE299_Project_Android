package com.example.touristapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Places extends AppCompatActivity implements View.OnClickListener {

    private ImageView coxbazar;
    private ImageView sundarban;
    private ImageView rangamati;
    private ImageView kuakata;
    private Object Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        coxbazar = findViewById(R.id.coxsbazar);
        sundarban = findViewById(R.id.sundarban);
        rangamati = findViewById(R.id.rangamati);
        kuakata = findViewById(R.id.kuakata);

        coxbazar.setOnClickListener(this);
        sundarban.setOnClickListener(this);
        rangamati.setOnClickListener(this);
        kuakata.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.coxsbazar){
            Intent intent = new Intent(Places.this, coxsbazar.class);
            startActivity(intent);
        } else if(v.getId() == R.id.rangamati){
            Intent intent = new Intent(Places.this, rangamati.class);
            startActivity(intent);
        } else if(v.getId() == R.id.kuakata){
            Intent intent = new Intent(Places.this, kuakata.class);
            startActivity(intent);
        } else if(v.getId() == R.id.sundarban){
            Intent intent = new Intent(Places.this, sundarban.class);
            startActivity(intent);
        }
    }
}