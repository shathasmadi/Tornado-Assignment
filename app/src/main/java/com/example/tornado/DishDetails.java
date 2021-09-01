package com.example.tornado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DishDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_details);
       //get the text by id
        TextView dishName = findViewById(R.id.textView1);
        TextView dishPrice = findViewById(R.id.textViewTwo);
        TextView dishIngredients = findViewById(R.id.textViewThree);

        Intent name =getIntent();//create intent object
        dishName.setText(name.getExtras().getString("dishName"));//set the data use setText
        dishPrice.setText(name.getExtras().getString("dishPrice"));//set the data use setText
        dishIngredients.setText(name.getExtras().getString("dishIngredients"));//set the data use setText

        //get the button by id
        Button backToHome = findViewById(R.id.backToHome);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backHomeButton = new Intent(DishDetails.this,MainActivity.class);//create Intent object
                startActivity(backHomeButton);//start new activity
            }
        });

    }
}