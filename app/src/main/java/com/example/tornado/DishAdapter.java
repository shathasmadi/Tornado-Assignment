package com.example.tornado;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;



//Create the adapter
//in the first create class with out extensions

// after everything the last thing should I do extend RecyclerView.Adapter

public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder> {

    //create the list the adapter gonna use to bind data
    List<Dish> dishList = new ArrayList<>();

    public DishAdapter(List<Dish> dishList) {
        this.dishList = dishList;
    }

    @NonNull

    @Override
    public DishViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_dish,parent,false);
        return new DishViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  DishAdapter.DishViewHolder holder, int position) {
        holder.dish = dishList.get(position);
     TextView fragment= holder.itemView.findViewById(R.id.textFragment);
        fragment.setText(holder.dish.name+"   "+holder.dish.price);

    }

    @Override
    public int getItemCount() {
        return dishList.size();
    }

    //create the ViewHolder class and extensions from RecyclerView

    public static class DishViewHolder extends RecyclerView.ViewHolder{
        //create the model object and the view object
            View itemView;
            public Dish dish;

        public DishViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView=itemView;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(),DishDetails.class);
                    intent.putExtra("dishName",dish.name);
                    intent.putExtra("dishPrice",dish.price);
                    intent.putExtra("dishIngredients",dish.ingredients);
                    v.getContext().startActivity(intent);

                }
            });
        }
    }
}
