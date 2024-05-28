package com.example.easylish.present;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.exercises.PresentPerEx1;
import com.example.easylish.present.exercises.PresentPerEx2;
import com.example.easylish.present.exercises.PresentPerEx3;
import com.example.easylish.present.exercises.PresentPerEx4;
import com.example.easylish.present.exercises.PresentPerEx5;
import com.example.easylish.present.exercises.PresentSimpleEx1;
import com.example.easylish.present.exercises.PresentSimpleEx2;
import com.example.easylish.present.exercises.PresentSimpleEx3;
import com.example.easylish.present.exercises.PresentSimpleEx4;
import com.example.easylish.present.exercises.PresentSimpleEx5;

public class PresentPExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_presentperf);
    }

    public void backpast(View view) {
        Intent intent=new Intent(PresentPExer.this, PresentExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(PresentPExer.this, PresentPerEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(PresentPExer.this, PresentPerEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(PresentPExer.this, PresentPerEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(PresentPExer.this, PresentPerEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(PresentPExer.this, PresentPerEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

