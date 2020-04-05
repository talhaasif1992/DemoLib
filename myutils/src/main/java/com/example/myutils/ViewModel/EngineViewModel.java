package com.example.myutils.ViewModel;


import com.example.myutils.CrankShaft;
import com.example.myutils.Engine;
import com.example.myutils.Piston;
import com.example.myutils.SparkPlug;

import javax.inject.Inject;

import dagger.Component;


public class EngineViewModel {

    @Inject
    public Engine getEngine(){
        return new Engine(getSparkPlug(),getPiston(),getCrankShaft());
    }
    private static CrankShaft getCrankShaft(){ return new CrankShaft(); }
    private static Piston getPiston(){ return new Piston(); }
    private static SparkPlug getSparkPlug(){ return new SparkPlug(); }
}
