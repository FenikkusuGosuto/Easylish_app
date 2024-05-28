package com.example.easylish.future.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.PastPCExer;

public class FuturePerContEx4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pa_perf_cont_four);

    }

    public void wrong(View view) {
        Intent intent = new Intent(FuturePerContEx4.this, wrongfupс.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(FuturePerContEx4.this, correctfupс.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(FuturePerContEx4.this, PastPCExer.class);
        startActivity(intent);
    }
}

