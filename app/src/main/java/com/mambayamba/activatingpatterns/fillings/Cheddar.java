package com.mambayamba.activatingpatterns.fillings;

import com.mambayamba.activatingpatterns.R;

/**
 * Created by Tom on 27.06.2017.
 */

public class Cheddar extends Cheese {
    @Override
    public String getName() {
        return "Cheddar";
    }

    @Override
    public int getImage() {
        return R.drawable.cheddar;
    }

    @Override
    public int getKCal() {
        return 150;
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public boolean isVeg() {
        return true;
    }
}
