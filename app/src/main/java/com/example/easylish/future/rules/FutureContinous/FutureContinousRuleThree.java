package com.example.easylish.future.rules.FutureContinous;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FutureActivity;
import com.example.easylish.future.FutureCExer;
import com.example.easylish.past.PastActivity;

public class FutureContinousRuleThree extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_future_continous_rule_three);

    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Можно приступать к упражнениям!",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void backpast(View view) {
        Intent intent = new Intent(FutureContinousRuleThree.this, FutureActivity.class);
        startActivity(intent);
    }

    public void prevbtn(View view) {
        Intent intent = new Intent(FutureContinousRuleThree.this, FutureContinousRuleTwo.class);
        startActivity(intent);
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(FutureContinousRuleThree.this, FutureCExer.class);
        startActivity(intent);
    }
}

