package com.example.easylish.past.rules.PastPerfect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.past.PastActivity;

public class PastPerfectRuleThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_past_perfect_rule_three);

    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ага-ага..",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void backpast(View view) {
        Intent intent = new Intent(PastPerfectRuleThree.this, PastActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(PastPerfectRuleThree.this, PastPerfectRuleTwo.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PastPerfectRuleThree.this, PastPerfectRuleFour.class);
        startActivity(intent);
    }
}

