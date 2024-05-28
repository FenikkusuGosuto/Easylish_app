package com.example.easylish.future;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.exercises.FutureSimpleEx1;
import com.example.easylish.future.exercises.FutureSimpleEx2;
import com.example.easylish.future.exercises.FutureSimpleEx3;
import com.example.easylish.future.exercises.FutureSimpleEx4;
import com.example.easylish.future.exercises.FutureSimpleEx5;
import com.example.easylish.past.PastExer;
import com.example.easylish.past.exercises.PastSimpleEx1;
import com.example.easylish.past.exercises.PastSimpleEx2;
import com.example.easylish.past.exercises.PastSimpleEx3;
import com.example.easylish.past.exercises.PastSimpleEx4;
import com.example.easylish.past.exercises.PastSimpleEx5;

public class FutureSExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_futuresimple);
    }

    public void backmain(View view) {
        Intent intent=new Intent(FutureSExer.this, FutureExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(FutureSExer.this, FutureSimpleEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(FutureSExer.this, FutureSimpleEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(FutureSExer.this, FutureSimpleEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(FutureSExer.this, FutureSimpleEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(FutureSExer.this, FutureSimpleEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

