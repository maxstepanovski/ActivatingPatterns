package com.mambayamba.activatingpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mambayamba.activatingpatterns.fillings.Brie;
import com.mambayamba.activatingpatterns.fillings.Butterkase;
import com.mambayamba.activatingpatterns.fillings.Cheddar;
import com.mambayamba.activatingpatterns.fillings.Cheese;
import com.mambayamba.activatingpatterns.fillings.Edam;
import com.mambayamba.activatingpatterns.fillings.Feta;
import com.mambayamba.activatingpatterns.fillings.Parmesan;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView cheesesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cheesesList = (RecyclerView) findViewById(R.id.recycler_view);
        RecyclerView.Adapter adapter = new ItemDataAdapter(buildList());
        cheesesList.setLayoutManager(new LinearLayoutManager(this));
        cheesesList.setHasFixedSize(true);
        cheesesList.setAdapter(adapter);
    }

    private List<Cheese> buildList(){
        List<Cheese> cheeses = new ArrayList<>();
        cheeses = new ArrayList<>();
        cheeses.add(new Brie());
        cheeses.add(new Butterkase());
        cheeses.add(new Cheddar());
        cheeses.add(new Edam());
        cheeses.add(new Feta());
        cheeses.add(new Parmesan());
        return cheeses;
    }
}


