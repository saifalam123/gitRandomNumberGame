package com.example.appnumber11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    private static final SecureRandom secureRandomNumber = new SecureRandom();

    private enum Status{NOTSTARTEDYET , PROCEED , WON , LOST}  // In simple words the enum is the keyword which help us to make custom made datatypes!
    /* Or yeh jo enum kay agye likha hai yeh uss datatype ka naam hai jese int float etc wese hee Status humari custom made datatype ka naam hai.
     * Or yeh jo {} iss kay andar likha hai yeh wo values hain jo kay yeh accept karega jese boolean datatype can accept only true and false issi tarah yeh bhi sirf yeh 4 values hee accept karega
      * In datatypes ko value dene ka ek special tareeqa hai jo kay aap datatype ka naam kay sath . laga kar dete hou.*/


    private static final int TIGER_CLAWS = 2;
    private static final int TREE = 3;
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int PANTHAR = 12;

    TextView txtCalculation;
    ImageView imgDice;
    Button btnRestartTheGame;
    TextView txtGameStatus;

    Status gameStatus = Status.NOTSTARTEDYET;
    String oldTxtCalculationValue = "";
    boolean firstTime = true;
    int points;


    // static keyowrd se hum bina class ka object banaye sirf class kay naam se uss variable ko access kar sakte hain.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtCalculation = (TextView)findViewById(R.id.txtCalculation);
        imgDice = (ImageView)findViewById(R.id.imgDice);
        btnRestartTheGame = (Button)findViewById(R.id.btnRestartTheGame);
        txtGameStatus = (TextView)findViewById(R.id.txtGameStatus);

        imgDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Making an image a onClickListener!
            }
        });

    }

    private void imageInvisible(){
        imgDice.setVisibility(View.INVISIBLE);
    }
    private void buttonInvisible(){
        btnRestartTheGame.setVisibility(View.INVISIBLE);
    }


}
