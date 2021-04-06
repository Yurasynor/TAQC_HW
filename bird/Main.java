package com.courses.hw.bird;

public class Main {
    public static void main(String[] args) {

        Bird[] birds = {
                new Swallow(true, false),
                new Eagle(true, true),
                new Penguin(false, true),
                new Chicken(false, true)
        };

        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i]);
            birds[i].fly();
            System.out.println();
        }

    }

}
