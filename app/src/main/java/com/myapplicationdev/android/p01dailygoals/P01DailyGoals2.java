package com.myapplicationdev.android.p01dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a17010528.p01_dailygoals.MainActivity;
import com.example.a17010528.p01_dailygoals.R;

import org.w3c.dom.Text;

public class P01DailyGoals2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p01_daily_goals2);

        TextView tvRead = findViewById(R.id.textViewRead);
        TextView tvArrive = findViewById(R.id.textViewArrive);
        TextView tvAttempt = findViewById(R.id.textViewAttempt);
        TextView tvReflect = findViewById(R.id.textViewReflect);
        Button btnClose = findViewById(R.id.buttonClose);

        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        tvRead.setText("Read up on materials before class: " + info[0]);
        tvArrive.setText("Arrive on time so as not to miss important part of the lesson : " + info[1]);
        tvAttempt.setText("Attempt the problem myself " + info[2]);
        tvReflect.setText("Reflection : " + info[3]);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(P01DailyGoals2.this, MainActivity.class);
                startActivity(i);
            }
        });
 }
}
