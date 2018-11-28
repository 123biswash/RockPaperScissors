package com.techexchange.mobileapps.theory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class Activity3 extends AppCompatActivity {
    int current= 2;
    int choiceLeft=1;
    int Score2= 0;
    String outputText="\n\n User     System     Win/Lose \n\n\n";
    public TextView showOutput;
    public ImageButton btnClickOne;
    public ImageButton btnClickTwo;
    public ImageButton btnClickThree;
    public ImageButton btnClickFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Score2 = extras.getInt("key1");
        }
        btnClickOne = (ImageButton) findViewById(R.id.ImageButton01);
        btnClickTwo=(ImageButton) findViewById(R.id.ImageButton02);
        showOutput = findViewById(R.id.textId);
        outputText="Score2: "+ Score2 + outputText;
        showOutput.setText(outputText);
        checkButton();
    }
    public void checkButton(){
        btnClickOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==1 && choiceLeft>0) {
                    btnClickOne.setImageResource(R.drawable.onegreen);
                    Score2+=1;
                    Toast.makeText(Activity3.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity3.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==2 && choiceLeft>0) {
                    btnClickTwo.setImageResource(R.drawable.twogreen);
                    Score2+=1;
                    Toast.makeText(Activity3.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(Activity3.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void playGameR(View view){
        if (current==1){
            current=2;
            outputText+="Rock   Paper   Lose \n";
            showOutput.setText(outputText);
        }else{
            current=1;
            outputText+="Rock   Rock   Draw \n";
            showOutput.setText(outputText);
        }
    }
    public void playGameP(View view){
        if (current==1){
            current=2;
            outputText+="Paper   Paper   Draw \n";
            showOutput.setText(outputText);
        }else{
            current=1;
            outputText+="Paper   Rock   Win \n";
            showOutput.setText(outputText);
        }

    }
    public void playGameS(View view){
        if (current==1){
            current=2;
            outputText+="Scissor   Paper   Win \n";
            showOutput.setText(outputText);
        }else{
            current=1;
            outputText+="Scissor   Rock   Lose \n";
            showOutput.setText(outputText);
        }
    }
    public void reset(View view) {
        current=0;
        outputText="";
        showOutput.setText(outputText);
        Toast.makeText(Activity3.this, "Game has been reset!", Toast.LENGTH_SHORT).show();
        btnClickOne.setImageResource(R.drawable.one);
        btnClickTwo.setImageResource(R.drawable.two);
        btnClickThree.setImageResource(R.drawable.three);
        btnClickFour.setImageResource(R.drawable.four);
        checkButton();
    }

    public void nextView(View view){
        outputText="";
        showOutput.setText(outputText);
        Intent intent = new Intent(Activity3.this, Activity4.class);
        intent.putExtra("key3", Score2);
        startActivity(intent);
    }
    public void backView(View view){
        finish();
    }
}
