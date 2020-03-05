package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button pressButton;
    TextView funFactText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        pressButton = findViewById(R.id.pressButton);
        funFactText = findViewById(R.id.funFactText);

        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomAction();
            }
        });

    }

    public void randomAction(){
        final String[] fatArray = {"Ive made a 2d side scroller game",
                "I ate breakfast for breakfast",
                "The earth is flat",
                "1 + 1 = 11",
                "The reason all ants are female is because otherwise they would be uncles",
                "America is actually pronounced merica",
                "The first french fries wernt created in france they were created in grease",
                "Florida only has 2 seasons hot, and extra hot",
                "The sun is dark",
                "This an app"};

        Random random = new Random();
        int randomFact = random.nextInt(fatArray.length);

    }

}

