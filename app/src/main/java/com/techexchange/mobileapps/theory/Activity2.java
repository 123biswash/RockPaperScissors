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
    public TextView showOutput;
    public ImageButton btnClickOne;
    public ImageButton btnClickTwo;
    public ImageButton btnClickThree;
    public ImageButton btnClickFour;
    public TextView userOutput;
    public TextView systemOutput;
    public TextView resultOutput;
    public TextView prevResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnClickOne = (ImageButton) findViewById(R.id.ImageButton01);
        btnClickTwo=(ImageButton) findViewById(R.id.ImageButton02);
        btnClickThree=(ImageButton) findViewById(R.id.ImageButton03);
        btnClickFour = (ImageButton) findViewById(R.id.ImageButton04);
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
                    btnClickTwo.setImageResource(R.drawable.twogreenk);

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
                    btnClickThree.setImageResource(R.drawable.threegreenk);

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
                    btnClickFour.setImageResource(R.drawable.fourgreenk);

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

            userOutput.append("\nRock");
            systemOutput.append("\nPaper");
            resultOutput.append("\nLose");
            prevResult.append("\n2");

        }else if(current==1){
            current=3;

            userOutput.append("\nRock");
            systemOutput.append("\nRock");
            resultOutput.append("\nDraw");
            prevResult.append("\n1");

        }else if(current==3){
            current=2;

            userOutput.append("\nRock");
            systemOutput.append("\nPaper");
            resultOutput.append("\nLose");
            prevResult.append("\n3");

        }else{
            current=3;

            userOutput.append("\nRock");
            systemOutput.append("\nScissors");
            resultOutput.append("\nWin");
            prevResult.append("\n4");

        }
    }
    public void playGameP(View view){
        if (current==2){
            current=1;
            userOutput.append("\nPaper");
            systemOutput.append("\nPaper");
            resultOutput.append("\nDraw");
            prevResult.append("\n2");

        }else if(current==1){
            current=3;
            userOutput.append("\nPaper");
            systemOutput.append("\nRock");
            resultOutput.append("\nWin");
            prevResult.append("\n1");
        }else if(current==3){
            current=4;
            userOutput.append("\nPaper");
            systemOutput.append("\nPaper");
            resultOutput.append("\nDraw");
            prevResult.append("\n3");
        }else{
            current=1;
            userOutput.append("\nPaper");
            systemOutput.append("\nScissors");
            resultOutput.append("\nLose");
            prevResult.append("\n2");
        }

    }
    public void playGameS(View view){
        if (current==2){
            current=4;

            userOutput.append("\nScissors");
            systemOutput.append("\nPaper");
            resultOutput.append("\nWin");
            prevResult.append("\n2");
        }else if(current==1){
            current=3;

            userOutput.append("\nScissors");
            systemOutput.append("\nRock");
            resultOutput.append("\nLose");
            prevResult.append("\n1");
        }else if(current==3){
            current=1;
            userOutput.append("\nScissors");
            systemOutput.append("\nPaper");
            resultOutput.append("\nWin");
            prevResult.append("\n3");
        }else{
            current=1;
            userOutput.append("\nScissors");
            systemOutput.append("\nScissors");
            resultOutput.append("\nDraw");
            prevResult.append("\n4");
        }
    }
    public void reset(View view) {
        current=0;
        initialize();
        Toast.makeText(Activity2.this, "Game has been reset!", Toast.LENGTH_SHORT).show();
        btnClickOne.setImageResource(R.drawable.onek);
        btnClickTwo.setImageResource(R.drawable.twok);
        btnClickThree.setImageResource(R.drawable.threek);
        btnClickFour.setImageResource(R.drawable.fourk);
        checkButton();
    }

    public void nextView(View view){

        Intent intent = new Intent(Activity2.this, Activity3.class);

        startActivity(intent);
    }
    public void backView(View view){
        finish();
    }
}
