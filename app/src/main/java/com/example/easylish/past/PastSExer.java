package com.example.easylish.past;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.exercises.PastSimpleEx1;
import com.example.easylish.past.exercises.PastSimpleEx2;
import com.example.easylish.past.exercises.PastSimpleEx3;
import com.example.easylish.past.exercises.PastSimpleEx4;
import com.example.easylish.past.exercises.PastSimpleEx5;
import com.example.easylish.present.PresentExer;
import com.example.easylish.present.exercises.PresentSimpleEx1;
import com.example.easylish.present.exercises.PresentSimpleEx2;
import com.example.easylish.present.exercises.PresentSimpleEx3;
import com.example.easylish.present.exercises.PresentSimpleEx4;
import com.example.easylish.present.exercises.PresentSimpleEx5;

public class PastSExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pastsimple);
    }

    public void backmain(View view) {
        Intent intent=new Intent(PastSExer.this, PastExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(PastSExer.this, PastSimpleEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(PastSExer.this, PastSimpleEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(PastSExer.this, PastSimpleEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(PastSExer.this, PastSimpleEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(PastSExer.this, PastSimpleEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

