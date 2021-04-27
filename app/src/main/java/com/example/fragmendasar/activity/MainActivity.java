package com.example.fragmendasar.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragmendasar.R;
import com.example.fragmendasar.fragment.About;
import com.example.fragmendasar.fragment.Help;
import com.example.fragmendasar.fragment.Home;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btnHome, btnAbout, btnHelp, btnExit;

    Home fragmentHome;
    About fragmentAbout;
    Help fragmentHelp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHome = findViewById(R.id.btn_home);
        btnAbout = findViewById(R.id.btn_about);
        btnHelp = findViewById(R.id.btn_help);
        btnExit = findViewById(R.id.btn_exit);

        btnHome.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
        btnHelp.setOnClickListener(this);
        btnExit.setOnClickListener(this);

    }

    void menuHome() {
        fragmentHome = new Home();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHome);
        ft.commit();
    }

    void menuAbout() {
        fragmentAbout = new About();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentAbout);
        ft.commit();
    }

    void menuHelp() {
        fragmentHelp = new Help();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHelp);
        ft.commit();
    }

    void menuExit() {
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == btnHome) {
            menuHome();
        }
        if (v == btnAbout) {
            menuAbout();
        }
        if (v == btnHelp) {
            menuHelp();
        }
        if (v == btnExit) {
            menuExit();
        }
    }
}