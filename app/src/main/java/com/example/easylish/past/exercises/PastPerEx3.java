package com.example.easylish.past.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.PastPExer;
import com.example.easylish.present.PresentPExer;

public class PastPerEx3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pa_perf_three);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PastPerEx3.this, wrongpap.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PastPerEx3.this, correctpap.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PastPerEx3.this, PastPExer.class);
        startActivity(intent);
    }
}

