package com.example.android.countryquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //start quiz
    public void startQuiz(View view) {
        //variable needed
        String userName;
        //find text entered by id
        EditText enteredName = (EditText) findViewById(R.id.customer_name);
        userName = enteredName.getText().toString();
        if (userName.equals("")) {
            Toast.makeText(this, getString(R.string.toast_no_name), Toast.LENGTH_SHORT).show();
        } else {
            setContentView(R.layout.question_1);
        }
    }

    public void tryAgain(View view) {
        setContentView(R.layout.question_1);
    }

    //first question
    //if answer is right increase score and go to second question
    //India correct answer
    public void goToSecondQuestion(View view) {
        //variable needed
        String correctAnswer1;
        //check for the entered text by id
        EditText answerCorrect = (EditText) findViewById(R.id.q1_ans);
        correctAnswer1 = answerCorrect.getText().toString();
        //if correct answer increase score and go to next question
        //equalsIgnoreCase compare just the content of the string
        if (correctAnswer1.equalsIgnoreCase("India")) {
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        } else {
            //else pop up a message and go to next question
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
        //no matter what happens, you still go to the next question
        setContentView(R.layout.question_2);
    }

    //second question
    //if answer is right increase score and go to third question
    public void goToThirdQuestion(View view) {
        //find the correct answer button checked
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q2_ans_correct);
        //if the correct answer is checked
        //increase score
        if (correctAnswer.isChecked()) {
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        }
        //toast msg
        else {
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
        //no matter what happens you still go to next question
        setContentView(R.layout.question_3);
    }

    //third question
    //if answer right increase score and to to fourth question
    public void goToFourthQuestion(View view) {
        //find the correct answer button checked
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q3_ans_correct);
        //if the correct answer is checked
        //increase score
        if (correctAnswer.isChecked()) {
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        }
        //toast msg
        else {
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
        //no matter what happens you still go to next question
        setContentView(R.layout.question_4);
    }

    //fourth question
    //if answer right increase score and to to fifth question
    public void goToFifthQuestion(View view) {
        //find the correct answer button checked
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q4_ans_correct);
        //if the correct answer is checked
        //increase score
        if (correctAnswer.isChecked()) {
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        }
        //toast msg
        else {
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
        //no matter what happens you still go to next question
        setContentView(R.layout.question_5);
    }

    //fifth question
    //if answer right increase score and to to sixth question
    public void goToSixthQuestion(View view) {
        //find the correct answer button checked
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q5_ans_correct);
        //if the correct answer is checked
        //increase score
        if (correctAnswer.isChecked()) {
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        }
        //toast msg
        else {
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
        //no matter what happens you still go to next question
        setContentView(R.layout.question_6);
    }

    //sixth question
    //if answer right increase score and to to seven question
    public void goToSevenQuestion(View view) {
        //find the correct answer button checked
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q6_ans_correct);
        //if the correct answer is checked
        //increase score
        if (correctAnswer.isChecked()) {
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        }
        //toast msg
        else {
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
        //no matter what happens you still go to next question
        setContentView(R.layout.question_7);
    }

    //seven question
    //if answer right increase score and to to eight question
    public void goToEightQuestion(View view) {
        //find the correct answer button checked
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q7_ans_correct);
        //if the correct answer is checked
        //increase score
        if (correctAnswer.isChecked()) {
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        }
        //toast msg
        else {
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
        //no matter what happens you still go to next question
        setContentView(R.layout.question_8);
    }

    //eight question
    //if answer right increase score and to to nine question
    public void goToNineQuestion(View view) {
        //find the correct answer button checked
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q8_ans_correct);
        //if the correct answer is checked
        //increase score
        if (correctAnswer.isChecked()) {
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        }
        //toast msg
        else {
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
        //no matter what happens you still go to next question
        setContentView(R.layout.question_9);
    }

    //nine question
    //if answer right increase score and to to ten question
    public void goToTenQuestion(View view) {

        //find the correct answer button checked
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q9_ans_correct);
        //if the correct answer is checked
        //increase score
        if (correctAnswer.isChecked()) {
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        }
        //toast msg
        else {
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
        //no matter what happens you still go to next question
        setContentView(R.layout.question_10);
    }

    //ten question
    //if answer right increase score and to to seven question
    public void goToScore(View view) {
        //find the correct answer button checked
        RadioButton correctAnswer = (RadioButton) findViewById(R.id.q10_ans_correct);
        //if the correct answer is checked
        //increase score
        if (correctAnswer.isChecked()) {
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        }
        //toast msg
        else {
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
        //no matter what happens you still go to next question
        setContentView(R.layout.final_question);
    }

    // score
    public void displayScore(View view) {
        TextView finalScore = findViewById(R.id.score_text);
        finalScore.setText(String.valueOf(score));
        Toast.makeText(this, getString(R.string.score) + score,Toast.LENGTH_SHORT).show();
    }

    //final question
    public void goToFinalQuestion(View view) {

        CheckBox sea = (CheckBox) findViewById(R.id.sea);
        CheckBox mountain = (CheckBox) findViewById(R.id.mountain);
        CheckBox city = (CheckBox) findViewById(R.id.city);

        //if all of them are checked increase score
        if (sea.isChecked() && mountain.isChecked() && city.isChecked()) {
            setContentView(R.layout.score);
            Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
            score++;
        } else {
            setContentView(R.layout.score);
            Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        }
    }
}
