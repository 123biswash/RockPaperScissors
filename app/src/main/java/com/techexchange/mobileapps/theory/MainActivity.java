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

public class MainActivity extends AppCompatActivity {
    int current= 3;
    int choiceLeft=2;
    public ImageButton btnClickOne;
    public ImageButton btnClickTwo;
    public ImageButton btnClickThree;
    public ImageButton btnClickFour;
    public TextView userOutput;
    public TextView systemOutput;
    public TextView resultOutput;
    public TextView previousOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClickOne = (ImageButton) findViewById(R.id.ImageButton01);
        btnClickTwo=(ImageButton) findViewById(R.id.ImageButton02);
        btnClickThree=(ImageButton) findViewById(R.id.ImageButton03);
        btnClickFour = (ImageButton) findViewById(R.id.ImageButton04);
        userOutput = findViewById(R.id.textId1);
        systemOutput = findViewById(R.id.textId2);
        resultOutput = findViewById(R.id.textId3);
        previousOutput = findViewById(R.id.textId4);
        initialize();
        checkButton();
    }
    public void initialize(){
        userOutput.setText("User\n\n");
        systemOutput.setText("System\n\n");
        resultOutput.setText("Result\n\n");
        previousOutput.setText("Previous\n\n");
    }
    public void checkButton(){
        btnClickOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==1 && choiceLeft>0) {
                    btnClickOne.setImageResource(R.drawable.onegreenk);

                    Toast.makeText(MainActivity.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(MainActivity.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==2 && choiceLeft>0) {
                    btnClickTwo.setImageResource(R.drawable.twogreenk);

                    Toast.makeText(MainActivity.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(MainActivity.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==3 && choiceLeft>0) {
                    btnClickThree.setImageResource(R.drawable.threegreenk);

                    Toast.makeText(MainActivity.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(MainActivity.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClickFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(current==4 && choiceLeft>0) {
                    btnClickFour.setImageResource(R.drawable.fourgreenk);

                    Toast.makeText(MainActivity.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                }else{
                    choiceLeft=choiceLeft-1;
                    Toast.makeText(MainActivity.this, "Wrong answer", Toast.LENGTH_SHORT).show();
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
            previousOutput.append("\n2");

        }else if(current==1){
            current=3;
            userOutput.append("\nRock");
            systemOutput.append("\nRock");
            resultOutput.append("\nDraw");
            previousOutput.append("\n1");
        }else if(current==3){
            current=2;
            userOutput.append("\nRock");
            systemOutput.append("\nPaper");
            resultOutput.append("\nLose");
            previousOutput.append("\n3");
        }else{
            current=3;
            userOutput.append("\nRock");
            systemOutput.append("\nScissors");
            resultOutput.append("\nWin");
            previousOutput.append("\n4");
        }
    }
    public void playGameP(View view){
        if (current==2){
            current=1;
            userOutput.append("\nPaper");
            systemOutput.append("\nPaper");
            resultOutput.append("\nDraw");
            previousOutput.append("\n2");
        }else if(current==1){
            current=3;
            userOutput.append("\nPaper");
            systemOutput.append("\nRock");
            resultOutput.append("\nWin");
            previousOutput.append("\n1");
        }else if(current==3){
            current=4;
            userOutput.append("\nPaper");
            systemOutput.append("\nPaper");
            resultOutput.append("\nDraw");
            previousOutput.append("\n3");
        }else{
            current=1;
            userOutput.append("\nPaper");
            systemOutput.append("\nScissors");
            resultOutput.append("\nLose");
            previousOutput.append("\n4");
        }

    }
    public void playGameS(View view){
        if (current==2){
            current=4;
            userOutput.append("\nScissors");
            systemOutput.append("\nPaper");
            resultOutput.append("\nWin");
            previousOutput.append("\n2");
        }else if(current==1){
            current=3;
            userOutput.append("\nScissors");
            systemOutput.append("\nRock");
            resultOutput.append("\nLose");
            previousOutput.append("\n1");
        }else if(current==3){
            current=1;
            userOutput.append("\nScissors");
            systemOutput.append("\nPaper");
            resultOutput.append("\nWin");
            previousOutput.append("\n3");
        }else{
            current=1;
            userOutput.append("\nScissors");
            systemOutput.append("\nScissors");
            resultOutput.append("\nDraw");
            previousOutput.append("\n4");
        }
    }

    public void reset(View view) {
        current=0;
        initialize();
        Toast.makeText(MainActivity.this, "Game has been reset!", Toast.LENGTH_SHORT).show();
        btnClickOne.setImageResource(R.drawable.onek);
        btnClickTwo.setImageResource(R.drawable.twok);
        btnClickThree.setImageResource(R.drawable.threek);
        btnClickFour.setImageResource(R.drawable.fourk);
        checkButton();
    }

    public void nextView(View view){
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }

}
