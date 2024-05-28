package com.example.easylish;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    MediaPlayer mp;
    MediaPlayer mp2;
    SeekBar sk;

    AudioManager am;
    Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.settings);
        mp = mp.create(this, R.raw.lofi);
        mp2 = mp2.create(this, R.raw.meow1);
        sk = findViewById(R.id.seekBar);
        am = (AudioManager)getSystemService(Context.AUDIO_SERVICE);

        int maxvol = am.getStreamMaxVolume(am.STREAM_MUSIC);
        int curvol = am.getStreamVolume(am.STREAM_MUSIC);
        sk.setMax(maxvol);
        sk.setProgress(curvol);
        sk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                am.setStreamVolume(am.STREAM_MUSIC,progress,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void backmain(View view) {
        Intent intent=new Intent(SettingsActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void prev(View view) {
        int SUB_TIME = 5000;
        int curPos = mp.getCurrentPosition();
        if (curPos - SUB_TIME > 0){
            mp.seekTo(curPos - SUB_TIME);
        }
    }
    public void next(View view) {
        int ADD_TIME = 5000;
        int curPos = mp.getCurrentPosition();
        int dur = mp.getDuration();
        if (curPos + ADD_TIME > dur){
            mp.seekTo(curPos + ADD_TIME);
        }
    }
    public void catbtn(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Мрррррррр",
                Toast.LENGTH_LONG);
        toast.show();
        mp2.start();
    }
    public void play(View view) {
        mp.start();
    }
    public void pause(View view) {
        mp.pause();
    }
}
