package com.example.android.countryquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String userName;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //start quiz
    public void startQuiz(View view) {
        EditText enteredName = (EditText) findViewById(R.id.customer_name);
        userName = enteredName.getText().toString();
        if (userName.equals("")) {
            Toast.makeText(this, getString(R.string.toast_no_name), Toast.LENGTH_SHORT).show();
            return;
        } else {
            setContentView(R.layout.question_1);
        }
    }

    public void tryAgain(View view) {
        setContentView(R.layout.question_1);
    }

    //    wrong answer = no points
//    public void wrongAnswer(View view) {
//        Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
//        setContentView(R.layout.question_2);
//    }

    //first question
    //if answer is right increase score and go to second question
    public void goToSecondQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            //answer correct = 1 point
            case R.id.q1_ans_correct:
                if (checked) {
                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
            case R.id.q1_ans1 :
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case  R.id.q1_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case  R.id.q1_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
        }
    }

    //second question
    //if answer is right increase score and go to third question
    public void goToThirdQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }

                //answer correct = 1 point
            case R.id.q1_ans_correct:
                if (checked) {
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
        }
    }

    //third question
    //if answer right increase score and to to fourth question
    public void goToFourthQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }

                //answer correct = 1 point
            case R.id.q1_ans_correct:
                if (checked) {
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
        }
    }

    //fourth question
    //if answer right increase score and to to fifth question
    public void goToFifthQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }

                //answer correct = 1 point
            case R.id.q1_ans_correct:
                if (checked) {
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
        }
    }

    //fifth question
    //if answer right increase score and to to sixth question
    public void goToSixthQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }

                //answer correct = 1 point
            case R.id.q1_ans_correct:
                if (checked) {
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
        }
    }

    //sixth question
    //if answer right increase score and to to seven question
    public void goToSevenQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }

                //answer correct = 1 point
            case R.id.q1_ans_correct:
                if (checked) {
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
        }
    }

    //seven question
    //if answer right increase score and to to eight question
    public void goToEightQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }

                //answer correct = 1 point
            case R.id.q1_ans_correct:
                if (checked) {
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
        }
    }

    //eight question
    //if answer right increase score and to to nine question
    public void goToNineQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }

                //answer correct = 1 point
            case R.id.q1_ans_correct:
                if (checked) {
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
        }
    }

    //nine question
    //if answer right increase score and to to ten question
    public void goToTenQuestion(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }

                //answer correct = 1 point
            case R.id.q1_ans_correct:
                if (checked) {
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
        }
    }

    //ten question
    //if answer right increase score and to to seven question
    public void goToScore(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }
            case R.id.q1_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_2);
                    break;
                }

                //answer correct = 1 point
            case R.id.q1_ans_correct:
                if (checked) {
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
        }
    }
}
