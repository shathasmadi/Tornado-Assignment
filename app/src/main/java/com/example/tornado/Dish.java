package com.example.tornado;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

//  create the model class and add the entity notation (database) and primary key to the id
@Entity
public class Dish {
    String name;
    String price;
    String ingredients;

    @PrimaryKey(autoGenerate = true)
    public  int id;

    public Dish(String name, String price, String ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }




}
