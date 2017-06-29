package com.mambayamba.activatingpatterns;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mambayamba.activatingpatterns.fillings.Cheese;

import java.util.List;

/**
 * Created by макс on 27.06.2017.
 */

public class ItemDataAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private List<Cheese> cheeses;

    public ItemDataAdapter(List<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cheese_holder_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        Cheese cheese = cheeses.get(position);
        holder.itemImage.setImageResource(cheese.getImage());
        holder.itemName.setText(cheese.getName());
    }

    @Override
    public int getItemCount() {
        return cheeses.size();
    }

    public void removeItem(int position){
        cheeses.remove(position);
        notifyItemChanged(position);
        notifyItemRangeChanged(position, cheeses.size());
    }
}
