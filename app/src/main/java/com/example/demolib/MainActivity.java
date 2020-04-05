package com.example.demolib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myutils.ACApp;
import com.example.myutils.CarViewModelInjector;
import com.example.myutils.DaggerCarViewModelInjector;
import com.example.myutils.DemoActivity;
import com.example.myutils.ViewModel.CarViewModel;

public class MainActivity extends AppCompatActivity {

    CarViewModel carViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carViewModel = DaggerCarViewModelInjector.create().getCarViewModel().getCar();

        DemoActivity.OpenAc(getApplicationContext());






    }
}
