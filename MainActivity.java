package com.example.mascoremanager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int score1AS=0;
    private int score2AS=0;
    private String score1="";
    private String score2="";

    TextView Title;
    TextView Winner;
    EditText Team1;
    TextView Team1Score;
    Button Add1;
    Button Subtract1;
    EditText Team2;
    TextView Team2Score;
    Button Add2;
    Button Subtract2;
    Button Reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //accessing
        Title = (TextView) findViewById(R.id.Title);
        Winner = (TextView) findViewById(R.id.Winner);
        Team1 = (EditText) findViewById(R.id.typeName1);
        Team1Score = (TextView) findViewById(R.id.Team1Score);
        Add1 = (Button) findViewById(R.id.addt1);
        Subtract1 = (Button) findViewById(R.id.subt1);
        Team2 = (EditText) findViewById(R.id.typeName2);
        Team2Score = (TextView) findViewById(R.id.Team2Score);
        Add2 = (Button) findViewById(R.id.addt2);
        Subtract2 = (Button) findViewById(R.id.subt2);
        Reset = (Button) findViewById(R.id.reset);

        //Team 1:

        //Name

        //Add
        Add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                score1AS += 1;
                score1 = ""+ score1AS;
                Team1Score.setText("Score:"+ score1);

                if(score1AS == 10){
                    Winner.setText("Winner is:"+Team1.getText().toString());
                }

            }
        });

        //Subtract
        Subtract1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                score1AS -= 1;
                score1 = ""+ score1AS;
                Team1Score.setText("Score:"+ score1);
            }
        });

        //Team 2:

        //Name

        //Add
        Add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                score2AS += 1;
                score2 = ""+ score2AS;
                Team2Score.setText("Score:"+ score2);

                if(score2AS == 10){
                    Winner.setText("Winner is:"+Team2.getText().toString());
                }
            }
        });

        //Subtract
        Subtract2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                score2AS -= 1;
                score2 = ""+ score2AS;
                Team2Score.setText("Score:"+ score2);
            }
        });


        //Neither
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                score1AS=0;
                score2AS=0;

                Team1Score.setText("Score:");
                Team2Score.setText("Score:");
                Winner.setText("Winner is: ");

            }
        });


    }
}
