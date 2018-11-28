package com.techexchange.mobileapps.theory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class Activity4 extends AppCompatActivity {
    int current = 2;
    int choiceLeft = 2;

    public ImageButton btnClickOne;
    public ImageButton btnClickTwo;
    public ImageButton btnClickThree;
    public ImageButton btnClickFour;
    public ImageButton btnClickFive;
    public TextView userOutput;
    public TextView systemOutput;
    public TextView resultOutput;
    public TextView prevResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        btnClickOne = (ImageButton) findViewById(R.id.ImageButton01);
        btnClickTwo = (ImageButton) findViewById(R.id.ImageButton02);
        btnClickThree = (ImageButton) findViewById(R.id.ImageButton03);
        btnClickFour = (ImageButton) findViewById(R.id.ImageButton04);
        btnClickFive = (ImageButton) findViewById(R.id.ImageButton05);
        userOutput = findViewById(R.id.textId1);
        systemOutput = findViewById(R.id.textId2);
        resultOutput = findViewById(R.id.textId3);
        prevResult = findViewById(R.id.textId4);
        initialize();
        checkButton();
    }

    public void initialize() {
        userOutput.setText("User\n\n");
        systemOutput.setText("System\n\n");
        resultOutput.setText("Result\n\n");
        prevResult.setText("Previous\n\n");
    }

    public void checkButton() {
        btnClickOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current == 1 && choiceLeft > 0) {
                    btnClickOne.setImageResource(R.drawable.onegreen);

                    Toast.makeText(Activity4.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                } else {
                    choiceLeft = choiceLeft - 1;
                    Toast.makeText(Activity4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current == 2 && choiceLeft > 0) {
                    btnClickTwo.setImageResource(R.drawable.twogreen);

                    Toast.makeText(Activity4.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                } else {
                    choiceLeft = choiceLeft - 1;
                    Toast.makeText(Activity4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current == 3 && choiceLeft > 0) {
                    btnClickThree.setImageResource(R.drawable.threegreen);

                    Toast.makeText(Activity4.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                } else {
                    choiceLeft = choiceLeft - 1;
                    Toast.makeText(Activity4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClickFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current == 4 && choiceLeft > 0) {
                    btnClickFour.setImageResource(R.drawable.fourgreen);

                    Toast.makeText(Activity4.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                } else {
                    choiceLeft = choiceLeft - 1;
                    Toast.makeText(Activity4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClickFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current == 5 && choiceLeft > 0) {
                    btnClickFour.setImageResource(R.drawable.fivegreen);

                    Toast.makeText(Activity4.this, "Congratulations!", Toast.LENGTH_SHORT).show();
                } else {
                    choiceLeft = choiceLeft - 1;
                    Toast.makeText(Activity4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void playGameR(View view) {
        if (current == 2) {
            current = 5;

            userOutput.append("\nRock");
            systemOutput.append("\nRock");
            resultOutput.append("\nDraw");
            prevResult.append("\n2");
        } else if (current == 1) {
            current = 2;

            userOutput.append("\nRock");
            systemOutput.append("\nPaper");
            resultOutput.append("\nLose");
            prevResult.append("\n1");
        } else if (current == 3) {
            current = 4;

            userOutput.append("\nRock");
            systemOutput.append("\nScissors");
            resultOutput.append("\nWin");
            prevResult.append("\n3");
        } else if (current == 5) {
            current = 4;

            userOutput.append("\nRock");
            systemOutput.append("\nRock");
            resultOutput.append("\nDraw");
            prevResult.append("\n5");
        } else {
            current = 2;

            userOutput.append("\nRock");
            systemOutput.append("\nPaper");
            resultOutput.append("\nLose");
            prevResult.append("\n4");
        }
    }

    public void playGameP(View view) {
        if (current == 2) {
            current = 5;

            userOutput.append("\nPaper");
            systemOutput.append("\nRock");
            resultOutput.append("\nWin");
            prevResult.append("\n2");

        } else if (current == 1) {
            current = 5;

            userOutput.append("\nPaper");
            systemOutput.append("\nPaper");
            resultOutput.append("\nDraw");
            prevResult.append("\n1");
        } else if (current == 3) {
            current = 5;

            userOutput.append("\nPaper");
            systemOutput.append("\nScissors");
            resultOutput.append("\nLose");
            prevResult.append("\n3");
        } else if (current == 5) {
            current = 2;

            userOutput.append("\nPaper");
            systemOutput.append("\nRock");
            resultOutput.append("\nWin");
            prevResult.append("\n5");
        } else {
            current = 5;

            userOutput.append("\nPaper");
            systemOutput.append("\nPaper");
            resultOutput.append("\nDraw");
            prevResult.append("\n4");
        }

    }

    public void playGameS(View view) {
        if (current == 2) {
            current = 3;

            userOutput.append("\nScissors");
            systemOutput.append("\nRock");
            resultOutput.append("\nLose");
            prevResult.append("\n2");
        } else if (current == 1) {
            current = 3;

            userOutput.append("\nScissors");
            systemOutput.append("\nPaper");
            resultOutput.append("\nWin");
            prevResult.append("\n1");
        } else if (current == 3) {
            current = 5;

            userOutput.append("\nScissors");
            systemOutput.append("\nScissors");
            resultOutput.append("\nDraw");
            prevResult.append("\n3");
        } else if (current == 5) {
            current = 1;

            userOutput.append("\nScissors");
            systemOutput.append("\nRock");
            resultOutput.append("\nLose");
            prevResult.append("\n5");
        } else {
            current = 2;

            userOutput.append("\nScissors");
            systemOutput.append("\nPaper");
            resultOutput.append("\nWin");
            prevResult.append("\n4");

        }
    }

    public void reset(View view) {
        current = 0;
        Toast.makeText(Activity4.this, "Game has been reset!", Toast.LENGTH_SHORT).show();
        btnClickOne.setImageResource(R.drawable.one);
        btnClickTwo.setImageResource(R.drawable.two);
        btnClickThree.setImageResource(R.drawable.three);
        btnClickFour.setImageResource(R.drawable.four);
        btnClickFour.setImageResource(R.drawable.five);
        checkButton();
    }

    public void backView(View view) {
        finish();
    }
}
