package com.example.easylish.future;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.MainActivity;
import com.example.easylish.R;
import com.example.easylish.past.PastCExer;
import com.example.easylish.past.PastPCExer;
import com.example.easylish.past.PastPExer;
import com.example.easylish.past.PastSExer;

public class FutureExer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.exer_future);
    }

    public void backmain(View view) {
        Intent intent=new Intent(FutureExer.this, MainActivity.class);
        startActivity(intent);
    }

    public void presentsimple(View view) {
        Intent intent=new Intent(FutureExer.this, FutureSExer.class);
        startActivity(intent);
    }
    public void presentcontinous(View view) {
        Intent intent=new Intent(FutureExer.this, FutureCExer.class);
        startActivity(intent);
    }
    public void presentperfect(View view) {
        Intent intent=new Intent(FutureExer.this, FuturePExer.class);
        startActivity(intent);
    }
    public void presentpf(View view) {
        Intent intent=new Intent(FutureExer.this, FuturePCExer.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Future Simple - самое то, с чего начать",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

