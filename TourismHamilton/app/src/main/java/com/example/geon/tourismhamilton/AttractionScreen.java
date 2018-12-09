package com.example.geon.tourismhamilton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AttractionScreen extends AppCompatActivity {

    private ImageButton event;
    private ImageButton main;
    private ImageButton favourite;
    private ImageButton more;
    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_screen);

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

        more = (ImageButton) findViewById(R.id.imageButton9);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoreActivity();
            }
        });

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

    public void openMoreActivity() {
        Intent intent = new Intent(this, MoreScreen.class);

        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void openEatActivity() {
        Intent intent = new Intent(this, AttractionMap.class);
        AttractionMap.findWhich = 0;
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void openExploreActivity() {
        Intent intent = new Intent(this, AttractionMap.class);
        AttractionMap.findWhich = 1;
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void openPlayActivity() {
        Intent intent = new Intent(this, AttractionMap.class);
        AttractionMap.findWhich = 2;
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

}
