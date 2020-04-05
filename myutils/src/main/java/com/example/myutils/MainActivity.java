package com.example.myutils;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myutils.ViewModel.CarViewModel;

public class MainActivity extends AppCompatActivity {

    public CarViewModel carViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carViewModel = DaggerCarViewModelInjector.create().getCarViewModel().getCar();

//        Car hondaCar = DICarFactory.getCar();
//        hondaCar.driveCar();

    }
}
