package com.example.geon.tourismhamilton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MoreScreen extends AppCompatActivity {

    private ImageButton attraction;
    private ImageButton event;
    private ImageButton main;
    private ImageButton favourite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_screen);

        attraction = (ImageButton) findViewById(R.id.imageButton);
        attraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAttractionActivity();
            }
        });

        event = (ImageButton) findViewById(R.id.imageButton6);
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEventActivity();
            }
        });

        main = (ImageButton) findViewById(R.id.imageButton7);
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        favourite = (ImageButton) findViewById(R.id.imageButton8);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFavouriteActivity();
            }
        });
    }

    public void openAttractionActivity() {
        Intent intent = new Intent(this, AttractionScreen.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void openEventActivity() {
        Intent intent = new Intent(this, EventScreen.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void openFavouriteActivity() {
        Intent intent = new Intent(this, FavouriteScreen.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

}
