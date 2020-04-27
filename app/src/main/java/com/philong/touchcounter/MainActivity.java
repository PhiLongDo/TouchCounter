package com.philong.touchcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    private TextView tvShowCouter;
    private Button btnTouch, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShowCouter = findViewById(R.id.tvShowCouter);
        btnReset = findViewById(R.id.btnReset);
        btnTouch = findViewById(R.id.btnTouch);

        tvShowCouter.setText("0");
    }

    public void resetNumber(View view) {
        counter = 0;
        tvShowCouter.setText(counter.toString());
        tvShowCouter.setTextColor(Color.WHITE);
    }

    public void pushNumber(View view) {
        counter += 1;
        tvShowCouter.setText(counter.toString());
        if (counter >=20){
            tvShowCouter.setTextColor(Color.YELLOW);
        }
        if (counter >=50){
            tvShowCouter.setTextColor(Color.RED);
        }

        btnTouch.setBackgroundColor(Color.parseColor("#8a8b8c"));
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 0.1s = 100ms
                btnTouch.setBackgroundColor(Color.parseColor("#A1414D46"));
            }
        }, 100);
    }
}
