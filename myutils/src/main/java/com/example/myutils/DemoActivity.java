package com.example.myutils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myutils.ViewModel.CarViewModel;

public class DemoActivity extends AppCompatActivity {

    public CarViewModel carViewModel;
    public ACApp acApp;
    public static DemoActivity demoActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        demoActivity = this;
        carViewModel = DaggerCarViewModelInjector.create().getCarViewModel().getCar();

//        Car hondaCar = DICarFactory.getCar();
//        hondaCar.driveCar();

       // OpenAc(getApplicationContext());
    }

    public static void OpenAc(Context context)
    {
        Intent login = new Intent(context, ACApp.class);
        login.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(login);
    }


}
