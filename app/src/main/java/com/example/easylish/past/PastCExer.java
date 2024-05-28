package com.example.easylish.past;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.exercises.PastContEx1;
import com.example.easylish.past.exercises.PastContEx2;
import com.example.easylish.past.exercises.PastContEx3;
import com.example.easylish.past.exercises.PastContEx4;
import com.example.easylish.past.exercises.PastContEx5;
import com.example.easylish.present.PresentExer;
import com.example.easylish.present.exercises.PresentContEx1;
import com.example.easylish.present.exercises.PresentContEx2;
import com.example.easylish.present.exercises.PresentContEx3;
import com.example.easylish.present.exercises.PresentContEx4;
import com.example.easylish.present.exercises.PresentContEx5;

public class PastCExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pastcont);
    }

    public void backpast(View view) {
        Intent intent=new Intent(PastCExer.this, PastExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(PastCExer.this, PastContEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(PastCExer.this, PastContEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(PastCExer.this, PastContEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(PastCExer.this, PastContEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(PastCExer.this, PastContEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

