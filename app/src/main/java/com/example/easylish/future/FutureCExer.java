package com.example.easylish.future;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.exercises.FutureContEx1;
import com.example.easylish.future.exercises.FutureContEx2;
import com.example.easylish.future.exercises.FutureContEx3;
import com.example.easylish.future.exercises.FutureContEx4;
import com.example.easylish.future.exercises.FutureContEx5;
import com.example.easylish.past.PastExer;
import com.example.easylish.past.exercises.PastContEx1;
import com.example.easylish.past.exercises.PastContEx2;
import com.example.easylish.past.exercises.PastContEx3;
import com.example.easylish.past.exercises.PastContEx4;
import com.example.easylish.past.exercises.PastContEx5;

public class FutureCExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_futurecont);
    }

    public void backpast(View view) {
        Intent intent=new Intent(FutureCExer.this, FutureExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(FutureCExer.this, FutureContEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(FutureCExer.this, FutureContEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(FutureCExer.this, FutureContEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(FutureCExer.this, FutureContEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(FutureCExer.this, FutureContEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

