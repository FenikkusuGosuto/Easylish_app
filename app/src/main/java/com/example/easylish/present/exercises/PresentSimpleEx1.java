package com.example.easylish.present.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentActivity;
import com.example.easylish.present.PresentSExer;
import com.example.easylish.present.rules.PresentSimple.PresentSimpleRuleTwo;

public class PresentSimpleEx1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pr_simp_one);

    }

    public void wrong(View view) {
        Intent intent = new Intent(PresentSimpleEx1.this, wrongprs.class);
        startActivity(intent);
    }
    public void correct(View view) {
        Intent intent = new Intent(PresentSimpleEx1.this, correctprs.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentSimpleEx1.this, PresentSExer.class);
        startActivity(intent);
    }
}

