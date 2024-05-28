package com.example.easylish.future.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FutureSExer;
import com.example.easylish.past.PastSExer;

public class FutureSimpleEx5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_fu_simp_five);

    }

    public void wrong(View view) {
        Intent intent = new Intent(FutureSimpleEx5.this, wrongfus.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(FutureSimpleEx5.this, correctfus.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(FutureSimpleEx5.this, FutureSExer.class);
        startActivity(intent);
    }
}

