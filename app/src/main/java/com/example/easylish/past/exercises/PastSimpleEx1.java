package com.example.easylish.past.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.PastSExer;
import com.example.easylish.present.PresentSExer;

public class PastSimpleEx1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pa_simp_one);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PastSimpleEx1.this, wrongpas.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PastSimpleEx1.this, correctpas.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PastSimpleEx1.this, PastSExer.class);
        startActivity(intent);
    }
}

