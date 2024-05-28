package com.example.easylish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class vazhno extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.vazhno);

    }

    public void backpast(View view) {
        Intent intent = new Intent(vazhno.this, MainActivity.class);
        startActivity(intent);
    }
}

