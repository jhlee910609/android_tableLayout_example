package com.example.umsun_android.tablelayoutexam;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        checkIntent();
    }

    private void checkIntent(){
        if (getIntent() != null && getIntent().getAction() == Intent.ACTION_VIEW){
            Toast.makeText(this, getIntent().getData().getQueryParameter("color"), Toast.LENGTH_SHORT).show();
            setBackground(getIntent().getData().getQueryParameter("color"));
        }
    }

    private void setBackground(String colorName){
        switch (colorName){
            case "blue":
                findViewById(R.id.main2_bg).setBackgroundColor(Color.BLUE);
                break;

            case "red":
                findViewById(R.id.main2_bg).setBackgroundColor(Color.RED);
                break;
        }


    }
}
