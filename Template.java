package com.appslover.mytempprectic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class Template extends AppCompatActivity {
    RecyclerView  recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        recyclerView=(RecyclerView) findViewById(R.id.mrecyclerview);
        tempsWorkings(recyclerView);
    }

    public static int[] Templates = { R.drawable.backgrounds_4, R.drawable.backgrounds_5,
            R.drawable.backgrounds_6,
            R.drawable.backgrounds_7, R.drawable.backgrounds_8, R.drawable.backgrounds_9, R.drawable.backgrounds_10,
            R.drawable.backgrounds_11, R.drawable.backgrounds_14,
            R.drawable.backgrounds_15, R.drawable.backgrounds_16, R.drawable.backgrounds_17, R.drawable.backgrounds_18,
            R.drawable.backgrounds_19, R.drawable.backgrounds_20, R.drawable.backgrounds_21, R.drawable.backgrounds_22,
           };

    @SuppressLint("WrongConstant")
    public void tempsWorkings(RecyclerView recyclerView) {
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(new Temp_Adapter( templatesItems(),getApplicationContext()));
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
    }
    public ArrayList<Logos_Items> templatesItems() {
        ArrayList<Logos_Items> arrayList = new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            arrayList.add(new Logos_Items(Templates[i]));
        }
        return arrayList;
    }

}