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
        TextView answerQuestion3 = findViewById(R.id.answer33);
        TextView answerQuestion6 = findViewById(R.id.answer66);

        correctAnswerColor = getResources().getColor(R.color.colorCorrectAnswer);
        correctAnswerColorBack = getResources().getColor(R.color.colorCorrectAnswerBack);
        incorrectAnswerColor = getResources().getColor(R.color.colorIncorrectAnswer);
        incorrectAnswerColorBack = getResources().getColor(R.color.colorIncorrectAnswerBack);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(v -> {
            /* Question 1 starts*/
            RadioButton radioButton1_1 = findViewById(R.id.answer1_1);
            boolean answer1_1 = radioButton1_1.isChecked();

            RadioButton radioButton1_2 = findViewById(R.id.answer1_2);
            boolean answer1_2 = radioButton1_2.isChecked();

            RadioButton radioButton1_3 = findViewById(R.id.answer1_3);
            boolean answer1_3 = radioButton1_3.isChecked();

            checked1 = answer1_1 || answer1_2 || answer1_3;
            grade1 = 0;
            if (answer1_1) {
                grade1 = 0;
                question1TextView.setTextColor(incorrectAnswerColor);
                question1TextView.setBackgroundColor(incorrectAnswerColorBack);
            }
            if (answer1_2) {
                grade1 = 20;
                question1TextView.setTextColor(correctAnswerColor);
                question1TextView.setBackgroundColor(correctAnswerColorBack);
            }
            if (answer1_3) {
                grade1 = 0;
                question1TextView.setTextColor(incorrectAnswerColor);
                question1TextView.setBackgroundColor(incorrectAnswerColorBack);
            }

            radioButton1_1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            radioButton1_2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            radioButton1_3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            /* Question 1 ends*/

            /* Question 2 starts*/
            CheckBox answer2_1CheckBox = findViewById(R.id.answer2_1);
            boolean answer2_1 = answer2_1CheckBox.isChecked();

            CheckBox answer2_2CheckBox = findViewById(R.id.answer2_2);
            boolean answer2_2 = answer2_2CheckBox.isChecked();

            CheckBox answer2_3CheckBox = findViewById(R.id.answer2_3);
            boolean answer2_3 = answer2_3CheckBox.isChecked();

            checked2 = answer2_1 || answer2_2 || answer2_3;
            grade2 = 0;
            if (answer2_1 && answer2_3){
                grade2 = 20;
                question2TextView.setTextColor(correctAnswerColor);
                question2TextView.setBackgroundColor(correctAnswerColorBack);
            } else if (!answer2_1 && !answer2_3){
                grade2 = 0;
                question2TextView.setTextColor(incorrectAnswerColor);
                question2TextView.setBackgroundColor(incorrectAnswerColorBack);
            } else {
                grade2 = 10;
                question2TextView.setTextColor(incorrectAnswerColor);
                question2TextView.setBackgroundColor(incorrectAnswerColorBack);
            }

            answer2_1CheckBox.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            answer2_2CheckBox.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            answer2_3CheckBox.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);


            /* Question 3 starts*/
            EditText answer3 = findViewById(R.id.answer3);
            String answer_3 = answer3.getText().toString().trim();
            if (answer_3.equalsIgnoreCase("Madrid")) {
                grade3 = 20;
                question3TextView.setTextColor(correctAnswerColor);
                question3TextView.setBackgroundColor(correctAnswerColorBack);
                answer3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check, 0);
                answerQuestion3.setVisibility(View.GONE);
            } else {
                grade3 = 0;
                question3TextView.setTextColor(incorrectAnswerColor);
                question3TextView.setBackgroundColor(incorrectAnswerColorBack);
                answer3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
                answerQuestion3.setVisibility(View.VISIBLE);
            }
            /* Question 3 ends*/

            /* Question 4 starts*/
            CheckBox answer4_1CheckBox = findViewById(R.id.answer4_1);
            boolean answer4_1 = answer4_1CheckBox.isChecked();

            CheckBox answer4_2CheckBox = findViewById(R.id.answer4_2);
            boolean answer4_2 = answer4_2CheckBox.isChecked();

            CheckBox answer4_3CheckBox = findViewById(R.id.answer4_3);
            boolean answer4_3 = answer4_3CheckBox.isChecked();

            checked4 = answer4_1 || answer4_2 || answer4_3;
            grade4 = 0;
            if (answer4_2 && answer4_3){
                grade4 = 20;
                question4TextView.setTextColor(correctAnswerColor);
                question4TextView.setBackgroundColor(correctAnswerColorBack);
            } else if (!answer4_2 && !answer4_3){
                grade4 = 0;
                question4TextView.setTextColor(incorrectAnswerColor);
                question4TextView.setBackgroundColor(incorrectAnswerColorBack);
            } else {
                grade4 = 10;
                question4TextView.setTextColor(incorrectAnswerColor);
                question4TextView.setBackgroundColor(incorrectAnswerColorBack);
            }

            answer4_1CheckBox.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            answer4_2CheckBox.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            answer4_3CheckBox.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            /* Question 4 ends*/

            /* Question 5 starts*/
            RadioButton radioButton5_1 = findViewById(R.id.answer5_1);
            boolean answer5_1 = radioButton5_1.isChecked();

            RadioButton radioButton5_2 = findViewById(R.id.answer5_2);
            boolean answer5_2 = radioButton5_2.isChecked();

            RadioButton radioButton5_3 = findViewById(R.id.answer5_3);
            boolean answer5_3 = radioButton5_3.isChecked();

            RadioButton radioButton5_4 = findViewById(R.id.answer5_4);
            boolean answer5_4 = radioButton5_4.isChecked();

            checked5 = answer5_1 || answer5_2 || answer5_3 || answer5_4;
            grade5 = 0;
            if (answer5_1) {
                grade5 = 0;
                question5TextView.setTextColor(incorrectAnswerColor);
                question5TextView.setBackgroundColor(incorrectAnswerColorBack);
            }
            if (answer5_2) {
                grade5 = 20;
                question5TextView.setTextColor(correctAnswerColor);
                question5TextView.setBackgroundColor(correctAnswerColorBack);
            }
            if (answer5_3) {
                grade5 = 0;
                question5TextView.setTextColor(incorrectAnswerColor);
                question5TextView.setBackgroundColor(incorrectAnswerColorBack);
            }
            if (answer5_4) {
                grade5 = 0;
                question5TextView.setTextColor(incorrectAnswerColor);
                question5TextView.setBackgroundColor(incorrectAnswerColorBack);
            }

            radioButton5_1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            radioButton5_2.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check, 0);
            radioButton5_3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            radioButton5_4.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
            /* Question 5 ends*/

            /* Question 6 starts*/
            EditText answer6 = findViewById(R.id.answer6);
            String answer_6 = answer6.getText().toString().trim();
            if (answer_6.equalsIgnoreCase("Lisbon")) {
                grade6 = 20;
                question6TextView.setTextColor(correctAnswerColor);
                question6TextView.setBackgroundColor(correctAnswerColorBack);
                answer6.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.check, 0);
                answerQuestion6.setVisibility(View.GONE);
            } else {
                grade6 = 0;
                question6TextView.setTextColor(incorrectAnswerColor);
                question6TextView.setBackgroundColor(incorrectAnswerColorBack);
                answer6.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.close, 0);
                answerQuestion6.setVisibility(View.VISIBLE);
            }
            /* Question 6 ends*/

            if (checked1 && checked2 && !answer_3.equals("") && checked4 && checked5 && !answer_6.equals("")) {
                totalGrade = grade1 + grade2 + grade3 + grade4 + grade5 + grade6;
                String answer = getString(R.string.your_grade_is) + "  " + totalGrade +  " / 120";
                Toast.makeText(getApplicationContext(), answer ,
                        Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, getString(R.string.make_sure_answer_all_questions), Toast.LENGTH_SHORT).show();
            }

            radioButton1_1.setEnabled(false);
            radioButton1_2.setEnabled(false);
            radioButton1_3.setEnabled(false);

            answer2_1CheckBox.setEnabled(false);
            answer2_2CheckBox.setEnabled(false);
            answer2_3CheckBox.setEnabled(false);

            answer3.setEnabled(false);
            answer3.setFocusable(false);

            answer4_1CheckBox.setEnabled(false);
            answer4_2CheckBox.setEnabled(false);
            answer4_3CheckBox.setEnabled(false);

            radioButton5_1.setEnabled(false);
            radioButton5_2.setEnabled(false);
            radioButton5_3.setEnabled(false);
            radioButton5_4.setEnabled(false);

            answer6.setEnabled(false);
            answer6.setFocusable(false);
        });
    }
}