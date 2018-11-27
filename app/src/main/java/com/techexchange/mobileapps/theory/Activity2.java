package com.techexchange.mobileapps.theory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Activity2 extends AppCompatActivity {
    int current= 2;
    int choiceLeft=2;
    public TextView userOutput;
    public TextView systemOutput;
    public TextView resultOutput;

    public ImageButton btnClickOne;
    public ImageButton btnClickTwo;
    public ImageButton btnClickThree;
    public ImageButton btnClickFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnClickOne = findViewById(R.id.ImageButton01);
        btnClickTwo= findViewById(R.id.ImageButton02);
        btnClickThree= findViewById(R.id.ImageButton03);
        btnClickFour = findViewById(R.id.ImageButton04);
        userOutput = findViewById(R.id.textId1);
        systemOutput = findViewById(R.id.textId2);
        resultOutput = findViewById(R.id.textId3);
        initialize();
        checkButton();
    }

    public void initialize(){
        userOutput.setText("User\n\n");
        systemOutput.setText("System\n\n");
        resultOutput.setText("Result\n\n");
    }

    public void checkButton(){
        btnClickOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==1 && choiceLeft>0) {
                    btnClickOne.setImageResource(R.drawable.onegreen);
                    Toast.makeText(Activity2.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==2 && choiceLeft>0) {
                    btnClickTwo.setImageResource(R.drawable.twogreen);
                    Toast.makeText(Activity2.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==3 && choiceLeft>0) {
                    btnClickThree.setImageResource(R.drawable.threegreen);
                    Toast.makeText(Activity2.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClickFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==4 && choiceLeft>0) {
                    btnClickFour.setImageResource(R.drawable.fourgreen);
                    Toast.makeText(Activity2.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity2.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void playGameR(View view){
        if (current==2){
            current=1;
            userOutput.append("\nRock");
            systemOutput.append("\nPaper");
            resultOutput.append("\nLose");
        }else if(current==1){
            current=3;
            userOutput.append("\nRock");
            systemOutput.append("\nRock");
            resultOutput.append("\nDraw");
        }else if(current==3){
            current=2;
            userOutput.append("\nRock");
            systemOutput.append("\nPaper");
            resultOutput.append("\nLose");
        }else{
            current=3;
            userOutput.append("\nRock");
            systemOutput.append("\nScissors");
            resultOutput.append("\nWin");
        }
    }
    public void playGameP(View view){
        if (current==2){
            current=1;
            userOutput.append("\nPaper");
            systemOutput.append("\nPaper");
            resultOutput.append("\nDraw");
        }else if(current==1){
            current=3;
            userOutput.append("\nPaper");
            systemOutput.append("\nRock");
            resultOutput.append("\nWin");
        }else if(current==3){
            current=4;
            userOutput.append("\nPaper");
            systemOutput.append("\nPaper");
            resultOutput.append("\nDraw");
        }else{
            current=1;
            userOutput.append("\nPaper");
            systemOutput.append("\nScissors");
            resultOutput.append("\nLose");
        }

    }
    public void playGameS(View view){
        if (current==2){
            current=4;
            userOutput.append("\nScissors");
            systemOutput.append("\nPaper");
            resultOutput.append("\nWin");
        }else if(current==1){
            current=3;
            userOutput.append("\nScissors");
            systemOutput.append("\nRock");
            resultOutput.append("\nLose");
        }else if(current==3){
            current=1;
            userOutput.append("\nScissors");
            systemOutput.append("\nPaper");
            resultOutput.append("\nWin");
        }else{
            current=1;
            userOutput.append("\nScissors");
            systemOutput.append("\nScissors");
            resultOutput.append("\nDraw");
        }
    }
    public void reset(View view) {
        current=0;
        initialize();
        Toast.makeText(this, "Game has been reset!", Toast.LENGTH_SHORT).show();
        btnClickOne.setImageResource(R.drawable.one);
        btnClickTwo.setImageResource(R.drawable.two);
        btnClickThree.setImageResource(R.drawable.three);
        btnClickFour.setImageResource(R.drawable.four);
        checkButton();
    }

    public void backView(View view){
        finish();
    }

}
