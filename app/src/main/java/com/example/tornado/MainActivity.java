package com.example.tornado;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the button by id
        Button addDish = findViewById(R.id.addDishButton);
        addDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addDish =new Intent(MainActivity.this,AddDishScreen.class);//create Intent object
                startActivity(addDish);//start new activity
            }
        });
        //get the button by id
        Button menu = findViewById(R.id.menuButton);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuDish =new Intent(MainActivity.this,MenuScreen.class);//create Intent object
                startActivity(menuDish);//start new activity
            }
        });



    }



}