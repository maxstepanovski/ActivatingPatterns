package com.mambayamba.activatingpatterns.fillings;

/**
 * Created by Tom on 27.06.2017.
 */

public abstract class Cheese implements Filling {
    private String name;
    private String description;
    private int image;
    private int kCal;
    private int price;
    private boolean vegetarian;

    public Cheese() {
    }
}
