package com.example.easylish.future.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FuturePCExer;
import com.example.easylish.past.PastPCExer;

public class FuturePerContEx3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_fu_perf_cont_three);

    }

    public void wrong(View view) {
        Intent intent = new Intent(FuturePerContEx3.this, wrongfupс.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(FuturePerContEx3.this, correctfupс.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(FuturePerContEx3.this, FuturePCExer.class);
        startActivity(intent);
    }
}

