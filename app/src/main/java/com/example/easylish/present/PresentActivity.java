package com.example.easylish.present;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.MainActivity;
import com.example.easylish.R;
import com.example.easylish.present.rules.PresentContinous.PresentContinousRules;
import com.example.easylish.present.rules.PresentPerfect.PresentPerfectRules;
import com.example.easylish.present.rules.PresentPerfectContinous.PresentPerfectContinousRules;
import com.example.easylish.present.rules.PresentSimple.PresentSimpleRules;

public class PresentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.rules_present);
    }

    public void backmain(View view) {
        Intent intent=new Intent(PresentActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void presentsimple(View view) {
        Intent intent=new Intent(PresentActivity.this, PresentSimpleRules.class);
        startActivity(intent);
    }
    public void presentcontinous(View view) {
        Intent intent=new Intent(PresentActivity.this, PresentContinousRules.class);
        startActivity(intent);
    }
    public void presentperfect(View view) {
        Intent intent=new Intent(PresentActivity.this, PresentPerfectRules.class);
        startActivity(intent);
    }
    public void presentpf(View view) {
        Intent intent=new Intent(PresentActivity.this, PresentPerfectContinousRules.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Сейчас будем читать!",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

