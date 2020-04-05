package com.example.myutils.DI;


import com.example.myutils.Frame;
import com.example.myutils.RubberType;
import com.example.myutils.Wheel;

public class DIWheelFactory {

    public static Wheel getWheel(){
        return new Wheel(getFrame(),getRubberType());
    }

    private static Frame getFrame(){
        return new Frame();
    }
    private static RubberType getRubberType(){
        return new RubberType();
    }

}
