package com.courses.hw.bird;

public class Chicken extends NonFlyingBird {
    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Chicken " + super.toString();
    }
}
