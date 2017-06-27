package com.mambayamba.activatingpatterns.fillings;

import com.mambayamba.activatingpatterns.R;

/**
 * Created by Tom on 27.06.2017.
 */

public class Brie extends Cheese {
    @Override
    public String getName() {
        return "Brie";
    }

    @Override
    public int getImage() {
        return R.drawable.brie;
    }

    @Override
    public int getKCal() {
        return 150;
    }

    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public boolean isVeg() {
        return true;
    }
}
