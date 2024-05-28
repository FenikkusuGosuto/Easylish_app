package com.example.easylish.present.rules.PresentPerfect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentPExer;
import com.example.easylish.present.rules.PresentPerfect.PresentPerfectRuleTwo;
import com.example.easylish.present.PresentActivity;

public class PresentPerfectRuleThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_present_perfect_rule_three);

    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ага-ага..",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentPerfectRuleThree.this, PresentActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(PresentPerfectRuleThree.this, PresentPerfectRuleTwo.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PresentPerfectRuleThree.this, PresentPExer.class);
        startActivity(intent);
    }
}

