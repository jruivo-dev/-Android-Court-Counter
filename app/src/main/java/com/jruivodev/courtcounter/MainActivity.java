package com.jruivodev.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamAScore();
        displayTeamBScore();
    }

    int leftTeamScore = 0;
    int rightTeamScore = 0;

    public void displayTeamAScore() {
        TextView teamAScore = (TextView) findViewById(R.id.leftScore_textView);
        teamAScore.setText("" + leftTeamScore);
    }

    public void addThreePointsLeftTeam(View view) {
        leftTeamScore += 3;
        displayTeamAScore();
    }

    public void addTwoPointsLeftTeam(View view) {
        leftTeamScore += 2;
        displayTeamAScore();
    }

    public void addFreeThrowLeftTeam(View view) {
        leftTeamScore += 1;
        displayTeamAScore();
    }


    public void displayTeamBScore() {
        TextView teamAScore = (TextView) findViewById(R.id.rightScore_textView);
        teamAScore.setText("" + rightTeamScore);
    }

    public void addThreePointsRightTeam(View view) {
        rightTeamScore += 3;
        displayTeamBScore();
    }

    public void addTwoPointsRightTeam(View view) {
        rightTeamScore += 2;
        displayTeamBScore();
    }

    public void addFreeThrowRightTeam(View view) {
        rightTeamScore += 1;
        displayTeamBScore();
    }

    public void resetScores(View view){
        leftTeamScore=0;
        rightTeamScore=0;
        displayTeamAScore();
        displayTeamBScore();
    }

}
