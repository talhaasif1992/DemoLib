package com.example.myutils;

import javax.inject.Inject;

public class Wheel {
    private Frame frame;
    private RubberType rubberType;

    public Wheel() {
        this.frame = new Frame();
        this.rubberType = new RubberType();
    }

    @Inject
    public Wheel(Frame frame, RubberType rubberType) {
        this.frame = frame;
        this.rubberType = rubberType;
    }
}
