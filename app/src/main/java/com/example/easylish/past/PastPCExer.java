package com.example.easylish.past;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.exercises.PastPerContEx1;
import com.example.easylish.past.exercises.PastPerContEx2;
import com.example.easylish.past.exercises.PastPerContEx3;
import com.example.easylish.past.exercises.PastPerContEx4;
import com.example.easylish.past.exercises.PastPerContEx5;
import com.example.easylish.present.PresentExer;
import com.example.easylish.present.exercises.PresentPerContEx1;
import com.example.easylish.present.exercises.PresentPerContEx2;
import com.example.easylish.present.exercises.PresentPerContEx3;
import com.example.easylish.present.exercises.PresentPerContEx4;
import com.example.easylish.present.exercises.PresentPerContEx5;

public class PastPCExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_pastperfcont);
    }

    public void backpast(View view) {
        Intent intent=new Intent(PastPCExer.this, PastExer.class);
        startActivity(intent);
    }

    public void odin(View view) {
        Intent intent=new Intent(PastPCExer.this, PastPerContEx1.class);
        startActivity(intent);
    }
    public void dva(View view) {
        Intent intent=new Intent(PastPCExer.this, PastPerContEx2.class);
        startActivity(intent);
    }
    public void tri(View view) {
        Intent intent=new Intent(PastPCExer.this, PastPerContEx3.class);
        startActivity(intent);
    }
    public void chet(View view) {
        Intent intent=new Intent(PastPCExer.this, PastPerContEx4.class);
        startActivity(intent);
    }
    public void pyat(View view) {
        Intent intent=new Intent(PastPCExer.this, PastPerContEx5.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ну-ка, ну-ка, что возьмёшь?",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

