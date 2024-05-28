package com.example.easylish.present.rules.PresentSimple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.rules.PresentSimple.PresentSimpleRuleThree;
import com.example.easylish.present.PresentActivity;

public class PresentSimpleRuleTwo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_present_simple_rule_two);

    }


    public void backpast(View view) {
        Intent intent = new Intent(PresentSimpleRuleTwo.this, PresentActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(PresentSimpleRuleTwo.this, PresentSimpleRules.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PresentSimpleRuleTwo.this, PresentSimpleRuleThree.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Хммм..",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

