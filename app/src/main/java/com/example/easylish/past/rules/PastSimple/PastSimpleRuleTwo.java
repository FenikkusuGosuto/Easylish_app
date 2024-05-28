package com.example.easylish.past.rules.PastSimple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.PastActivity;

public class PastSimpleRuleTwo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_past_simple_rule_two);

    }


    public void backpast(View view) {
        Intent intent = new Intent(PastSimpleRuleTwo.this, PastActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(PastSimpleRuleTwo.this, PastSimpleRules.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PastSimpleRuleTwo.this, PastSimpleRuleThree.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Хммм..",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

