package com.example.tornado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        //get the button by id
        Button homeButton = findViewById(R.id.homeButton);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(MenuScreen.this,MainActivity.class);//create Intent object
                startActivity(home);//start new activity
            }
        });
//        List<Dish> dishes = new ArrayList<>();


        //save the database
        AppDatabase database =  Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "Orders Shatha Restaurant ").allowMainThreadQueries().build();
        DishDao dish = database.dishDao();

         List<Dish> dishes= dish.dishData();





//
//        dishes .add(new Dish("Pizza","20","Dough, cheese, vegetables and chicken"));
//        dishes .add(new Dish("Burger","15","Bread, tomato, lettuce, onion, potato, cheese and sauce"));
//        dishes .add(new Dish("Malfoof","30","Cabbage leaves stuffed with rice, meat and spiced vegetables"));
//

        // get the recycler view
        RecyclerView taskDataRecuclerView = findViewById(R.id.recycle);
        // set a layout manager for the view
        taskDataRecuclerView.setLayoutManager(new LinearLayoutManager(this));
        // set the adapter for the recyclerView
        taskDataRecuclerView.setAdapter(new DishAdapter( dishes ));

    }
}