package com.example.myutils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myutils.ViewModel.CarViewModel;

public class MainActivity extends AppCompatActivity {

    public CarViewModel carViewModel;
    public ACApp acApp;
    public static MainActivity mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivity = this;
        carViewModel = DaggerCarViewModelInjector.create().getCarViewModel().getCar();

//        Car hondaCar = DICarFactory.getCar();
//        hondaCar.driveCar();

    }

    public static Activity getInstance(){
        return mainActivity;
    }
    public void OpenAc()
    {
        startActivity(new Intent(getApplicationContext(),ACApp.class));
    }
}
