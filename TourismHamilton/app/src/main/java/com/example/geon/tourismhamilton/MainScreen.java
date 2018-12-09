package com.example.geon.tourismhamilton;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainScreen extends AppCompatActivity {

    private ImageButton attraction;
    private ImageButton event;
    private ImageButton favourite;
    private ImageButton more;
    private Button scan;
    private EditText mytext;
    private ImageView qr_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_screen);
        scan=findViewById(R.id.scanButton);



        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator intentIntegrator=new IntentIntegrator(MainScreen.this);
                intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                intentIntegrator.setCameraId(0);
                intentIntegrator.setOrientationLocked(false);
                intentIntegrator.setPrompt("Scanning QR Code. Please focus on it!");
                intentIntegrator.setBeepEnabled(true);
                intentIntegrator.setBarcodeImageEnabled(true);
                intentIntegrator.initiateScan();
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        final IntentResult result=IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if(result!=null && result.getContents()!=null){

             /*   setContentView(R.layout.activity_main);
                android.widget.TextView helloTextView = (android.widget.TextView) findViewById(R.id.textViewName);
                helloTextView.setText(result.getContents());*/
        }
        super.onActivityResult(requestCode, resultCode, data);
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

    public void openFavouriteActivity() {
        Intent intent = new Intent(this, FavouriteScreen.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void openMoreActivity() {
        Intent intent = new Intent(this, MainScreen.class);//MoreScreen.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
}
