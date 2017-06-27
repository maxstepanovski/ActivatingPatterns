package com.mambayamba.activatingpatterns.fillings;

import com.mambayamba.activatingpatterns.R;

/**
 * Created by Tom on 27.06.2017.
 */

public class Parmesan extends Cheese {
    @Override
    public String getName() {
        return "Parmesan";
    }

    @Override
    public int getImage() {
        return R.drawable.parmesan;
    }

    @Override
    public int getKCal() {
        return 100;
    }

    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public boolean isVeg() {
        return true;
    }
}
