package com.example.easylish.future.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FuturePExer;
import com.example.easylish.past.PastPExer;

public class FuturePerEx1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_fu_perf_one);

    }

    public void wrong(View view) {
        Intent intent = new Intent(FuturePerEx1.this, wrongfup.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(FuturePerEx1.this, correctfup.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(FuturePerEx1.this, FuturePExer.class);
        startActivity(intent);
    }
}

