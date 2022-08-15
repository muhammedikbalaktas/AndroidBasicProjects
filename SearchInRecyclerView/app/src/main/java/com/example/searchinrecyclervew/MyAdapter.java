package com.example.searchinrecyclervew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private ArrayList<String> data;
    private Context context;
    String highligth="";

    public MyAdapter(ArrayList<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    public MyAdapter(ArrayList<String> data, Context context, String highligth) {
        this.data = data;
        this.context = context;
        this.highligth = highligth;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.my_row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        int pos=position;
        holder.tv_Data.setText(data.get(pos));



    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_Data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_Data=itemView.findViewById(R.id.tv_data);


        }
    }
}
