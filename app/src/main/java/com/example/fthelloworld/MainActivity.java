package com.example.fthelloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
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

    public void onBtnColorClick(View view) {
        String text = tvMain.getText().toString();
        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fcsYellow = new ForegroundColorSpan(Color.YELLOW);
        ForegroundColorSpan fcsBlue = new ForegroundColorSpan(Color.BLUE);

        ss.setSpan(fcsYellow, 0, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(fcsBlue, 6, text.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        this.tvMain.setText(ss);
    }
}