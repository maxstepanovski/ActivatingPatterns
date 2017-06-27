package com.mambayamba.activatingpatterns;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by макс on 27.06.2017.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {
    ImageView itemImage;
    TextView itemName;

    public ItemViewHolder(View itemView) {
        super(itemView);
        itemImage = (ImageView) itemView.findViewById(R.id.item_image);
        itemName = (TextView) itemView.findViewById(R.id.item_name);
    }
}
