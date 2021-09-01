package com.example.tornado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddDishScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dish_screen);

      // Save the data in database
        AppDatabase database =  Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "Orders Shatha Restaurant ").allowMainThreadQueries().build();
        DishDao dish = database.dishDao();
      // get the button by id and add event listener
        Button submit = findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get the text by id and insert data
                EditText dishName= findViewById(R.id.dishNamePlain);
                EditText dishPrise= findViewById(R.id.dishPricePlain);
                EditText dishIng= findViewById(R.id.ingredientPlain);

                String name = dishName.getText().toString();
                String price = dishPrise.getText().toString();
                String ing = dishIng.getText().toString();

                Dish newDish = new Dish(name,price,ing);
                 dish.insertAll(newDish);

            }
        });

    }
}