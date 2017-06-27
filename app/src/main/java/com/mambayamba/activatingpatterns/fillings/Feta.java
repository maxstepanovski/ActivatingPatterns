package com.mambayamba.activatingpatterns.fillings;

import com.mambayamba.activatingpatterns.R;

/**
 * Created by Tom on 27.06.2017.
 */

public class Feta extends Cheese {
    @Override
    public String getName() {
        return "Feta";
    }

    @Override
    public int getImage() {
        return R.drawable.feta;
    }

    @Override
    public int getKCal() {
        return 80;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public boolean isVeg() {
        return true;
    }
}
