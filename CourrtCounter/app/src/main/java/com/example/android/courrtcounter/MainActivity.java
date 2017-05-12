package com.example.android.courrtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */

    //-----------------Buttons do add Points for Team A------------------
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreA);
        scoreView.setText(String.valueOf(score));
    }

    //Adds Three for Team A
    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }


    //Adds two for Team A
    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    //Adds One for Team A
    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    //-----------------Buttons do add Points for Team B------------------
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreB);
        scoreView.setText(String.valueOf(score));
    }

    //Adds Three for Team B
    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }


    //Adds two for Team B
    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    //Adds One for Team B
    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    //-----------------------------------------------------------------
    /*
    Reset Score of Game
     */
    public void resetScoreOfGame(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
