package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        final int[] answerArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
        Button rollButton = findViewById(R.id.askButton);

        rollButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                ballDisplay.setImageResource(answerArray[number]);
            }
        });


    }
}
