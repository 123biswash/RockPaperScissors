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


public class Activity4 extends AppCompatActivity {
    int current= 2;
    int choiceLeft=2;
    int Score3= 0;
    String outputText="\n\n User     System     Win/Lose \n\n\n";
    public TextView showOutput;
    public ImageButton btnClickOne;
    public ImageButton btnClickTwo;
    public ImageButton btnClickThree;
    public ImageButton btnClickFour;
    public ImageButton btnClickFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Score3 = extras.getInt("key1");
        }
        btnClickOne = (ImageButton) findViewById(R.id.ImageButton01);
        btnClickTwo=(ImageButton) findViewById(R.id.ImageButton02);
        btnClickThree=(ImageButton) findViewById(R.id.ImageButton03);
        btnClickFour = (ImageButton) findViewById(R.id.ImageButton04);
        btnClickFive = (ImageButton) findViewById(R.id.ImageButton05);
        outputText="Score3: "+ Score3 + outputText;
        showOutput = findViewById(R.id.textId);
        showOutput.setText(outputText);
        checkButton();
    }
    public void checkButton(){
        btnClickOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==1 && choiceLeft>0) {
                    btnClickOne.setImageResource(R.drawable.onegreen);
                    Score3+=1;
                    Toast.makeText(Activity4.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==2 && choiceLeft>0) {
                    btnClickTwo.setImageResource(R.drawable.twogreen);
                    Score3+=1;
                    Toast.makeText(Activity4.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==3 && choiceLeft>0) {
                    btnClickThree.setImageResource(R.drawable.threegreen);
                    Score3+=1;
                    Toast.makeText(Activity4.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClickFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==4 && choiceLeft>0) {
                    btnClickFour.setImageResource(R.drawable.fourgreen);
                    Score3+=1;
                    Toast.makeText(Activity4.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==5 && choiceLeft>0) {
                    btnClickFour.setImageResource(R.drawable.five);
                    Score3+=1;
                    Toast.makeText(Activity4.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void playGameR(View view){
        if (current==2){
            current=5;
            outputText+="Rock   Rock   Draw 2\n";
            showOutput.setText(outputText);
        }else if(current==1){
            current=2;
            outputText+="Rock   Paper   Lose 1\n";
            showOutput.setText(outputText);
        }else if(current==3){
            current=4;
            outputText+="Rock   Scissors   Win 3\n";
            showOutput.setText(outputText);
        }else if(current==5){
            current=4;
            outputText+="Rock   Rock   Draw 5\n";
            showOutput.setText(outputText);
        }else{
            current=2;
            outputText+="Rock   Paper   Lose 4\n";
            showOutput.setText(outputText);
        }
    }
    public void playGameP(View view){
        if (current==2){
            current=5;
            outputText+="Paper   Rock   Win 2\n";
            showOutput.setText(outputText);
        }else if(current==1){
            current=5;
            outputText+="Paper   Paper   Draw 1\n";
            showOutput.setText(outputText);
        }else if(current==3){
            current=5;
            outputText+="Paper   Scissors   Draw 3\n";
            showOutput.setText(outputText);
        }else if(current==5){
            current=2;
            outputText+="Paper   Rock   Win 5\n";
            showOutput.setText(outputText);
        }else{
            current=5;
            outputText+="Paper   Paper   Draw 4\n";
            showOutput.setText(outputText);
        }

    }
    public void playGameS(View view){
        if (current==2){
            current=3;
            outputText+="Scissors   Rock   Lose 2\n";
            showOutput.setText(outputText);
        }else if(current==1){
            current=3;
            outputText+="Scissors   Paper   Win 1\n";
            showOutput.setText(outputText);
        }else if(current==3){
            current=5;
            outputText+="Scissors   Scissors   Draw 3\n";
            showOutput.setText(outputText);
        }else if(current==5){
            current=1;
            outputText+="Scissors   Rock   Lose 4\n";
            showOutput.setText(outputText);
        }else{
            current=2;
            outputText+="Scissors   Paper   Win 5\n";
            showOutput.setText(outputText);
        }
    }
    public void reset(View view) {
        current=0;
        outputText="";
        showOutput.setText(outputText);
        Toast.makeText(Activity4.this, "Game has been reset!", Toast.LENGTH_SHORT).show();
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
