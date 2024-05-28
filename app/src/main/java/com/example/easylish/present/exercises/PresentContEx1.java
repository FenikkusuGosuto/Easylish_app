package com.example.easylish.present.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentCExer;
import com.example.easylish.present.PresentSExer;

public class PresentContEx1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pr_cont_one);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PresentContEx1.this, wrongprc.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PresentContEx1.this, correctprc.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentContEx1.this, PresentCExer.class);
        startActivity(intent);
    }
}

