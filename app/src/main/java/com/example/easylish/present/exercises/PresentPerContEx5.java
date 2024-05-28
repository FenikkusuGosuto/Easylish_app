package com.example.easylish.present.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentCExer;
import com.example.easylish.present.PresentPCExer;

public class PresentPerContEx5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pr_perf_cont_five);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PresentPerContEx5.this, wrongprpс.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PresentPerContEx5.this, correctprpс.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentPerContEx5.this, PresentPCExer.class);
        startActivity(intent);
    }
}

