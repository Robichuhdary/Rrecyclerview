package com.appslover.mytempprectic;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class Temp_Adapter extends RecyclerView.Adapter<Temp_Adapter.Temp_Holder> {
    public static ArrayList<Logos_Items> mList = new ArrayList<>();

    Context context;

    public Temp_Adapter(ArrayList<Logos_Items> arrayList, Context context) {
        mList = arrayList;

        this.context = context;
    }


    @NonNull
    @Override
    public Temp_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Temp_Holder(LayoutInflater.from(parent.getContext()).inflate(R.layout.bg_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Temp_Holder holder, int i) {
        Glide.with(this.context).load(Integer.valueOf(mList.get(i).getLogos())).into(holder.back_image);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class Temp_Holder extends RecyclerView.ViewHolder  {
        public static boolean listTepBoleen = true;



        ImageView back_image;


        public Temp_Holder(@NonNull View view) {
            super(view);
            ImageView imageView = (ImageView) view.findViewById(R.id.loadImage);
            this.back_image = imageView;
           imageView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   Glide.with(v.getContext()).load(Integer.valueOf(Temp_Adapter.mList.get(getAdapterPosition()).getLogos()))
                           .into(MainActivity.overLayImage);
               }
           });


        }

    }
}
