package com.example.android.crucialbeginnerstest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Initialize the global scope variables
     */
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Check Correct answer for number one
     *
     * @param view the view
     */
    public void onRadioClick1(View view) {
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        RadioButton radiobox1A = findViewById(R.id.radio1A);

        if (radiobox1A.isChecked()) {
            Toast correctToast = Toast.makeText(this, this.getString(R.string.correct), Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                radioGroup1.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else {
            Toast wrongToast = Toast.makeText(this, this.getString(R.string.wrong) + " A", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                radioGroup1.getChildAt(i).setEnabled(false);
            }

        }


    }

    /**
     * Check Correct answer for number two
     *
     * @param view the view
     */
    public void onRadioClick2(View view) {
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioButton radiobox2C = findViewById(R.id.radio2C);

        if (radiobox2C.isChecked()) {
            Toast correctToast = Toast.makeText(this, this.getString(R.string.correct), Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup2.getChildCount(); i++) {
                radioGroup2.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else {
            Toast wrongToast = Toast.makeText(this, this.getString(R.string.wrong) + " C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup2.getChildCount(); i++) {
                radioGroup2.getChildAt(i).setEnabled(false);
            }


        }

    }

    /**
     * Check Correct answer for number three
     *
     * @param view the view
     */
    public void onClick3(View view) {
        CheckBox check1 = findViewById(R.id.check1);
        CheckBox check2 = findViewById(R.id.check2);
        CheckBox check3 = findViewById(R.id.check3);
        CheckBox check4 = findViewById(R.id.check4);

        if (check1.isChecked() && check2.isChecked() && check3.isChecked()) {

            score += 1;

            Toast correctToast = Toast.makeText(this, this.getString(R.string.correct), Toast.LENGTH_SHORT);
            correctToast.show();

        } else if (check4.isChecked()) {

            Toast wrongToast = Toast.makeText(this, this.getString(R.string.wrong) + " " + this.getString(R.string.allTheAbove), Toast.LENGTH_SHORT);

            wrongToast.show();

            check1.setEnabled(false);
            check2.setEnabled(false);
            check3.setEnabled(false);
            check4.setEnabled(false);

        } else {
            Toast almostToast = Toast.makeText(this, this.getString(R.string.almost), Toast.LENGTH_SHORT);
            almostToast.show();
        }
    }

    /**
     * Check Correct answer for number four
     *
     * @param view the view
     */
    public void onRadioClick4(View view) {
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);
        RadioButton radiobox4A = findViewById(R.id.radio4A);

        if (radiobox4A.isChecked()) {
            Toast correctToast = Toast.makeText(this, this.getString(R.string.correct), Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup4.getChildCount(); i++) {
                radioGroup4.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else {
            Toast wrongToast = Toast.makeText(this, this.getString(R.string.wrong) + " A", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup4.getChildCount(); i++) {
                radioGroup4.getChildAt(i).setEnabled(false);
            }


        }
    }

    /**
     * Check Correct answer for number five
     *
     * @param view the view
     */
    public void onRadioClick5(View view) {
        RadioGroup radioGroup5 = findViewById(R.id.radioGroup5);
        RadioButton radiobox5D = findViewById(R.id.radio5D);

        if (radiobox5D.isChecked()) {
            Toast correctToast = Toast.makeText(this, this.getString(R.string.correct), Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup5.getChildCount(); i++) {
                radioGroup5.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else {
            Toast wrongToast = Toast.makeText(this, this.getString(R.string.wrong) + " D", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup5.getChildCount(); i++) {
                radioGroup5.getChildAt(i).setEnabled(false);
            }


        }

    }

    /**
     * Check Correct answer for number six
     *
     * @param view the view
     */
    public void onRadioClick6(View view) {
        RadioGroup radioGroup6 = findViewById(R.id.radioGroup6);
        RadioButton radiobox6C = findViewById(R.id.radio6C);

        if (radiobox6C.isChecked()) {
            Toast correctToast = Toast.makeText(this, this.getString(R.string.correct), Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup6.getChildCount(); i++) {
                radioGroup6.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else {
            Toast wrongToast = Toast.makeText(this, this.getString(R.string.wrong) + " C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup6.getChildCount(); i++) {
                radioGroup6.getChildAt(i).setEnabled(false);
            }


        }

    }

    /**
     * Check Correct answer for number seven
     *
     * @param view the view
     */
    public void onRadioClick7(View view) {
        RadioGroup radioGroup7 = findViewById(R.id.radioGroup7);
        RadioButton radiobox7D = findViewById(R.id.radio7D);

        if (radiobox7D.isChecked()) {
            Toast correctToast = Toast.makeText(this, this.getString(R.string.correct), Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup7.getChildCount(); i++) {
                radioGroup7.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else {
            Toast wrongToast = Toast.makeText(this, this.getString(R.string.wrong) + " D", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup7.getChildCount(); i++) {
                radioGroup7.getChildAt(i).setEnabled(false);
            }


        }

    }

    /**
     * Check Correct answer for number eight
     *
     * @param view the view
     */
    public void onRadioClick8(View view) {
        RadioGroup radioGroup8 = findViewById(R.id.radioGroup8);
        RadioButton radiobox8D = findViewById(R.id.radio8D);

        if (radiobox8D.isChecked()) {
            Toast correctToast = Toast.makeText(this, this.getString(R.string.correct), Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup8.getChildCount(); i++) {
                radioGroup8.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else {
            Toast wrongToast = Toast.makeText(this, this.getString(R.string.wrong) + " D", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup8.getChildCount(); i++) {
                radioGroup8.getChildAt(i).setEnabled(false);
            }


        }

    }

    /**
     * Check Correct answer for number nine
     *
     * @param view the view
     */
    public void onRadioClick9(View view) {
        RadioGroup radioGroup9 = findViewById(R.id.radioGroup9);
        RadioButton radiobox9C = findViewById(R.id.radio9C);


        if (radiobox9C.isChecked()) {
            Toast correctToast = Toast.makeText(this, this.getString(R.string.correct), Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup9.getChildCount(); i++) {
                radioGroup9.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else {
            Toast wrongToast = Toast.makeText(this, this.getString(R.string.wrong) + " C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup9.getChildCount(); i++) {
                radioGroup9.getChildAt(i).setEnabled(false);
            }


        }

    }


    /**
     * This Method is called when the submit button is clicked
     *
     * @param view the view
     */
    public void SubmitResults(View view) {
        EditText answer10 = findViewById(R.id.answer10);

        EditText name = findViewById(R.id.name);

        TextView result = findViewById(R.id.resultsDisplay);


        ImageView finalImage = findViewById(R.id.finalImage);


        if (name.getText().toString().equals("")) {

            Toast enterName = Toast.makeText(this, this.getString(R.string.entername), Toast.LENGTH_LONG);
            enterName.show();

        } else {


            if (answer10.getText().toString().equals("Google")) {
                score = score + 1;
            }


            String messageWin = "Dear " + name.getText() + "\n" + " Congratulation your final score is :" + score;

            String messageLost = "Dear " + name.getText() + "\n" + " Sorry your final score is : " + score;


            if (score < 5) {
                finalImage.setImageDrawable((getResources().getDrawable(R.drawable.sad)));
                result.setText(messageLost);

                customMessage();

            } else {
                finalImage.setImageDrawable((getResources().getDrawable(R.drawable.congratulation)));
                result.setText(messageWin);

                customMessage();
            }

        }


    }

    /**
     * Set a custom Message at a the Bottom
     */
    private void customMessage() {
        TextView info = findViewById(R.id.bottomMessage);
        EditText userName = findViewById(R.id.name);

        String displayMessage = "Thank You " + userName.getText() + "\n" + "for using the app." + "\n" + "Udacity: Students First";

        info.setText(displayMessage);
    }

    /**
     * This method is called when the share button is clicked
     *
     * @param view Shares the final results via email
     */
    public void shareResults(View view) {
        String emailMessage = "I managed to " + score + " points on the Crucial Beginners  Test by Crucialjun";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Results from Crucial Beginners  Test by Crucialjun");
        intent.putExtra(Intent.EXTRA_TEXT, emailMessage);

        startActivity(intent);

    }


    /**
     * This method is called when the reset button is called
     * Resets score and reenables all the radio buttons
     *
     * @param view the view
     */
    public void resetQuiz(View view) {
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);
        RadioGroup radioGroup5 = findViewById(R.id.radioGroup5);
        RadioGroup radioGroup6 = findViewById(R.id.radioGroup6);
        RadioGroup radioGroup7 = findViewById(R.id.radioGroup7);
        RadioGroup radioGroup8 = findViewById(R.id.radioGroup8);
        RadioGroup radioGroup9 = findViewById(R.id.radioGroup9);

        CheckBox check1 = findViewById(R.id.check1);
        CheckBox check2 = findViewById(R.id.check2);
        CheckBox check3 = findViewById(R.id.check3);
        CheckBox check4 = findViewById(R.id.check4);

        TextView result = findViewById(R.id.resultsDisplay);

        ImageView finalImage = findViewById(R.id.finalImage);


        //Reset Score back to 0
        score = 0;

        result.setText("");
        finalImage.setImageResource(0);

        //Reset Checked Buttons and Re-enable
        radioGroup1.clearCheck();
        for (int i = 0; i < radioGroup1.getChildCount(); i++) {
            radioGroup1.getChildAt(i).setEnabled(true);
        }

        radioGroup2.clearCheck();
        for (int i = 0; i < radioGroup2.getChildCount(); i++) {
            radioGroup2.getChildAt(i).setEnabled(true);
        }


        radioGroup4.clearCheck();
        for (int i = 0; i < radioGroup4.getChildCount(); i++) {
            radioGroup4.getChildAt(i).setEnabled(true);
        }
        radioGroup5.clearCheck();
        for (int i = 0; i < radioGroup5.getChildCount(); i++) {
            radioGroup5.getChildAt(i).setEnabled(true);
        }

        radioGroup6.clearCheck();
        for (int i = 0; i < radioGroup6.getChildCount(); i++) {
            radioGroup6.getChildAt(i).setEnabled(true);
        }

        radioGroup7.clearCheck();
        for (int i = 0; i < radioGroup7.getChildCount(); i++) {
            radioGroup7.getChildAt(i).setEnabled(true);
        }

        radioGroup8.clearCheck();
        for (int i = 0; i < radioGroup8.getChildCount(); i++) {
            radioGroup8.getChildAt(i).setEnabled(true);
        }

        radioGroup9.clearCheck();
        for (int i = 0; i < radioGroup9.getChildCount(); i++) {
            radioGroup9.getChildAt(i).setEnabled(true);
        }


        //Reset The Checked CheckBoxes

        if (check1.isChecked()) {
            check1.setChecked(false);
        }

        if (check2.isChecked()) {
            check2.setChecked(false);
        }

        if (check3.isChecked()) {
            check3.setChecked(false);
        }

        if (check4.isChecked()) {
            check4.setChecked(false);
        }

        check1.setEnabled(true);
        check2.setEnabled(true);
        check3.setEnabled(true);
        check4.setEnabled(true);

        EditText answer10 = findViewById(R.id.answer10);

        EditText name = findViewById(R.id.name);

        answer10.setText("");
        name.setText("");
    }
}
