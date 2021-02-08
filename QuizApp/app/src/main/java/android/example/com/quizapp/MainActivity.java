package android.example.com.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int grade1;
    private int grade2;
    private int grade3;
    private int grade4;
    private int grade5;
    private int grade6;
    private int totalGrade;
    private boolean checked2;
    private boolean checked1;
    private boolean checked4;
    private boolean checked5;
    private int correctAnswerColor;
    private int correctAnswerColorBack;
    private int incorrectAnswerColor;
    private int incorrectAnswerColorBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView question1TextView = findViewById(R.id.question1);
        TextView question2TextView = findViewById(R.id.question2);
        TextView question3TextView = findViewById(R.id.question3);
        TextView question4TextView = findViewById(R.id.question4);
        TextView question5TextView = findViewById(R.id.question5);
        TextView question6TextView = findViewById(R.id.question6);
        TextView answerQuestion3 = findViewById(R.id.question_3_ra);
        TextView answerQuestion6 = findViewById(R.id.question_6_ra);

        correctAnswerColor = getResources().getColor(R.color.colorCorrectAnswer);
        correctAnswerColorBack = getResources().getColor(R.color.colorCorrectAnswerBack);
        incorrectAnswerColor = getResources().getColor(R.color.colorIncorrectAnswer);
        incorrectAnswerColorBack = getResources().getColor(R.color.colorIncorrectAnswerBack);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(v -> {
            /* Question 1 starts*/
            RadioButton questionOneRadioButton1 = findViewById(R.id.question_1_answer_1_rb);
            boolean questionOneAnswer1 = questionOneRadioButton1.isChecked();

            RadioButton questionOneRadioButton2 = findViewById(R.id.question_1_answer_2_rb);
            boolean questionOneAnswer2 = questionOneRadioButton2.isChecked();

            RadioButton questionOneRadioButton3 = findViewById(R.id.question_1_answer_3_rb);
            boolean questionOneAnswer3 = questionOneRadioButton3.isChecked();

            checked1 = questionOneAnswer1 || questionOneAnswer2 || questionOneAnswer3;
            grade1 = 0;
            if (questionOneAnswer1) {
                grade1 = 0;
                question1TextView.setTextColor(incorrectAnswerColor);
                question1TextView.setBackgroundColor(incorrectAnswerColorBack);
            }
            if (questionOneAnswer2) {
                grade1 = 20;
                question1TextView.setTextColor(correctAnswerColor);
                question1TextView.setBackgroundColor(correctAnswerColorBack);
            }
            if (questionOneAnswer3) {
                grade1 = 0;
                question1TextView.setTextColor(incorrectAnswerColor);
                question1TextView.setBackgroundColor(incorrectAnswerColorBack);
            }

            questionOneRadioButton1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            questionOneRadioButton2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            questionOneRadioButton3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            /* Question 1 ends*/

            /* Question 2 starts*/
            CheckBox questionTwoCheckBox1 = findViewById(R.id.question_2_answer_1_cb);
            boolean questionTwoAnswer1 = questionTwoCheckBox1.isChecked();

            CheckBox questionTwoCheckBox2 = findViewById(R.id.question_2_answer_2_cb);
            boolean questionTwoAnswer2 = questionTwoCheckBox2.isChecked();

            CheckBox questionTwoCheckBox3 = findViewById(R.id.question_2_answer_3_cb);
            boolean questionTwoAnswer3 = questionTwoCheckBox3.isChecked();

            checked2 = questionTwoAnswer1 || questionTwoAnswer2 || questionTwoAnswer3;
            grade2 = 0;
            if (questionTwoAnswer1 && questionTwoAnswer3 && !questionTwoAnswer2) {
                grade2 = 20;
                question2TextView.setTextColor(correctAnswerColor);
                question2TextView.setBackgroundColor(correctAnswerColorBack);
            } else {
                grade2 = 0;
                question2TextView.setTextColor(incorrectAnswerColor);
                question2TextView.setBackgroundColor(incorrectAnswerColorBack);
            }

            questionTwoCheckBox1.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            questionTwoCheckBox2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            questionTwoCheckBox3.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);


            /* Question 3 starts*/
            EditText questionThreeEditText = findViewById(R.id.question_3_et);
            String questionThreeAnswer = questionThreeEditText.getText().toString().trim();
            if (questionThreeAnswer.equalsIgnoreCase("Madrid")) {
                grade3 = 20;
                question3TextView.setTextColor(correctAnswerColor);
                question3TextView.setBackgroundColor(correctAnswerColorBack);
                questionThreeEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check, 0);
                answerQuestion3.setVisibility(View.GONE);
            } else {
                grade3 = 0;
                question3TextView.setTextColor(incorrectAnswerColor);
                question3TextView.setBackgroundColor(incorrectAnswerColorBack);
                questionThreeEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
                answerQuestion3.setVisibility(View.VISIBLE);
            }
            /* Question 3 ends*/

            /* Question 4 starts*/
            CheckBox questionFourCheckBox1 = findViewById(R.id.question_4_answer_1_cb);
            boolean questionFourAnswer1 = questionFourCheckBox1.isChecked();

            CheckBox questionFourCheckBox2 = findViewById(R.id.question_4_answer_2_cb);
            boolean questionFourAnswer2 = questionFourCheckBox2.isChecked();

            CheckBox questionFourCheckBox3 = findViewById(R.id.question_4_answer_3_cb);
            boolean questionFourAnswer3 = questionFourCheckBox3.isChecked();

            checked4 = questionFourAnswer1 || questionFourAnswer2 || questionFourAnswer3;
            grade4 = 0;
            if (questionFourAnswer2 && questionFourAnswer3 && !questionFourAnswer1) {
                grade4 = 20;
                question4TextView.setTextColor(correctAnswerColor);
                question4TextView.setBackgroundColor(correctAnswerColorBack);
            } else {
                grade4 = 0;
                question4TextView.setTextColor(incorrectAnswerColor);
                question4TextView.setBackgroundColor(incorrectAnswerColorBack);
            }

            questionFourCheckBox1.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            questionFourCheckBox2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            questionFourCheckBox3.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            /* Question 4 ends*/

            /* Question 5 starts*/
            RadioButton questionFiveRadioButton1 = findViewById(R.id.question_5_answer_1_rb);
            boolean questionFiveAnswer1 = questionFiveRadioButton1.isChecked();

            RadioButton questionFiveRadioButton2 = findViewById(R.id.question_5_answer_2_rb);
            boolean questionFiveAnswer2 = questionFiveRadioButton2.isChecked();

            RadioButton questionFiveRadioButton3 = findViewById(R.id.question_5_answer_3_rb);
            boolean questionFiveAnswer3 = questionFiveRadioButton3.isChecked();

            RadioButton questionFiveRadioButton4 = findViewById(R.id.question_5_answer_4_rb);
            boolean questionFiveAnswer4 = questionFiveRadioButton4.isChecked();

            checked5 = questionFiveAnswer1 || questionFiveAnswer2 || questionFiveAnswer3 || questionFiveAnswer4;
            grade5 = 0;
            if (questionFiveAnswer1) {
                grade5 = 0;
                question5TextView.setTextColor(incorrectAnswerColor);
                question5TextView.setBackgroundColor(incorrectAnswerColorBack);
            }
            if (questionFiveAnswer2) {
                grade5 = 20;
                question5TextView.setTextColor(correctAnswerColor);
                question5TextView.setBackgroundColor(correctAnswerColorBack);
            }
            if (questionFiveAnswer3) {
                grade5 = 0;
                question5TextView.setTextColor(incorrectAnswerColor);
                question5TextView.setBackgroundColor(incorrectAnswerColorBack);
            }
            if (questionFiveAnswer4) {
                grade5 = 0;
                question5TextView.setTextColor(incorrectAnswerColor);
                question5TextView.setBackgroundColor(incorrectAnswerColorBack);
            }

            questionFiveRadioButton1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            questionFiveRadioButton2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            questionFiveRadioButton3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            questionFiveRadioButton4.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            /* Question 5 ends*/

            /* Question 6 starts*/
            EditText questionSixEditText = findViewById(R.id.question_6_et);
            String questionSixAnswer = questionSixEditText.getText().toString().trim();
            if (questionSixAnswer.equalsIgnoreCase("Lisbon")) {
                grade6 = 20;
                question6TextView.setTextColor(correctAnswerColor);
                question6TextView.setBackgroundColor(correctAnswerColorBack);
                questionSixEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check, 0);
                answerQuestion6.setVisibility(View.GONE);
            } else {
                grade6 = 0;
                question6TextView.setTextColor(incorrectAnswerColor);
                question6TextView.setBackgroundColor(incorrectAnswerColorBack);
                questionSixEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
                answerQuestion6.setVisibility(View.VISIBLE);
            }
            /* Question 6 ends*/

            if (checked1 && checked2 && !questionThreeAnswer.equals("") && checked4 && checked5 && !questionSixAnswer.equals("")) {
                totalGrade = grade1 + grade2 + grade3 + grade4 + grade5 + grade6;
                String answer = getString(R.string.your_grade_is) + "  " + totalGrade + " / 120";
                Toast.makeText(getApplicationContext(), answer,
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, getString(R.string.make_sure_answer_all_questions), Toast.LENGTH_SHORT).show();
            }

            questionOneRadioButton1.setEnabled(false);
            questionOneRadioButton2.setEnabled(false);
            questionOneRadioButton3.setEnabled(false);

            questionTwoCheckBox1.setEnabled(false);
            questionTwoCheckBox2.setEnabled(false);
            questionTwoCheckBox3.setEnabled(false);

            questionThreeEditText.setEnabled(false);
            questionThreeEditText.setFocusable(false);

            questionFourCheckBox1.setEnabled(false);
            questionFourCheckBox2.setEnabled(false);
            questionFourCheckBox3.setEnabled(false);

            questionFiveRadioButton1.setEnabled(false);
            questionFiveRadioButton2.setEnabled(false);
            questionFiveRadioButton3.setEnabled(false);
            questionFiveRadioButton4.setEnabled(false);

            questionSixEditText.setEnabled(false);
            questionSixEditText.setFocusable(false);
        });
    }
}