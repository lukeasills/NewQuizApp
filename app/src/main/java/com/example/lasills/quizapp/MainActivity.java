package com.example.lasills.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int totalRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(){
        totalRight=0;
        String displayS2 = "Your Missed Captchas: ";
        EditText answer1 = (EditText) findViewById(R.id.edittext1);
        if(answer1.getText().equals("android studios"))
            totalRight++;
        else
            displayS2+="1 ";

        RadioButton answer2a = (RadioButton) findViewById(R.id.radioG1B1);
        if(answer2a.isActivated())
            totalRight++;
        else
            displayS2+="2 ";

        RadioButton answer3d = (RadioButton) findViewById(R.id.radioG2B4);
        if(answer3d.isActivated())
            totalRight++;
        else
            displayS2+="3 ";

        EditText answer4 = (EditText) findViewById(R.id.edittext2);
        if(answer4.getText().equals("robert de πiro"))
            totalRight++;
        else
            displayS2+="4 ";

        CheckBox answer5a = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox answer5b = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox answer5c = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox answer5d = (CheckBox) findViewById(R.id.checkbox4);
        if(!answer5a.isActivated()&&answer5b.isActivated()&&!answer5c.isActivated()&&answer5d.isActivated())
            totalRight++;
        else
            displayS2+="5 ";

        EditText answer6 = (EditText) findViewById(R.id.edittext3);
        if(answer6.getText().equals("Artist's Rendition of Tree Roots"))
            totalRight++;
        else
            displayS2+="6 ";

        RadioButton answer7b = (RadioButton) findViewById(R.id.radioG3B2);
        if(answer7b.isActivated())
            totalRight++;
        else
            displayS2+="7 ";

        EditText answer8a = (EditText) findViewById(R.id.edittext5);
        EditText answer8b = (EditText) findViewById(R.id.edittext6);
        if(answer8a.getText().equals("botchkin novin")&&answer8b.getText().equals("189287 10990 10"))
            totalRight++;
        else
            displayS2+="8 ";

        CheckBox answer9a = (CheckBox) findViewById(R.id.checkbox5);
        CheckBox answer9b = (CheckBox) findViewById(R.id.checkbox6);
        CheckBox answer9c = (CheckBox) findViewById(R.id.checkbox7);
        CheckBox answer9d = (CheckBox) findViewById(R.id.checkbox8);
        CheckBox answer9e = (CheckBox) findViewById(R.id.checkbox9);
        if(answer9a.isActivated()&&answer9b.isActivated()&&answer9c.isActivated()&&answer9d.isActivated()&&answer9e.isActivated())
            totalRight++;
        else
            displayS2+="9 ";

        EditText answer10 = (EditText) findViewById(R.id.edittext7);
        if(answer10.getText().equals("16"))
            totalRight++;
        else
            displayS2+="10 ";

        String displayS1 = "Your Captcha Score:" +totalRight +" / " +10;
        TextView display1 = (TextView) findViewById(R.id.displayView1);
        TextView display2 = (TextView) findViewById(R.id.displayView2);
        display1.setText(displayS1);
        display2.setText(displayS2);
    }


}
