package com.example.tornado;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;
//create InterFace has inside it query and insert notation
@Dao
public interface DishDao {
    @Query("SELECT * FROM dish")
    List<Dish> dishData();
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertAll(Dish... dishes);



}
