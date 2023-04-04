package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView ques;
    EditText ans_given;
    String ans;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ques = (TextView) findViewById(R.id.textView);
        ans_given = (EditText) findViewById(R.id.editTextTextPersonName);
        submit = (Button) findViewById(R.id.button);
        customdatatype d[] = new customdatatype[3];

        d[0] = new customdatatype("What is currency of India","rupee");

        d[1] = new customdatatype("What is capital of Pakistan","islamabad");

        d[2] = new customdatatype("What is capital of India","Delhi");

        Random randomNumber = new Random();
        int numberGenerated = randomNumber.nextInt(3-0);
        ques.setText(d[numberGenerated].quizquestion);
        ans = d[numberGenerated].quizans;
        submit.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                if(ans_given.getText().toString().toLowerCase().equals(ans))

                {

                    int numberGenerated = randomNumber.nextInt(3 - 0) + 0;

                    ques.setText(d[numberGenerated].quizquestion);

                    ans = d[numberGenerated].quizans;

                    Toast.makeText(MainActivity.this, "Correct!! Answer!!",

                            Toast.LENGTH_LONG).show();

                    ans_given.setText("");

                }

            }

        });

    }

}

