package com.example.myutils.ViewModel;

import android.util.Log;

import com.example.myutils.Engine;
import com.example.myutils.Wheel;

import javax.inject.Inject;

import dagger.Component;


public class CarViewModel {

    private Engine engine;
    private Wheel wheel;

    @Inject
    public CarViewModel(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }
    public CarViewModel getCar(){
        driveCar();
        return new CarViewModel(engine, wheel);
    }

    public void driveCar(){
        Log.d("TAG","Car is driving");
    }
}
