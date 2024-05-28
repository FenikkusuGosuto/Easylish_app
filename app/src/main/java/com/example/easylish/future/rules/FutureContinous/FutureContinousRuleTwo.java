package com.example.easylish.future.rules.FutureContinous;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FutureActivity;
import com.example.easylish.past.PastActivity;

public class FutureContinousRuleTwo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_future_continous_rule_two);

    }


    public void backpast(View view) {
        Intent intent = new Intent(FutureContinousRuleTwo.this, FutureActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(FutureContinousRuleTwo.this, FutureContinousRules.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(FutureContinousRuleTwo.this, FutureContinousRuleThree.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Хммм..",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

