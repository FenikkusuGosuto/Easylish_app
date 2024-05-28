package com.example.easylish.past.rules.PastPerfectContinous;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.PastActivity;
import com.example.easylish.past.PastPCExer;

public class PastPerfectContinousRuleThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_past_perfect_continous_rule_three);

    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Можно приступать к упражнениям!",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void backpast(View view) {
        Intent intent = new Intent(PastPerfectContinousRuleThree.this, PastActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(PastPerfectContinousRuleThree.this, PastPerfectContinousRuleTwo.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PastPerfectContinousRuleThree.this, PastPCExer.class);
        startActivity(intent);
    }
}

