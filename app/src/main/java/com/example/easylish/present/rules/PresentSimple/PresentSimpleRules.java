package com.example.easylish.present.rules.PresentSimple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentActivity;

public class PresentSimpleRules extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.rules_presentsimple);

    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Такс такс такс..",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PresentSimpleRules.this, PresentSimpleRuleTwo.class);
        startActivity(intent);
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentSimpleRules.this, PresentActivity.class);
        startActivity(intent);
    }
}

