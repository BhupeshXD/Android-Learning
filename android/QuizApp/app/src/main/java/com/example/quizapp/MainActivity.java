package com.example.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView optionA,optionB,optionC,optionD;
    private TextView questionnumber,question,score;
    private TextView checkout1,checkout2;
    int currentindex;
    int mscore=0;
    int qn=1;
    ProgressBar progressBar;

    int CurrentQuestion, CurrentOptionA,CurrentOptionB,CurrentOptionC,CurrentOptionD;
    
    
    private answerclass[] questionBank = new answerclass[]
            {
                    new answerclass(R.string.questions1, R.string.questions1_A, R.string.questions1_B, R.string.questions1_C, R.string.questions1_D, R.string.answers_1),
                    new answerclass(R.string.questions2, R.string.questions2_A, R.string.questions2_B, R.string.questions2_C, R.string.questions2_D, R.string.answers_2),
                    new answerclass(R.string.questions3, R.string.questions3_A, R.string.questions3_B, R.string.questions3_C, R.string.questions3_D, R.string.answers_3),
                    new answerclass(R.string.questions4, R.string.questions4_A, R.string.questions4_B, R.string.questions4_C, R.string.questions4_D, R.string.answers_4),
                    new answerclass(R.string.questions5, R.string.questions5_A, R.string.questions5_B, R.string.questions5_C, R.string.questions5_D, R.string.answers_5),
                    new answerclass(R.string.questions6, R.string.questions6_A, R.string.questions6_B, R.string.questions6_C, R.string.questions6_D, R.string.answers_6),
                    new answerclass(R.string.questions7, R.string.questions7_A, R.string.questions7_B, R.string.questions7_C, R.string.questions7_D, R.string.answers_7),
                    new answerclass(R.string.questions8, R.string.questions8_A, R.string.questions8_B, R.string.questions8_C, R.string.questions8_D, R.string.answers_8),

            };

    final int PROGRESS_BAR = (int) Math.ceil(100/questionBank.length);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);

        question = findViewById(R.id.questions);
        score = findViewById(R.id.score);
        questionnumber=findViewById(R.id.QuestionNumber);

        checkout1=findViewById(R.id.selectionoption);
        checkout2=findViewById(R.id.correctanswer);
        progressBar=findViewById(R.id.progress_bar);
        
        CurrentQuestion=questionBank[currentindex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA=questionBank[currentindex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB=questionBank[currentindex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC=questionBank[currentindex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD=questionBank[currentindex].getOptionD();
        optionD.setText(CurrentOptionD);
        
        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               checkAnswer(CurrentOptionA);
               updateQuestion();
            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionB);
                updateQuestion();
            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionC);
                updateQuestion();
            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(CurrentOptionD);
                updateQuestion();
            }
        });
        
        
    }

    private void checkAnswer(int userSelection) {
        int correctanswer = questionBank[currentindex].getAnswerid();

        checkout1.setText(userSelection);
        checkout2.setText(correctanswer);

        String m = checkout1.getText().toString().trim();
        String n = checkout1.getText().toString().trim();

        if (m.equals(n)) {
            Toast.makeText(getApplicationContext(), "Right", Toast.LENGTH_LONG).show();
            mscore = mscore + 1;
        } else {
            Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
        }
    }

            private void updateQuestion () {
                currentindex = (currentindex + 1) % questionBank.length;
        if(currentindex==0){
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("GameOver");
            alert.setCancelable(false);
            alert.setMessage("Your Score" +score + "points");
            alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
               mscore = 0;
               qn =0;
               progressBar.setProgress(0);
               score.setText("Score" + mscore + "/" + questionBank.length);
               questionnumber.setText(qn + "/" + questionBank.length + "Question");
                }
            });

        }



            CurrentQuestion = questionBank[currentindex].getQuestionid();
            question.setText(CurrentQuestion);
            CurrentOptionA = questionBank[currentindex].getOptionA();
            optionA.setText(CurrentOptionA);
            CurrentOptionB = questionBank[currentindex].getOptionB();
            optionB.setText(CurrentOptionB);
            CurrentOptionC = questionBank[currentindex].getOptionC();
            optionC.setText(CurrentOptionC);
            CurrentOptionD = questionBank[currentindex].getOptionD();
            optionD.setText(CurrentOptionD);

            qn = qn + 1;
            if (qn <= questionBank.length) {
                questionnumber.setText(qn + "/" + questionBank.length + "Question");
            }
            score.setText("Score" + mscore + "/" + questionBank.length);
            progressBar.incrementProgressBy(PROGRESS_BAR);
        }
    }