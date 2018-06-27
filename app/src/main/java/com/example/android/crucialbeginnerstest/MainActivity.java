package com.example.android.crucialbeginnerstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * Initialize the global scope of variable score
     */
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  onRadioClick1(View view){
        RadioButton radiobox1A = findViewById(R.id.radio1A);
        RadioButton radiobox1B = findViewById(R.id.radio1B);
        RadioButton radiobox1C = findViewById(R.id.radio1C);
        RadioButton radiobox1D = findViewById(R.id.radio1D);

        if (radiobox1A.isChecked()) {
            Toast correctToast = Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT);
            correctToast.show();

            radiobox1B.setEnabled(false);
            radiobox1C.setEnabled(false);
            radiobox1D.setEnabled(false);

            score += 1;

        } else if (radiobox1B.isChecked()){
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

            wrongToast.show();

            radiobox1A.setEnabled(false);
            radiobox1C.setEnabled(false);
            radiobox1D.setEnabled(false);

        }else if(radiobox1C.isChecked()){
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

            wrongToast.show();

            radiobox1A.setEnabled(false);
            radiobox1B.setEnabled(false);
            radiobox1D.setEnabled(false);

        }else if(radiobox1D.isChecked()){
            Toast wrongToast = Toast.makeText(this, "Wrong Answer, The Correct Answer is A", Toast.LENGTH_SHORT);

            wrongToast.show();

            radiobox1A.setEnabled(false);
            radiobox1C.setEnabled(false);
            radiobox1B.setEnabled(false);
        }

    }

}
