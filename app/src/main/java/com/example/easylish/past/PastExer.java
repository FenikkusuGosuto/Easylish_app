package com.example.easylish.past;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.MainActivity;
import com.example.easylish.R;
import com.example.easylish.present.PresentCExer;
import com.example.easylish.present.PresentPCExer;
import com.example.easylish.present.PresentPExer;
import com.example.easylish.present.PresentSExer;

public class PastExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_past);
    }

    public void backmain(View view) {
        Intent intent=new Intent(PastExer.this, MainActivity.class);
        startActivity(intent);
    }

    public void presentsimple(View view) {
        Intent intent=new Intent(PastExer.this, PastSExer.class);
        startActivity(intent);
    }
    public void presentcontinous(View view) {
        Intent intent=new Intent(PastExer.this, PastCExer.class);
        startActivity(intent);
    }
    public void presentperfect(View view) {
        Intent intent=new Intent(PastExer.this, PastPExer.class);
        startActivity(intent);
    }
    public void presentpf(View view) {
        Intent intent=new Intent(PastExer.this, PastPCExer.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Past Simple - самое то, с чего начать!",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

