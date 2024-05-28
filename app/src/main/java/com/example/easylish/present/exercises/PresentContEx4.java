package com.example.easylish.present.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentCExer;

public class PresentContEx4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pr_cont_four);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PresentContEx4.this, wrongprc.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PresentContEx4.this, correctprc.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentContEx4.this, PresentCExer.class);
        startActivity(intent);
    }
}

