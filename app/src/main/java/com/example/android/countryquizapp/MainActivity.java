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

    private String userName;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);
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

    //first question
    //if answer is right increase score and go to second question
    public void goToSecondQuestion(View view) {
//        // Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//        // Check which radio button was clicked
//        switch (view.getId()) {
//            //answer correct = 1 point
//            case R.id.q1_ans_correct:
//                if (checked) {
//                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
//                    setContentView(R.layout.question_2);
//                    score++;
//                    break;
//                }
//            case R.id.q1_ans1:
//                if (checked) {
//                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
//                    setContentView(R.layout.question_2);
//                    break;
//                }
//            case R.id.q1_ans2:
//                if (checked) {
//                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
//                    setContentView(R.layout.question_2);
//                    break;
//                }
//            case R.id.q1_ans3:
//                if (checked) {
//                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
//                    setContentView(R.layout.question_2);
//                    break;
//                }

        EditText enteredName = (EditText) findViewById(R.id.customer_name);
        userName = enteredName.getText().toString();
        if (userName.equals("")) {
            Toast.makeText(this, getString(R.string.toast_no_name), Toast.LENGTH_SHORT).show();
            return;
        } else {
            setContentView(R.layout.question_1);
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
            case R.id.q2_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_3);
                    break;
                }
            case R.id.q2_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_3);
                    break;
                }
            case R.id.q2_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_3);
                    break;
                }
                //answer correct = 1 point
            case R.id.q2_ans_correct:
                if (checked) {
                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_3);
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
            case R.id.q3_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_4);
                    break;
                }
            case R.id.q3_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_4);
                    break;
                }
            case R.id.q3_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_4);
                    break;
                }
                //answer correct = 1 point
            case R.id.q3_ans_correct:
                if (checked) {
                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_4);
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
            case R.id.q4_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_5);
                    break;
                }
            case R.id.q4_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_5);
                    break;
                }
            case R.id.q4_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_5);
                    break;
                }
                //answer correct = 1 point
            case R.id.q4_ans_correct:
                if (checked) {
                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_5);
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
            case R.id.q5_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_6);
                    break;
                }
            case R.id.q5_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_6);
                    break;
                }
            case R.id.q5_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_6);
                    break;
                }

                //answer correct = 1 point
            case R.id.q5_ans_correct:
                if (checked) {
                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_6);
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
            case R.id.q6_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_7);
                    break;
                }
            case R.id.q6_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_7);
                    break;
                }
            case R.id.q6_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_7);
                    break;
                }
                //answer correct = 1 point
            case R.id.q6_ans_correct:
                if (checked) {
                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_7);
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
            case R.id.q7_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_8);
                    break;
                }
            case R.id.q7_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_8);
                    break;
                }
            case R.id.q7_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_8);
                    break;
                }

                //answer correct = 1 point
            case R.id.q7_ans_correct:
                if (checked) {
                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_8);
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
            case R.id.q8_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_9);
                    break;
                }
            case R.id.q8_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_9);
                    break;
                }
            case R.id.q8_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_9);
                    break;
                }
                //answer correct = 1 point
            case R.id.q8_ans_correct:
                if (checked) {
                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_9);
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
            case R.id.q9_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_10);
                    break;
                }
            case R.id.q9_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_10);
                    break;
                }
            case R.id.q9_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_10);
                    break;
                }
                //answer correct = 1 point
            case R.id.q9_ans_correct:
                if (checked) {
                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.question_10);
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
            case R.id.q10_ans1:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.final_question);
                    break;
                }
            case R.id.q10_ans2:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.final_question);
                    break;
                }
            case R.id.q10_ans3:
                if (checked) {
                    Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.final_question);
                    break;
                }

                //answer correct = 1 point
            case R.id.q10_ans_correct:
                if (checked) {
                    Toast.makeText(this, getString(R.string.correct_answer), Toast.LENGTH_SHORT).show();
                    setContentView(R.layout.final_question);
                    score++;
                    break;
                }
        }
    }

    // score
    public void displayScore(View view) {
        TextView finalScore = findViewById(R.id.score_text);
        finalScore.setText(String.valueOf(score));
    }

    //final question
    public void goToFinalQuestion(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            //if sea case
            //increase score
            case R.id.sea:
                if (checked)
                    setContentView(R.layout.score);
                score++;
                //if mountain case
                //increase score
            case R.id.mountain:
                if (checked)
                    setContentView(R.layout.score);
                score++;
                //if city case
                //increase score
            case R.id.city:
                if (checked)
                    setContentView(R.layout.score);
                score++;
                // if case nowhere
            case R.id.nowhere:
                if (checked)
                    setContentView(R.layout.score);
                break;
        }
    }
}
