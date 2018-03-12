package com.example.android.countryquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //    wrong answer = no points
    public void wrongAnswer(View view) {
        Toast.makeText(this, getString(R.string.wrong_answer), Toast.LENGTH_SHORT).show();
        setContentView(R.layout.question_2);
    }

    //answer correct = 1 point
    public void goToSecondQuestion(View view) {
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

            case R.id.q1_ans_correct:
                if (checked) {
                    setContentView(R.layout.question_2);
                    score++;
                    break;
                }
        }
    }
}
