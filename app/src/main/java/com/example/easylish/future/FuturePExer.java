package com.example.easylish.future;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.exercises.FuturePerEx1;
import com.example.easylish.future.exercises.FuturePerEx2;
import com.example.easylish.future.exercises.FuturePerEx3;
import com.example.easylish.future.exercises.FuturePerEx4;
import com.example.easylish.future.exercises.FuturePerEx5;
import com.example.easylish.past.PastExer;
import com.example.easylish.past.exercises.PastPerEx1;
import com.example.easylish.past.exercises.PastPerEx2;
import com.example.easylish.past.exercises.PastPerEx3;
import com.example.easylish.past.exercises.PastPerEx4;
import com.example.easylish.past.exercises.PastPerEx5;

public class FuturePExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_futureperf);
    }

    public void backpast(View view) {
        Intent intent=new Intent(FuturePExer.this, FutureExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(FuturePExer.this, FuturePerEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(FuturePExer.this, FuturePerEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(FuturePExer.this, FuturePerEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(FuturePExer.this, FuturePerEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(FuturePExer.this, FuturePerEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

