package com.courses.hw.bird;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {

        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean getFeathers() {
        return feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    abstract void fly();

    @Override
    public String toString() {
        return "[feathers=" + feathers + ", layEggs=" + layEggs + "]";
    }
}
