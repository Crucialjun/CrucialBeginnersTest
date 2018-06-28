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

public class MainActivity extends AppCompatActivity {

    /**
     * Initialize the global scope variables
     */
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Check Correct answer for number one
     *
     *
     */
    public void onRadioClick1(View view) {
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        RadioButton radiobox1A = findViewById(R.id.radio1A);
        RadioButton radiobox1B = findViewById(R.id.radio1B);
        RadioButton radiobox1C = findViewById(R.id.radio1C);
        RadioButton radiobox1D = findViewById(R.id.radio1D);


        if (radiobox1A.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGrop disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                radioGroup1.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else if (radiobox1B.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                radioGroup1.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox1C.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                radioGroup1.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox1D.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

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
     */
    public void onRadioClick2(View view) {
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioButton radiobox2A = findViewById(R.id.radio2A);
        RadioButton radiobox2B = findViewById(R.id.radio2B);
        RadioButton radiobox2C = findViewById(R.id.radio2C);
        RadioButton radiobox2D = findViewById(R.id.radio2D);

        if (radiobox2C.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGrop disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup2.getChildCount(); i++) {
                radioGroup2.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else if (radiobox2B.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup2.getChildCount(); i++) {
                radioGroup2.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox2A.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup2.getChildCount(); i++) {
                radioGroup2.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox2D.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

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
     */
    public void onClick3(View view) {
        CheckBox check1 = findViewById(R.id.check1);
        CheckBox check2 = findViewById(R.id.check2);
        CheckBox check3 = findViewById(R.id.check3);
        CheckBox check4 = findViewById(R.id.check4);

        if (check1.isChecked() && check2.isChecked() && check3.isChecked()) {

            score += 1;

            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

        } else if (check4.isChecked()) {

            Toast wrongToast = Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT);

            wrongToast.show();

            check1.setEnabled(false);
            check2.setEnabled(false);
            check3.setEnabled(false);
            check4.setEnabled(false);

        } else {
            Toast almostToast = Toast.makeText(this, "Almost There", Toast.LENGTH_SHORT);
            almostToast.show();
        }
    }

    /**
     * Check Correct answer for number four
     *
     */
    public void onRadioClick4(View view) {
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);
        RadioButton radiobox4A = findViewById(R.id.radio4A);
        RadioButton radiobox4B = findViewById(R.id.radio4B);
        RadioButton radiobox4C = findViewById(R.id.radio4C);
        RadioButton radiobox4D = findViewById(R.id.radio4D);

        if (radiobox4A.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup4.getChildCount(); i++) {
                radioGroup4.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else if (radiobox4B.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup4.getChildCount(); i++) {
                radioGroup4.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox4C.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup4.getChildCount(); i++) {
                radioGroup4.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox4D.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

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
     */
    public void onRadioClick5(View view) {
        RadioGroup radioGroup5 = findViewById(R.id.radioGroup5);
        RadioButton radiobox5A = findViewById(R.id.radio5A);
        RadioButton radiobox5B = findViewById(R.id.radio5B);
        RadioButton radiobox5C = findViewById(R.id.radio5C);
        RadioButton radiobox5D = findViewById(R.id.radio5D);

        if (radiobox5D.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup5.getChildCount(); i++) {
                radioGroup5.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else if (radiobox5A.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is D", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup5.getChildCount(); i++) {
                radioGroup5.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox5B.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is D", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup5.getChildCount(); i++) {
                radioGroup5.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox5C.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is D", Toast.LENGTH_SHORT);

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
     */
    public void onRadioClick6(View view) {
        RadioGroup radioGroup6 = findViewById(R.id.radioGroup6);
        RadioButton radiobox6A = findViewById(R.id.radio6A);
        RadioButton radiobox6B = findViewById(R.id.radio6B);
        RadioButton radiobox6C = findViewById(R.id.radio6C);
        RadioButton radiobox6D = findViewById(R.id.radio6D);

        if (radiobox6C.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup6.getChildCount(); i++) {
                radioGroup6.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else if (radiobox6A.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup6.getChildCount(); i++) {
                radioGroup6.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox6B.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup6.getChildCount(); i++) {
                radioGroup6.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox6D.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

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
     */
    public void onRadioClick7(View view) {
        RadioGroup radioGroup7 = findViewById(R.id.radioGroup7);
        RadioButton radiobox7A = findViewById(R.id.radio7A);
        RadioButton radiobox7B = findViewById(R.id.radio7B);
        RadioButton radiobox7C = findViewById(R.id.radio7C);
        RadioButton radiobox7D = findViewById(R.id.radio7D);

        if (radiobox7D.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup7.getChildCount(); i++) {
                radioGroup7.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else if (radiobox7A.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is D", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup7.getChildCount(); i++) {
                radioGroup7.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox7B.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is D", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup7.getChildCount(); i++) {
                radioGroup7.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox7C.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is D", Toast.LENGTH_SHORT);

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
     */
    public void onRadioClick8(View view) {
        RadioGroup radioGroup8 = findViewById(R.id.radioGroup8);
        RadioButton radiobox8A = findViewById(R.id.radio8A);
        RadioButton radiobox8B = findViewById(R.id.radio8B);
        RadioButton radiobox8C = findViewById(R.id.radio8C);
        RadioButton radiobox8D = findViewById(R.id.radio8D);

        if (radiobox8D.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup8.getChildCount(); i++) {
                radioGroup8.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else if (radiobox8A.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is D", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup8.getChildCount(); i++) {
                radioGroup8.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox8B.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is D", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup8.getChildCount(); i++) {
                radioGroup8.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox8C.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is D", Toast.LENGTH_SHORT);

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
     */
    public void onRadioClick9(View view) {
        RadioGroup radioGroup9 = findViewById(R.id.radioGroup9);
        RadioButton radiobox9A = findViewById(R.id.radio9A);
        RadioButton radiobox9B = findViewById(R.id.radio9B);
        RadioButton radiobox9C = findViewById(R.id.radio9C);
        RadioButton radiobox9D = findViewById(R.id.radio9D);

        if (radiobox9C.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            //Loop through the RadioGroup disabling the radio buttons for user not to change answer after selecting

            for (int i = 0; i < radioGroup9.getChildCount(); i++) {
                radioGroup9.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else if (radiobox9A.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup9.getChildCount(); i++) {
                radioGroup9.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox9B.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup9.getChildCount(); i++) {
                radioGroup9.getChildAt(i).setEnabled(false);
            }


        } else if (radiobox9D.isChecked()) {
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

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
     */
    public void SubmitResults(View view) {
        EditText answer10 = findViewById(R.id.answer10);

        EditText name = findViewById(R.id.name);

        TextView result = findViewById(R.id.resultsDisplay);

        ImageView finalImage = findViewById(R.id.finalImage);


        if (answer10.getText().toString().equals("Google")) {
            score = score + 1;
        }


        String messageWin = "Dear " + name.getText() + "\n" + " Congratulation your final score is :" + score;

        String messageLost = "Dear " + name.getText() + "\n" + " Sorry your final score is :" + score;


        if (score < 5) {
            finalImage.setImageDrawable((getResources().getDrawable(R.drawable.sad)));
            result.setText(messageLost);

            customMessage();

        } else if (score >= 5) {
            finalImage.setImageDrawable((getResources().getDrawable(R.drawable.congratulation)));
            result.setText(messageWin);

            customMessage();
        }


    }

    /**
     * Set a custom Message at a the Bottom
     */
    public void customMessage() {
        TextView info = findViewById(R.id.bottomMessage);
        EditText Name = findViewById(R.id.name);

        String displayMessage = "Thank You " + Name.getText() + "\n" + "for using the app." + "\n" + "Udacity: Students First";

        info.setText(displayMessage);
    }

    /**
     * This method is called when the share button is clicked
     *
     * @param view Shares the final results via email
     */

    public void shareResults(View view) {
        String emailMessage = "I managed to attain " + score + " points on the Crucial Beginners Test  by Crucialjun";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Results from Crucial Beginners Test by Crucialjun");
        intent.putExtra(Intent.EXTRA_TEXT, emailMessage);

        startActivity(intent);

    }


    /**
     * This method is called when the reset button is called
     * Resets score and reenables all the radio buttons
     *
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

        answer10.setText("");
    }
}
