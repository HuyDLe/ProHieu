package com.example.prohieu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
////////////////////////////////////////////////////////////////////////////
public class Homepage extends AppCompatActivity {
    private ImageButton buttonMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        buttonMaps = findViewById(R.id.map);
        buttonMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linktoMapboxNavigation();
            }
        });
    }

    public void linktoMapboxNavigation() {
        Intent intent = new Intent(this, MapboxNavigation.class);
        startActivity(intent);
    }
}
