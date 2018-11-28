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
    public TextView userOutput;
    public TextView systemOutput;
    public TextView resultOutput;
    public TextView prevResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        btnClickOne = (ImageButton) findViewById(R.id.ImageButton01);
        btnClickTwo=(ImageButton) findViewById(R.id.ImageButton02);
        userOutput = findViewById(R.id.textId1);
        systemOutput = findViewById(R.id.textId2);
        resultOutput = findViewById(R.id.textId3);
        prevResult = findViewById(R.id.textId4);
        initialize();
        checkButton();
    }
    public void initialize(){
        userOutput.setText("User\n\n");
        systemOutput.setText("System\n\n");
        resultOutput.setText("Result\n\n");
        prevResult.setText("PrevResult\n\n");
    }
    public void checkButton(){
        btnClickOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==1 && choiceLeft>0) {
                    btnClickOne.setImageResource(R.drawable.onegreenk);
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
                    btnClickTwo.setImageResource(R.drawable.twogreenk);
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
            userOutput.append("\nRock");
            systemOutput.append("\nPaper");
            resultOutput.append("\nLose");
            prevResult.append("\n1");

        }else{
            current=1;

            userOutput.append("\nRock");
            systemOutput.append("\nRock");
            resultOutput.append("\nDraw");
            prevResult.append("\n2");
        }
    }
    public void playGameP(View view){
        if (current==1){
            current=2;

            userOutput.append("\nPaper");
            systemOutput.append("\nPaper");
            resultOutput.append("\nDraw");
            prevResult.append("\n1");
        }else{
            current=1;

            userOutput.append("\nPaper");
            systemOutput.append("\nRock");
            resultOutput.append("\nWin");
            prevResult.append("\n2");
        }

    }
    public void playGameS(View view){
        if (current==1){
            current=2;
            outputText+="Scissor   Paper   Win \n";
            userOutput.append("\nScissor");
            systemOutput.append("\nPaper");
            resultOutput.append("\nWin");
            prevResult.append("\n1");

        }else{
            current=1;
            outputText+="Scissor   Rock   Lose \n";
            userOutput.append("\nScissor");
            systemOutput.append("\nRock");
            resultOutput.append("\nLose");
            prevResult.append("\n2");
        }
    }
    public void reset(View view) {
        current=0;
        initialize();
        Toast.makeText(Activity3.this, "Game has been reset!", Toast.LENGTH_SHORT).show();
        btnClickOne.setImageResource(R.drawable.onek);
        btnClickTwo.setImageResource(R.drawable.twok);
        checkButton();
    }

    public void nextView(View view){

        Intent intent = new Intent(Activity3.this, Activity4.class);

        startActivity(intent);
    }
    public void backView(View view){
        finish();
    }
}
