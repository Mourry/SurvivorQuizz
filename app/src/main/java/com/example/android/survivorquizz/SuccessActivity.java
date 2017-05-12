package com.example.android.survivorquizz;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SuccessActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.succes_activity);

    }

    public void newQuiz(View view) {
        Intent GoToStart = new Intent(this, StartActivity.class);
        startActivity(GoToStart);

    }
}
