package com.example.easylish.past;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.MainActivity;
import com.example.easylish.R;
import com.example.easylish.past.rules.PastContinous.PastContinousRules;
import com.example.easylish.past.rules.PastPerfect.PastPerfectRules;
import com.example.easylish.past.rules.PastPerfectContinous.PastPerfectContinousRules;
import com.example.easylish.past.rules.PastSimple.PastSimpleRules;
import com.example.easylish.ui.dashboard.DashboardFragment;

public class PastActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.rules_past);
    }

    public void backmain(View view) {
        Intent intent=new Intent(com.example.easylish.past.PastActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void pastsimple(View view) {
        Intent intent=new Intent(com.example.easylish.past.PastActivity.this, PastSimpleRules.class);
        startActivity(intent);
    }
    public void pastcontinous(View view) {
        Intent intent=new Intent(com.example.easylish.past.PastActivity.this, PastContinousRules.class);
        startActivity(intent);
    }
    public void pastperfect(View view) {
        Intent intent=new Intent(com.example.easylish.past.PastActivity.this, PastPerfectRules.class);
        startActivity(intent);
    }
    public void pastpf(View view) {
        Intent intent=new Intent(com.example.easylish.past.PastActivity.this, PastPerfectContinousRules.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Сейчас будем читать!",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

