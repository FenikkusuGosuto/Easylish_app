package com.example.easylish.present;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.MainActivity;
import com.example.easylish.R;

public class PresentExer extends AppCompatActivity {
    MediaPlayer mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mp2 = mp2.create(this, R.raw.meow4);

        setContentView(R.layout.exer_present);
    }

    public void backmain(View view) {
        Intent intent=new Intent(PresentExer.this, MainActivity.class);
        startActivity(intent);
    }

    public void presentsimple(View view) {
        Intent intent=new Intent(PresentExer.this, PresentSExer.class);
        startActivity(intent);
    }
    public void presentcontinous(View view) {
        Intent intent=new Intent(PresentExer.this, PresentCExer.class);
        startActivity(intent);
    }
    public void presentperfect(View view) {
        Intent intent=new Intent(PresentExer.this, PresentPExer.class);
        startActivity(intent);
    }
    public void presentpf(View view) {
        Intent intent=new Intent(PresentExer.this, PresentPCExer.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Present Simple - самое то, с чего начать",
                Toast.LENGTH_LONG);
        toast.show();
        mp2.start();
    }
}

