package com.example.easylish.past.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.PastPCExer;
import com.example.easylish.present.PresentPCExer;

public class PastPerContEx2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pa_perf_cont_two);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PastPerContEx2.this, wrongpapс.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PastPerContEx2.this, correctpapс.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PastPerContEx2.this, PastPCExer.class);
        startActivity(intent);
    }
}

