package com.example.easylish.future.rules.FutureContinous;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.R;
import com.example.easylish.future.FutureActivity;
import com.example.easylish.past.PastActivity;

public class FutureContinousRules extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.rules_futurecontinous);
    }

    public void backpast(View view) {
        Intent intent=new Intent(FutureContinousRules.this, FutureActivity.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Такс такс такс..",
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void nextbtn(View view) {
        Intent intent = new Intent(FutureContinousRules.this, FutureContinousRuleTwo.class);
        startActivity(intent);
    }

}

