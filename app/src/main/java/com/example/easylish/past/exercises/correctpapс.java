package com.example.easylish.past.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.PastPCExer;
import com.example.easylish.present.PresentPCExer;

public class correctpapс extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.correct);

    }

    public void backpast(View view) {
        Intent intent = new Intent(correctpapс.this, PastPCExer.class);
        startActivity(intent);
    }
}

