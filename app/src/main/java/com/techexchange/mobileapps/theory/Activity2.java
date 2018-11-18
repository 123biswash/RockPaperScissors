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
    String outputText="\n\n User     System     Win/Lose \n\n\n";
    public TextView showOutput;
    public ImageButton btnClickOne;
    public ImageButton btnClickTwo;
    public ImageButton btnClickThree;
    public ImageButton btnClickFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnClickOne = (ImageButton) findViewById(R.id.ImageButton01);
        btnClickTwo=(ImageButton) findViewById(R.id.ImageButton02);
        btnClickThree=(ImageButton) findViewById(R.id.ImageButton03);
        btnClickFour = (ImageButton) findViewById(R.id.ImageButton04);
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
                    Toast.makeText(Activity2.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity2.this, "Wrong answer", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Activity2.this, "Wrong answer", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Activity2.this, "Wrong answer", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(Activity2.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void playGameR(View view){
        if (current==2){
            current=1;
            outputText+="Rock   Paper   Lose \n";
            showOutput.setText(outputText);
        }else if(current==1){
            current=3;
            outputText+="Rock   Rock   Draw \n";
            showOutput.setText(outputText);
        }else if(current==3){
            current=2;
            outputText+="Rock   Paper   Lose \n";
            showOutput.setText(outputText);
        }else{
            current=3;
            outputText+="Rock   Scissors   Win \n";
            showOutput.setText(outputText);
        }
    }
    public void playGameP(View view){
        if (current==2){
            current=1;
            outputText+="Paper   Paper   Draw \n";
            showOutput.setText(outputText);
        }else if(current==1){
            current=3;
            outputText+="Paper   Rock   Win \n";
            showOutput.setText(outputText);
        }else if(current==3){
            current=4;
            outputText+="Paper   Paper   Draw \n";
            showOutput.setText(outputText);
        }else{
            current=1;
            outputText+="Paper   Scissors   Lose \n";
            showOutput.setText(outputText);
        }

    }
    public void playGameS(View view){
        if (current==2){
            current=4;
            outputText+="Scissors   Paper   Win \n";
            showOutput.setText(outputText);
        }else if(current==1){
            current=3;
            outputText+="Scissors   Rock   Lose \n";
            showOutput.setText(outputText);
        }else if(current==3){
            current=1;
            outputText+="Scissors   Paper   Win \n";
            showOutput.setText(outputText);
        }else{
            current=1;
            outputText+="Scissors   Scissors   Draw \n";
            showOutput.setText(outputText);
        }
    }
    public void reset(View view) {
        current=0;
        outputText="";
        showOutput.setText(outputText);
        Toast.makeText(Activity2.this, "Game has been reset!", Toast.LENGTH_SHORT).show();
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
