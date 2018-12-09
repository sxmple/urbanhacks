package com.example.geon.tourismhamilton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EventScreen extends AppCompatActivity {

    private ImageButton attraction;
    private ImageButton main;
    private ImageButton favourite;
    private ImageButton more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_screen);

        attraction = (ImageButton) findViewById(R.id.imageButton);
        attraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAttractionActivity();
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

        more = (ImageButton) findViewById(R.id.imageButton9);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoreActivity();
            }
        });
    }

    public void openAttractionActivity() {
        Intent intent = new Intent(this, AttractionScreen.class);
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

    public void openMoreActivity() {
        Intent intent = new Intent(this, MoreScreen.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

}
