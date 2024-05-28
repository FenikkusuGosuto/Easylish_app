package com.example.easylish.present.rules.PresentSimple;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentActivity;
import com.example.easylish.present.PresentSExer;

public class PresentSimpleRuleThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_present_simple_rule_three);

    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ага-ага..",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentSimpleRuleThree.this, PresentActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(PresentSimpleRuleThree.this, PresentSimpleRuleTwo.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PresentSimpleRuleThree.this, PresentSExer.class);
        startActivity(intent);
    }
}

