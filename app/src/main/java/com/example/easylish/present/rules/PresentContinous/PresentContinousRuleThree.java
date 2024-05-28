package com.example.easylish.present.rules.PresentContinous;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.present.PresentActivity;
import com.example.easylish.present.PresentCExer;

public class PresentContinousRuleThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_present_continous_rule_three);

    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Можно приступать к упражнениям!",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void backpast(View view) {
        Intent intent = new Intent(PresentContinousRuleThree.this, PresentActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(PresentContinousRuleThree.this, PresentContinousRuleTwo.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(PresentContinousRuleThree.this, PresentCExer.class);
        startActivity(intent);
    }
}

