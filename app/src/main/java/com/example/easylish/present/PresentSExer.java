package com.example.easylish.present;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.MainActivity;
import com.example.easylish.R;
import com.example.easylish.present.exercises.PresentSimpleEx1;
import com.example.easylish.present.exercises.PresentSimpleEx2;
import com.example.easylish.present.exercises.PresentSimpleEx3;
import com.example.easylish.present.exercises.PresentSimpleEx4;
import com.example.easylish.present.exercises.PresentSimpleEx5;
import com.example.easylish.present.rules.PresentContinous.PresentContinousRules;
import com.example.easylish.present.rules.PresentPerfect.PresentPerfectRules;
import com.example.easylish.present.rules.PresentPerfectContinous.PresentPerfectContinousRules;
import com.example.easylish.present.rules.PresentSimple.PresentSimpleRules;

public class PresentSExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_presentsimple);
    }

    public void backmain(View view) {
        Intent intent=new Intent(PresentSExer.this, PresentExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(PresentSExer.this, PresentSimpleEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(PresentSExer.this, PresentSimpleEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(PresentSExer.this, PresentSimpleEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(PresentSExer.this, PresentSimpleEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(PresentSExer.this, PresentSimpleEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

