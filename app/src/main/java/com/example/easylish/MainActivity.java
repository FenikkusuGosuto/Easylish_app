package com.example.easylish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.easylish.databinding.ActivityMainBinding;
import com.example.easylish.future.FutureActivity;
import com.example.easylish.future.FutureExer;
import com.example.easylish.past.PastActivity;
import com.example.easylish.past.PastExer;
import com.example.easylish.present.PresentActivity;
import com.example.easylish.present.PresentExer;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity  {

    MediaPlayer mp;
    MediaPlayer mp1;
    MediaPlayer mp2;
    MediaPlayer mp3;
    MediaPlayer mp4;
    private static final String CHANNEL_ID = "CHANNEL_ID";

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mp = mp.create(this, R.raw.steps);
        mp1 = mp1.create(this, R.raw.meow6);
        mp2 = mp2.create(this, R.raw.meow2);
        mp3 = mp3.create(this, R.raw.meow3);
        mp4 = mp4.create(this, R.raw.mice);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


    }


    public void catbtn1(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Коты тоже учат английский!",
                Toast.LENGTH_LONG);
        toast.show();
        mp1.start();
    }

    public void catbtn2(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Подготовься к упражнениям!",
                Toast.LENGTH_LONG);
        toast.show();
        mp2.start();
    }

    public void catbtn3(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Переходим к практике!",
                Toast.LENGTH_LONG);
        toast.show();
        mp3.start();
    }

    public void mouse(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Пипипипи",
                Toast.LENGTH_LONG);
        toast.show();
        mp4.start();
    }
    public void steps(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "топ топ топ",
                Toast.LENGTH_LONG);
        toast.show();
        mp.start();
    }

    public void btn(View view) {
        Intent intent=new Intent(MainActivity.this, vazhno.class);
        startActivity(intent);
    }

    public void startPastRules(View view) {
            Intent intent=new Intent(MainActivity.this, PastActivity.class);
            startActivity(intent);
        }

    public void startPresentRules(View view) {
        Intent intent=new Intent(MainActivity.this, PresentActivity.class);
        startActivity(intent);
    }

    public void startFutureRules(View view) {
        Intent intent=new Intent(MainActivity.this, FutureActivity.class);
        startActivity(intent);
    }

    public void startPastExer(View view) {
        Intent intent=new Intent(MainActivity.this, PastExer.class);
        startActivity(intent);
    }

    public void startPresentExer(View view) {
        Intent intent=new Intent(MainActivity.this, PresentExer.class);
        startActivity(intent);
    }

    public void startFutureExer(View view) {
        Intent intent=new Intent(MainActivity.this, FutureExer.class);
        startActivity(intent);
    }


    public void startSettings(View view) {
        Intent intent=new Intent(MainActivity.this, SettingsActivity.class);
        startActivity(intent);
    }
    }