package com.example.easylish.past.rules.PastContinous;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.PastActivity;

public class PastContinousRules extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.rules_pastcontinous);
    }

    public void backpast(View view) {
        Intent intent=new Intent(PastContinousRules.this, PastActivity.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Такс такс такс..",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PastContinousRules.this, PastContinousRuleTwo.class);
        startActivity(intent);
    }

}

