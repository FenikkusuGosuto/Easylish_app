package com.example.easylish.present.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentCExer;
import com.example.easylish.present.PresentPCExer;

public class PresentPerContEx3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pr_perf_cont_three);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PresentPerContEx3.this, wrongprpс.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PresentPerContEx3.this, correctprpс.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentPerContEx3.this, PresentPCExer.class);
        startActivity(intent);
    }
}

