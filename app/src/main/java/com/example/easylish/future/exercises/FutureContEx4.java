package com.example.easylish.future.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FutureCExer;
import com.example.easylish.past.PastCExer;

public class FutureContEx4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_fu_cont_four);

    }

    public void wrong(View view) {
        Intent intent = new Intent(FutureContEx4.this, wrongfuc.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(FutureContEx4.this, correctfuc.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(FutureContEx4.this, FutureCExer.class);
        startActivity(intent);
    }
}

