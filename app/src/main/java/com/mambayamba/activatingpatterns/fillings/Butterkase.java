package com.mambayamba.activatingpatterns.fillings;

import com.mambayamba.activatingpatterns.R;

/**
 * Created by Tom on 27.06.2017.
 */

public class Butterkase extends Cheese {
    @Override
    public String getName() {
        return "Butterkase";
    }

    @Override
    public int getImage() {
        return R.drawable.butterkase;
    }

    @Override
    public int getKCal() {
        return 110;
    }

    @Override
    public int getPrice() {
        return 35;
    }

    @Override
    public boolean isVeg() {
        return true;
    }
}
