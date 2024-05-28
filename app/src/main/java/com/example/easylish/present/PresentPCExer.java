package com.example.easylish.present;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.exercises.PresentContEx1;
import com.example.easylish.present.exercises.PresentContEx2;
import com.example.easylish.present.exercises.PresentContEx3;
import com.example.easylish.present.exercises.PresentContEx4;
import com.example.easylish.present.exercises.PresentContEx5;
import com.example.easylish.present.exercises.PresentPerContEx1;
import com.example.easylish.present.exercises.PresentPerContEx2;
import com.example.easylish.present.exercises.PresentPerContEx3;
import com.example.easylish.present.exercises.PresentPerContEx4;
import com.example.easylish.present.exercises.PresentPerContEx5;

public class PresentPCExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_presentperfcont);
    }

    public void backpast(View view) {
        Intent intent=new Intent(PresentPCExer.this, PresentExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(PresentPCExer.this, PresentPerContEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(PresentPCExer.this, PresentPerContEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(PresentPCExer.this, PresentPerContEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(PresentPCExer.this, PresentPerContEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(PresentPCExer.this, PresentPerContEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

