package com.example.aiclock.ai;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.aiclock.R;


public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textResult = (TextView) findViewById(R.id.textResult);

        Bundle b = getIntent().getExtras();

        int score = b.getInt("score");
        boolean timeUp = b.getBoolean("timeup");

        if(timeUp==true)
        {
            textResult.setText("            TIME UP!!\n Your points are " + " " + score);
        }
        else
        {
            textResult.setText("Wrong answer sorry!! Your points are " + " " + score);
        }



    }

    public void playagain(View o) {

        Intent intent = new Intent(this, QuestionActivity.class);

        startActivity(intent);


    }
}