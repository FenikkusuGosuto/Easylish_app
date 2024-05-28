package com.example.easylish.present.rules.PresentPerfectContinous;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentPCExer;
import com.example.easylish.present.PresentSExer;
import com.example.easylish.present.rules.PresentPerfectContinous.PresentPerfectContinousRuleTwo;
import com.example.easylish.present.PresentActivity;
import com.example.easylish.present.rules.PresentSimple.PresentSimpleRuleThree;

public class PresentPerfectContinousRuleThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_present_perfect_continous_rule_three);

    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Можно приступать к упражнениям!",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentPerfectContinousRuleThree.this, PresentActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(PresentPerfectContinousRuleThree.this, PresentPerfectContinousRuleTwo.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PresentPerfectContinousRuleThree.this, PresentPCExer.class);
        startActivity(intent);
    }
}

