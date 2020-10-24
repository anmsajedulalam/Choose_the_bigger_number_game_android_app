package com.example.a12201027.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    int score=0;
    Random r = new Random();
    int left = r.nextInt(80 - 65) + 65;
    int right = r.nextInt(80 - 65) + 65;
    String Left=String.valueOf(left);
    String Right=String.valueOf(right);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=(TextView)findViewById(R.id.Left);
        tv.setText(Left);
        TextView vt=(TextView)findViewById(R.id.Right);
        vt.setText(Right);

    }
    public void Left_click(View view) {
        TextView tv=(TextView)findViewById(R.id.Bottom);
        tv.setText("Left");
        if(left>right)
        {
            score++;
        }
        else
        {
            score--;
        }
        TextView vt=(TextView)findViewById(R.id.Score);
        String Score=String.valueOf(score);
        vt.setText(Score);
    }
    public void Right_click(View view) {
        TextView tv=(TextView)findViewById(R.id.Up);
        tv.setText("Right");
        if(right>left)
        {
            score++;
        }
        else
        {
            score--;
        }
        TextView vt=(TextView)findViewById(R.id.Score);
        String Score=String.valueOf(score);
        vt.setText(Score);
    }

}
