package com.example.easylish.future.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FuturePExer;
import com.example.easylish.past.PastPExer;

public class FuturePerEx4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_fu_perf_four);

    }

    public void wrong(View view) {
        Intent intent = new Intent(FuturePerEx4.this, wrongfup.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(FuturePerEx4.this, correctfup.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(FuturePerEx4.this, FuturePExer.class);
        startActivity(intent);
    }
}

