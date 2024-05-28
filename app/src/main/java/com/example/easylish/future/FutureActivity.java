package com.example.easylish.future;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.easylish.MainActivity;
import com.example.easylish.R;
import com.example.easylish.future.rules.FutureContinous.FutureContinousRules;
import com.example.easylish.future.rules.FuturePerfect.FuturePerfectRules;
import com.example.easylish.future.rules.FuturePerfectContinous.FuturePerfectContinousRules;
import com.example.easylish.future.rules.FutureSimple.FutureSimpleRules;
import com.example.easylish.past.rules.PastContinous.PastContinousRules;
import com.example.easylish.past.rules.PastPerfect.PastPerfectRules;
import com.example.easylish.past.rules.PastPerfectContinous.PastPerfectContinousRules;
import com.example.easylish.past.rules.PastSimple.PastSimpleRules;
import com.example.easylish.ui.dashboard.DashboardFragment;

public class FutureActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.rules_future);
    }

    public void backmain(View view) {
        Intent intent=new Intent(FutureActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void futuresimple(View view) {
        Intent intent=new Intent(FutureActivity.this, FutureSimpleRules.class);
        startActivity(intent);
    }
    public void futurecontinous(View view) {
        Intent intent=new Intent(FutureActivity.this, FutureContinousRules.class);
        startActivity(intent);
    }
    public void futureperfect(View view) {
        Intent intent=new Intent(FutureActivity.this, FuturePerfectRules.class);
        startActivity(intent);
    }
    public void futurepf(View view) {
        Intent intent=new Intent(FutureActivity.this, FuturePerfectContinousRules.class);
        startActivity(intent);
    }

    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Сейчас будем читать!",
                Toast.LENGTH_LONG);
        toast.show();
    }
}

