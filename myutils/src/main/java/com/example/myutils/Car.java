package com.example.myutils;

import android.nfc.Tag;
import android.util.Log;



public class Car {
    private final Engine engine;
    private Wheel wheel;


    public Car(Engine engine,Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }


    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void driveCar(){

        Log.d("TAG","Car is driving");
    }
}
