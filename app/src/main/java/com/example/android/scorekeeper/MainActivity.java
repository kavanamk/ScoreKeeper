package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.String;
import java.lang.CharSequence;

public class MainActivity extends AppCompatActivity {


    Integer count1 =0;
    Integer count2=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void team1score(View v){
        count1++;//increment the count
        TextView text=(TextView) findViewById(R.id.team1_id);// resorce location
        text.setText(count1.toString());// view in the text
        if(count1== 25){
            text.setText("WIN");

            }
        if(count1==26){
            text.setText("0");
            TextView text1=(TextView) findViewById(R.id.team2_id);// resorce location
            text1.setText("0");// view in the text
            count1=0;
            count2=0;
        }
        }


    public void team2score(View v){
        count2++;//increment the count
        TextView text1=(TextView) findViewById(R.id.team2_id);// resorce location
        text1.setText(count2.toString());// view in the text
        if(count2== 25){
            text1.setText("WIN");

        }
        if(count2==26){
            TextView text=(TextView) findViewById(R.id.team1_id);// resorce location
            text.setText("0");
            text1.setText("0");// view in the text
            count1=0;
            count2=0;
        }

    }

    public void reset(View v){
        TextView text=(TextView) findViewById(R.id.team1_id);// resorce location
        text.setText("0");
        TextView text1=(TextView) findViewById(R.id.team2_id);// resorce location
        text1.setText("0");// view in the text
        count1=0;
        count2=0;
        }
    }




