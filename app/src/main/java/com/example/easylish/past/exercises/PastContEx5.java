package com.example.easylish.past.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentCExer;

public class PastContEx5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pa_cont_five);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PastContEx5.this, wrongpac.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PastContEx5.this, correctpac.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PastContEx5.this, PresentCExer.class);
        startActivity(intent);
    }
}

