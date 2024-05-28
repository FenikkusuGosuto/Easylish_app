package com.example.easylish.present.rules.PresentPerfectContinous;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentActivity;
import com.example.easylish.present.rules.PresentPerfectContinous.PresentPerfectContinousRuleThree;
import com.example.easylish.present.rules.PresentPerfectContinous.PresentPerfectContinousRules;

public class PresentPerfectContinousRuleTwo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_present_perfect_continous_rule_two);

    }


    public void backpast(View view) {
        Intent intent = new Intent(PresentPerfectContinousRuleTwo.this, PresentActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(PresentPerfectContinousRuleTwo.this, PresentPerfectContinousRules.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PresentPerfectContinousRuleTwo.this, PresentPerfectContinousRuleThree.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Хммм..",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

