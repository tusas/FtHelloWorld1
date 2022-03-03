package com.example.fthelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private boolean isDefaultValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
        this.isDefaultValue = true;

    }

    public void onBtnMainClick(View view) {
        if(this.isDefaultValue){
            this.tvMain.setText(R.string.changed_name);
        }
        else{
            this.tvMain.setText(R.string.default_name);
        }
        this.isDefaultValue = !this.isDefaultValue;
    }
}