package com.example.easylish.past;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.exercises.PastPerEx1;
import com.example.easylish.past.exercises.PastPerEx2;
import com.example.easylish.past.exercises.PastPerEx3;
import com.example.easylish.past.exercises.PastPerEx4;
import com.example.easylish.past.exercises.PastPerEx5;
import com.example.easylish.present.PresentExer;
import com.example.easylish.present.exercises.PresentPerEx1;
import com.example.easylish.present.exercises.PresentPerEx2;
import com.example.easylish.present.exercises.PresentPerEx3;
import com.example.easylish.present.exercises.PresentPerEx4;
import com.example.easylish.present.exercises.PresentPerEx5;

public class PastPExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pastperf);
    }

    public void backpast(View view) {
        Intent intent=new Intent(PastPExer.this, PastExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(PastPExer.this, PastPerEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(PastPExer.this, PastPerEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(PastPExer.this, PastPerEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(PastPExer.this, PastPerEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(PastPExer.this, PastPerEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

