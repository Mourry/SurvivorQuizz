package com.example.android.survivorquizz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_quizz_activity);
    }

    /**
     * Starts quiz (MainActivity).
     */

    public void startQuiz(View view) {
        Intent GoToQuiz = new Intent(this, MainActivity.class);
        startActivity(GoToQuiz);

    }
}
