package com.example.easylish.future.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FutureSExer;

public class wrongfus extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.wrong);

    }

    public void backpast(View view) {
        Intent intent = new Intent(wrongfus.this, FutureSExer.class);
        startActivity(intent);
    }
}

