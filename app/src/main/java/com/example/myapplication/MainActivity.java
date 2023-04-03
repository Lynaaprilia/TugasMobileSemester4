package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;
    Button btnBukaSatu, btnBukaDua, btnBukaTiga, btnBukaEmpat, btnBukaLima, btnBukaEnam, btnBukaTujuh, btnBukaDelapan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBukaSatu = (Button) findViewById(R.id.btnBukaSatu);
        btnBukaDua = (Button) findViewById(R.id.btnBukaDua);
        btnBukaTiga = (Button) findViewById(R.id.btnBukaTiga);
        btnBukaEmpat = (Button) findViewById(R.id.btnBukaEmpat);
        btnBukaLima = (Button) findViewById(R.id.btnBukaLima);
        btnBukaEnam = (Button) findViewById(R.id.btnBukaEnam);
        btnBukaTujuh = (Button) findViewById(R.id.btnBukaTujuh);
        btnBukaDelapan = (Button) findViewById(R.id.btnBukaDelapan);

        btnBukaSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaListView = new Intent(getApplicationContext(), ListView.class);
                startActivity(BukaListView);
            }
        });

        btnBukaDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BukaDua();
            }
        });

        btnBukaTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { BukaTiga(); }
        });

        btnBukaEmpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { BukaEmpat(); }
        });

        btnBukaLima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { BukaLima(); }
        });

        btnBukaEnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { BukaEnam(); }
        });

        btnBukaTujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { BukaTujuh(); }
        });

        btnBukaDelapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { BukaDelapan(); }
        });
    }

    public void BukaDua(){
        Intent BukaRecylerView = new Intent(getApplicationContext(), RecylerView.class);
        startActivity(BukaRecylerView);

    }

    public void BukaTiga(){
        Intent BukaFragment = new Intent(getApplicationContext(), Fragment.class);
        startActivity(BukaFragment);

    }

    public void BukaEmpat(){
        Intent BukaIntentExplicit = new Intent(getApplicationContext(), IntentExplicit.class);
        startActivity(BukaIntentExplicit);

    }

    public void BukaLima(){
        Intent BukaIntentImplicit = new Intent(getApplicationContext(), IntentImplicit.class);
        startActivity(BukaIntentImplicit);

    }

    public void BukaEnam(){
        Intent BukaCamera = new Intent(getApplicationContext(), CameraActivity.class);
        startActivity(BukaCamera);

    }

    public void BukaTujuh(){
        Intent BukaSubmit = new Intent(getApplicationContext(), submit.class);
        startActivity(BukaSubmit);

    }

    public void BukaDelapan(){
        Intent BukaScroll = new Intent(getApplicationContext(), ScrollActivity.class);
        startActivity(BukaScroll);

    }
}