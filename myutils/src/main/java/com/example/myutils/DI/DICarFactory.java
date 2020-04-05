package com.example.myutils.DI;


import com.example.myutils.Car;

import javax.inject.Inject;

public class DICarFactory {


    public static Car getCar(){
        return new Car(DIEngineFactory.getEngine(),DIWheelFactory.getWheel());
    }
}
