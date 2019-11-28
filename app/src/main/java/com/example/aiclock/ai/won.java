package com.example.aiclock.ai;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.aiclock.R;

/**
 * Created by LENOVO on 1/3/2017.
 */

public class won extends Activity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.won);
        tv = (TextView) findViewById(R.id.congo);
        Bundle b = getIntent().getExtras();
        int y = b.getInt("score");
        tv.setText("FINAL SCORE:" + y);
    }
}
