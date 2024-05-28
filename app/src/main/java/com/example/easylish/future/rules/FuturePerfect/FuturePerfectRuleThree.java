package com.example.easylish.future.rules.FuturePerfect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FutureActivity;
import com.example.easylish.future.FuturePExer;
import com.example.easylish.past.PastActivity;

public class FuturePerfectRuleThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_future_perfect_rule_three);

    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Ага-ага..",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void backpast(View view) {
        Intent intent = new Intent(FuturePerfectRuleThree.this, FutureActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(FuturePerfectRuleThree.this, FuturePerfectRuleTwo.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(FuturePerfectRuleThree.this, FuturePExer.class);
        startActivity(intent);
    }
}

