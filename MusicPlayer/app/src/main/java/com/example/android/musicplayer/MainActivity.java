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

    private MediaPlayer musicPlayer;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Intialititing Media Player Object
        musicPlayer = MediaPlayer.create(this, R.raw.sky_sand);


//        Finding the Pause Button
        final Button playButton = (Button) findViewById(R.id.playButton);
//        Activating the setOnItemClickListener for the play Button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.start();
                musicPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast.makeText(MainActivity.this, "I'm Done!",
                                Toast.LENGTH_LONG).show();
                    }
                });
            }
        });

        //        Finding the Pause Button
        Button pauseButton = (Button) findViewById(R.id.pauseButton);
//        Activating the setOnItemClickListener for the pause Button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicPlayer.pause();
            }
        });

    }
}