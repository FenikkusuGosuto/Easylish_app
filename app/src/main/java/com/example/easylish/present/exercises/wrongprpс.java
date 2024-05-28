package com.example.easylish.present.exercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentPCExer;
import com.example.easylish.present.PresentPExer;

public class wrongprpс extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.wrong);

    }

    public void backpast(View view) {
        Intent intent = new Intent(wrongprpс.this, PresentPCExer.class);
        startActivity(intent);
    }
}

