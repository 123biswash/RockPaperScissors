package com.techexchange.mobileapps.theory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int current= 2;
    String outputText="User System  Win/Lose \n";
//    final TextView showOutput = (TextView) findViewById(R.id.textId);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageButton btnClickOne = (ImageButton) findViewById(R.id.ImageButton01);
        final ImageButton btnClickTwo=(ImageButton) findViewById(R.id.ImageButton02);
        final ImageButton btnClickThree=(ImageButton) findViewById(R.id.ImageButton03);
        final ImageButton btnClickFour = (ImageButton) findViewById(R.id.ImageButton04);
//        final TextView showOutput = (TextView) findViewById(R.id.textId);
        btnClickOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnClickOne.setImageResource(R.drawable.onegreen);
            }
        });
        btnClickTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnClickTwo.setImageDrawable(getDrawable(R.drawable.twogreen));
            }
        });
        btnClickThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnClickThree.setImageDrawable(getDrawable(R.drawable.threegreen));
            }
        });

        btnClickFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnClickFour.setImageDrawable(getDrawable(R.drawable.fourgreen));
            }
        });
    }

    private void playGameR(View view){
        if (current==2){
            current=1;
            outputText+="Rock   Paper   Lose \n";
//            showOutput.setText(outputText);
        }else if(current==1){
            current=3;
            outputText+="Rock   Rock   Draw \n";
//            showOutput.setText(outputText);
        }else if(current==3){
            current=2;
            outputText+="Rock   Paper   Lose \n";
//            showOutput.setText(outputText);
        }else{
            current=3;
            outputText+="Rock   Scissors   Win \n";
//            showOutput.setText(outputText);
        }
    }
    private void playGameP(View view){
        if (current==2){
            current=1;
            outputText+="Paper   Paper   Draw \n";
//            showOutput.setText(outputText);
        }else if(current==1){
            current=3;
            outputText+="Paper   Rock   Win \n";
//            showOutput.setText(outputText);
        }else if(current==3){
            current=4;
            outputText+="Paper   Paper   Draw \n";
//            showOutput.setText(outputText);
        }else{
            current=1;
            outputText+="Paper   Scissors   Lose \n";
//            showOutput.setText(outputText);
        }

    }
    private void playGameS(View view){
        if (current==2){
            current=4;
            outputText+="Scissors   Paper   Win \n";
//            showOutput.setText(outputText);
        }else if(current==1){
            current=3;
            outputText+="Scissors   Rock   Lose \n";
//            showOutput.setText(outputText);
        }else if(current==3){
            current=1;
            outputText+="Scissors   Paper   Win \n";
//            showOutput.setText(outputText);
        }else{
            current=1;
            outputText+="Scissors   Scissors   Draw \n";
//            showOutput.setText(outputText);
        }
    }
}
