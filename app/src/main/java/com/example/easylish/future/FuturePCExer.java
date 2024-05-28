package com.example.easylish.future;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.exercises.FuturePerContEx5;
import com.example.easylish.future.exercises.FuturePerContEx1;
import com.example.easylish.future.exercises.FuturePerContEx2;
import com.example.easylish.future.exercises.FuturePerContEx3;
import com.example.easylish.future.exercises.FuturePerContEx4;
import com.example.easylish.future.FutureExer;

public class FuturePCExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_futureperfcont);
    }

    public void backpast(View view) {
        Intent intent=new Intent(FuturePCExer.this, FutureExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(FuturePCExer.this, FuturePerContEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(FuturePCExer.this, FuturePerContEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(FuturePCExer.this, FuturePerContEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(FuturePCExer.this, FuturePerContEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(FuturePCExer.this, FuturePerContEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

