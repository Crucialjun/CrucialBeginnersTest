package com.example.android.crucialbeginnerstest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Initialize the global scope of variable score
     */
    int score = 0;
    String name = "Nicholas Otieno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Check Correct answer for number one
     * @param view
     */
    public void  onRadioClick1(View view){
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        RadioButton radiobox1A = findViewById(R.id.radio1A);
        RadioButton radiobox1B = findViewById(R.id.radio1B);
        RadioButton radiobox1C = findViewById(R.id.radio1C);
        RadioButton radiobox1D = findViewById(R.id.radio1D);


        if (radiobox1A.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                radioGroup1.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else if (radiobox1B.isChecked()){
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                radioGroup1.getChildAt(i).setEnabled(false);
            }




        }else if(radiobox1C.isChecked()){
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup1.getChildCount(); i++) {
                radioGroup1.getChildAt(i).setEnabled(false);
            }




        }else if(radiobox1D.isChecked()){
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
     * @param view
     */
    public void  onRadioClick2(View view){
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioButton radiobox2A = findViewById(R.id.radio2A);
        RadioButton radiobox2B = findViewById(R.id.radio2B);
        RadioButton radiobox2C = findViewById(R.id.radio2C);
        RadioButton radiobox2D = findViewById(R.id.radio2D);

        if (radiobox2C.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup2.getChildCount(); i++) {
                radioGroup2.getChildAt(i).setEnabled(false);
            }

            score += 1;

        } else if (radiobox2B.isChecked()){
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup2.getChildCount(); i++) {
                radioGroup2.getChildAt(i).setEnabled(false);
            }


        }else if(radiobox2A.isChecked()){
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup2.getChildCount(); i++) {
                radioGroup2.getChildAt(i).setEnabled(false);
            }



        }else if(radiobox2D.isChecked()){
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is C", Toast.LENGTH_SHORT);

            wrongToast.show();

            //Disable RadioGroup for user not to change answer after selecting

            for (int i = 0; i < radioGroup2.getChildCount(); i++) {
                radioGroup2.getChildAt(i).setEnabled(false);
            }


        }

    }



    /**
     * This Method is called when the submit button is clicked
     * @param view
     */

    public void SubmitResults(View view){
        //EditText name = findViewById(R.id.name);

        TextView result = findViewById(R.id.resultsDisplay);

        ImageView finalImage = findViewById(R.id.finalImage);

        String messageWin = "Dear " + name + "\n" + " Congratulation your final score is :" + score;

        String messageLost = "Dear " + name + "\n" + " Sorry your final score is :" + score;



        if (score < 5){
            finalImage.setImageDrawable((getResources().getDrawable(R.drawable.sad)));
            result.setText(messageLost);

        } else if (score >= 5){
            finalImage.setImageDrawable((getResources().getDrawable(R.drawable.congratulation)));
            result.setText(messageWin);
        }


    }

    /**
     * Set a custom Message at a the Bottom
     */
//    public void customMessage(){
//        TextView info = findViewById(R.id.bottomMessage);
//        EditText name = findViewById(R.id.name);
//
//        String displayMessage = "Thank You " + name.getText() + "\n" + "for using the app." + "\n" + "Udacity: Students First";
//
//        info.setText(displayMessage);
//    }

    /**
     * This method is called when the share button is clicked
     * @param view
     *
     * Shares the final results via email
     */

    public void shareResults(View view){
        String emailMessage = "I managed " + score + " points on the Audacity Quiz App by Crucialjun";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Results from Udacity quiz App by Crucialjun");
        intent.putExtra(Intent.EXTRA_TEXT, emailMessage);

        startActivity(intent);

    }


    /**
     * This method is called when the reset button is called
     * Resets score and reenables all the radio buttons
     * @param view
     */
    public void resetQuiz(View view) {
        RadioGroup radioGroup1 = findViewById(R.id.radioGroup1);
        RadioGroup radioGroup2 = findViewById(R.id.radioGroup2);
        RadioGroup radioGroup3 = findViewById(R.id.radioGroup3);
        RadioGroup radioGroup4 = findViewById(R.id.radioGroup4);
        RadioGroup radioGroup5 = findViewById(R.id.radioGroup5);
        RadioGroup radioGroup6 = findViewById(R.id.radioGroup6);
        RadioGroup radioGroup7 = findViewById(R.id.radioGroup7);
        RadioGroup radioGroup8 = findViewById(R.id.radioGroup8);
        RadioGroup radioGroup9 = findViewById(R.id.radioGroup9);
        RadioGroup radioGroup10 = findViewById(R.id.radioGroup10);


        radioGroup1.clearCheck();
        for (int i = 0; i < radioGroup1.getChildCount(); i++) {
            radioGroup1.getChildAt(i).setEnabled(true);
        }
        radioGroup2.clearCheck();
        for (int i = 0; i < radioGroup2.getChildCount(); i++) {
            radioGroup2.getChildAt(i).setEnabled(true);
        }

        radioGroup2.isEnabled();
        radioGroup3.clearCheck();
        radioGroup3.isEnabled();
        radioGroup4.clearCheck();
        radioGroup4.isEnabled();
        radioGroup5.clearCheck();
        radioGroup5.isEnabled();
        radioGroup6.clearCheck();
        radioGroup6.isEnabled();
        radioGroup7.clearCheck();
        radioGroup7.isEnabled();
        radioGroup8.clearCheck();
        radioGroup8.isEnabled();
        radioGroup9.clearCheck();
        radioGroup9.isEnabled();
        radioGroup10.clearCheck();
        radioGroup10.isEnabled();
    }
}
