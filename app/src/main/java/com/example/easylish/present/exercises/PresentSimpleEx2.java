package com.example.easylish.present.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentSExer;

public class PresentSimpleEx2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pr_simp_two);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PresentSimpleEx2.this, wrongprs.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PresentSimpleEx2.this, correctprs.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentSimpleEx2.this, PresentSExer.class);
        startActivity(intent);
    }
}

