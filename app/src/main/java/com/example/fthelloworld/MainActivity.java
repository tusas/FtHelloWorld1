package com.example.fthelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = (TextView)findViewById(R.id.tvMain);
        this.tvMain.setText("Works as Main in Java");

    }

    public void onBtnMainClick(View view) {
        this.tvMain.setText("Slava Ukraine");
    }
}