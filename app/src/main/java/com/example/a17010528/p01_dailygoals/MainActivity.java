package com.example.a17010528.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.myapplicationdev.android.p01dailygoals.P01DailyGoals2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.buttonDone);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup read = findViewById(R.id.radioGroupRead);
                int readSelected = read.getCheckedRadioButtonId();
                RadioButton rbRead = findViewById(readSelected);

                RadioGroup arrive = findViewById(R.id.radioGroupArrive);
                int arriveSelected = arrive.getCheckedRadioButtonId();
                RadioButton rbArrive = findViewById(arriveSelected);

                RadioGroup attempt = findViewById(R.id.radioGroupAttempt);
                int attemptSelected = attempt.getCheckedRadioButtonId();
                RadioButton rbAttempt = findViewById(attemptSelected);

                EditText reflection = findViewById(R.id.editTextReflection);
                String reflectionText = reflection.getText().toString();

                String[] info = {rbRead.getText().toString(), rbArrive.getText().toString(), rbAttempt.getText().toString() , reflectionText};
                Intent i = new Intent(MainActivity.this, P01DailyGoals2.class);
                i.putExtra("info", info);
                startActivity(i);

            }
        });
    }
}
