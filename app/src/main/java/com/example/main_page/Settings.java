package com.example.main_page;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        button = findViewById(R.id.Change_Password);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                clickbutton();
            }
        });

    }

    public void clickbutton() {
        Intent intent = new Intent(this, Logout.class);
        startActivity(intent);
    }

}
