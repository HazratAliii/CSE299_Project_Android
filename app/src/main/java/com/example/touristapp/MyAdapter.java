package com.example.touristapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList <hotelInfo> list;

    public MyAdapter(Context context, ArrayList<hotelInfo> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.hotels, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        hotelInfo hotelinfo = list.get(position);
        holder.big_city_name.setText(hotelinfo.getBig_city_name());
        holder.email.setText(hotelinfo.getEmail());
        holder.location.setText(hotelinfo.getLocation());
        holder.meals.setText(hotelinfo.getMeals());
        holder.name.setText(hotelinfo.getName());
        holder.phone.setText(hotelinfo.getPhone());
        holder.review.setText(hotelinfo.getReview());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView big_city_name, email, location, meals, name, phone, review;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            big_city_name = itemView.findViewById(R.id.one);
            email = itemView.findViewById(R.id.two);
            location = itemView.findViewById(R.id.three);
            meals = itemView.findViewById(R.id.four);
            name = itemView.findViewById(R.id.five);
            phone = itemView.findViewById(R.id.six);
            review = itemView.findViewById(R.id.seven);
        }
    }
}
