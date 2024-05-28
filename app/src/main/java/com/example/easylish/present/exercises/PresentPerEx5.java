package com.example.easylish.present.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentPExer;

public class PresentPerEx5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pr_perf_five);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PresentPerEx5.this, wrongprp.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PresentPerEx5.this, correctprp.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentPerEx5.this, PresentPExer.class);
        startActivity(intent);
    }
}

