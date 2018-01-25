package com.nackademin.foureverhh.addclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlipImage catFlip = findViewById(R.id.catFlip);
        FlipImage dogFlip = findViewById(R.id.dogFlip);
        //catFlip.defaultImage = R.drawable.cat;
        catFlip.onDownImage = R.drawable.dog;
        dogFlip.onDownImage = R.drawable.cat;

    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        int action = event.getActionMasked();
        if(action == MotionEvent.ACTION_DOWN) {
            Log.d("MainActivity", "Down");

        }
        else if(action == MotionEvent.ACTION_UP) {
            Log.d("MainActivity", "Up");

        }
        return super.onTouchEvent(event);
    }
}
