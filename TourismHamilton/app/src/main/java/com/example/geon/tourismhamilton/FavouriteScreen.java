package com.example.geon.tourismhamilton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class FavouriteScreen extends AppCompatActivity {

    private ImageButton attraction;
    private ImageButton event;
    private ImageButton main;
    private ImageButton more;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_screen);

        button1 = (ImageButton) findViewById(R.id.imageButton2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEatActivity();
            }
        });

        button2 = (ImageButton) findViewById(R.id.imageButton3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExploreActivity();
            }
        });

        button3 = (ImageButton) findViewById(R.id.imageButton4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPlayActivity();
            }
        });

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

    public void openMoreActivity() {
        Intent intent = new Intent(this, MoreScreen.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void openEatActivity() {
        Toast.makeText(FavouriteScreen.this, "You do not have any eat favourites", Toast.LENGTH_LONG).show();
    }

    public void openExploreActivity() {
        Toast.makeText(FavouriteScreen.this, "You do not have any explore favourites", Toast.LENGTH_LONG).show();
    }

    public void openPlayActivity() {
        Toast.makeText(FavouriteScreen.this, "You do not have any play favourites", Toast.LENGTH_LONG).show();
    }

}
