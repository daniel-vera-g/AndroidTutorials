package com.example.android.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.attr.duration;
import static android.R.attr.publicKey;
import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer musicPlayer = MediaPlayer.create(this, R.raw.sky_sand);
//        Creating the two new Button Objects for the OnClick Listeners
        final Button playButton = (Button) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.start();
            }
        });
        Button pauseButton = (Button) findViewById(R.id.pauseButton);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pause();
            }
        });
        final Button increaseVolume = (Button) findViewById(R.id.volumeButton);
        increaseVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.setVolume(0.2f,0.2f);
            }
        });

        Button skipToMiddle = (Button) findViewById(R.id.skipToMiddle);
        skipToMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int duration = musicPlayer.getDuration();
                 duration = duration/1000;
                musicPlayer.seekTo(duration);
            }
        });

};
}
