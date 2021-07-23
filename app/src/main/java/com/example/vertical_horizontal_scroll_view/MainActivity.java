package com.example.vertical_horizontal_scroll_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleSelection(View view) {
        Toast.makeText(this, "Image is Pressed", Toast.LENGTH_SHORT).show();
    }
}