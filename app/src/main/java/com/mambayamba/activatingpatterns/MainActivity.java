package com.mambayamba.activatingpatterns;

import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

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
        cheesesList.addItemDecoration(new ItemDivider(this, R.drawable.item_divider));
        cheesesList.setHasFixedSize(true);
        cheesesList.setAdapter(adapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_action_add);
        buildDialog(fab);
    }

    private void buildDialog(FloatingActionButton fab) {
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(MainActivity.this, R.style.DialogTheme);
                LayoutInflater inflater = MainActivity.this.getLayoutInflater();
                dialogBuilder.setTitle(R.string.dialog_title);
                dialogBuilder.setMessage(R.string.dialog_message);
                dialogBuilder.setIcon(R.drawable.ic_action_add);
                dialogBuilder.setPositiveButton(R.string.positive_action_message, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                dialogBuilder.setNegativeButton(R.string.negative_action_message, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                AlertDialog dialog = dialogBuilder.create();
                dialog.show();

            }
        });
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


