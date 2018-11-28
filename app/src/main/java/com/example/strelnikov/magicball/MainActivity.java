package com.example.strelnikov.magicball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button pressButton;
    ImageView ballView;
    final int[] ballArr = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pressButton = findViewById(R.id.pressButton);
        ballView = findViewById(R.id.ballView);
        final Random random = new Random();

        pressButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int number;
                number = random.nextInt(5);
                ballView.setImageResource(ballArr[number]);
            }

        });
    }
}
