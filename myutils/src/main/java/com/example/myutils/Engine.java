package com.example.myutils;

import android.util.Log;

import javax.inject.Inject;



public class Engine {
    private SparkPlug sparkPlug;
    private CrankShaft crankShaft;
    private Piston piston;

    public Engine() {
        this.sparkPlug = new SparkPlug();
        this.crankShaft = new CrankShaft();
        this.piston = new Piston();
    }

    @Inject
    public Engine(SparkPlug sparkPlug, Piston piston, CrankShaft crankShaft) {

        this.sparkPlug = sparkPlug;
        this.crankShaft = crankShaft;
        this.piston = piston;
    }

    public static void status(){
        Log.d("TAG","Engine is not ready, Create Engine First");
    }
}
