package com.mambayamba.activatingpatterns.fillings;

import com.mambayamba.activatingpatterns.R;

/**
 * Created by Tom on 27.06.2017.
 */

public class Edam extends Cheese {
    @Override
    public String getName() {
        return "Edam";
    }

    @Override
    public int getImage() {
        return R.drawable.edam;
    }

    @Override
    public int getKCal() {
        return 115;
    }

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public boolean isVeg() {
        return true;
    }
}
