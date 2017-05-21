package com.example.android.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Calling the playMusic method to play the song
    Button playMusic = (Button) findViewById(R.id.playButton);
    playMusic setOnClick
        //making an instance of the meadiaPlayer class
        MediaPlayer musicPlayer = MediaPlayer.create(this, R.raw.sky_sand);

    //Calling the pauseMusic method to pause the song
    public void pauseMusic(View view){
        musicPlayer.pause();
    }
    }

}
