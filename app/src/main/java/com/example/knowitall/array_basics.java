package com.example.knowitall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.ViewGroup;

public class array_basics extends AppCompatActivity {
    CardView c1;
    private int initialHeight;
    private int expandedHeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_basics);
        getSupportActionBar().hide();

        c1 = findViewById(R.id.cardView);
        initialHeight = c1.getLayoutParams().height;
        expandedHeight = initialHeight * 2;
        c1.setOnClickListener(view -> expandCard());

    }

    private void expandCard() {
        // Define the ValueAnimator for the height change animation
        ValueAnimator animator = ValueAnimator.ofInt(initialHeight, expandedHeight);
        animator.setDuration(500); // Animation duration in milliseconds

        // Update the layout parameters with the animated height values
        animator.addUpdateListener(animation -> {
            int value = (int) animation.getAnimatedValue();
            ViewGroup.LayoutParams layoutParams = c1.getLayoutParams();
            layoutParams.height = value;
            c1.setLayoutParams(layoutParams);
        });

        animator.start(); // Start the animation
    }
}