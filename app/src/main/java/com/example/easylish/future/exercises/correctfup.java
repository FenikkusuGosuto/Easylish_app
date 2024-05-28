package com.example.easylish.future.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FuturePExer;
import com.example.easylish.past.PastPExer;

public class correctfup extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.correct);

    }

    public void backpast(View view) {
        Intent intent = new Intent(correctfup.this, FuturePExer.class);
        startActivity(intent);
    }
}

