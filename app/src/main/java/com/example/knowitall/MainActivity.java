package com.example.knowitall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    CardView c1;
    CardView c2;
    CardView c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        c1 = findViewById(R.id.cardView1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the scale animator
                ObjectAnimator scaleAnimator = ObjectAnimator.ofPropertyValuesHolder(
                        c1,
                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.1f, 1f),
                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.1f, 1f)
                );
                scaleAnimator.setDuration(500);

                // Create the alpha animator
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(c1, View.ALPHA, 1f, 0.8f, 1f);
                alphaAnimator.setDuration(500);

                // Create the animator set and play the animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleAnimator, alphaAnimator);
                animatorSet.start();

                Intent i = new Intent(getApplicationContext() , dsa.class);
                startActivity(i);
            }
        } );


        c2 = findViewById(R.id.cardView2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the scale animator
                ObjectAnimator scaleAnimator = ObjectAnimator.ofPropertyValuesHolder(
                        c2,
                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.05f, 1f),
                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.05f, 1f)
                );
                scaleAnimator.setDuration(500);

                // Create the alpha animator
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(c2, View.ALPHA, 1f, 0.8f, 1f);
                alphaAnimator.setDuration(500);

                // Create the animator set and play the animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleAnimator, alphaAnimator);
                animatorSet.start();
            }
        } );

        c3 = findViewById(R.id.cardView3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the scale animator
                ObjectAnimator scaleAnimator = ObjectAnimator.ofPropertyValuesHolder(
                        c3,
                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.05f, 1f),
                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.05f, 1f)
                );
                scaleAnimator.setDuration(500);

                // Create the alpha animator
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(c3, View.ALPHA, 1f, 0.8f, 1f);
                alphaAnimator.setDuration(500);

                // Create the animator set and play the animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleAnimator, alphaAnimator);
                animatorSet.start();
            }
        } );
    }


    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.cardView1: i = new Intent(this , dsa.class); startActivity(i); break;
            case R.id.cardView2: i = new Intent(this , guidedPath.class); startActivity(i); break;
            case R.id.cardView3: i = new Intent(this , aptitude.class); startActivity(i); break;
        }
    }


}