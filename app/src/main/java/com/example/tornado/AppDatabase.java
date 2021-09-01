package com.example.tornado;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


// create abstract class for the app database and extensions from room database

    @Database(entities = {Dish.class},version = 1)
    public  abstract class AppDatabase extends RoomDatabase{
        public abstract DishDao dishDao();












    }

