package com.example.knowitall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Toast;

public class dsa extends AppCompatActivity implements View.OnClickListener{
    CardView c1;
    CardView c2;
    CardView c3;
    CardView c4;
    CardView c5;
    CardView c6;
    CardView c7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsa);
        getSupportActionBar().hide();

        c1 = findViewById(R.id.array);
        c2 = findViewById(R.id.linkedlist);
        c3 = findViewById(R.id.stack);
        c4 = findViewById(R.id.queue);
        c5 = findViewById(R.id.trees);
        c6 = findViewById(R.id.graphs);
        c7 = findViewById(R.id.dp);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the scale animator
                ObjectAnimator scaleAnimator = ObjectAnimator.ofPropertyValuesHolder(
                        c1,
                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.2f, 1f),
                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.2f, 1f)
                );
                scaleAnimator.setDuration(500);

                // Create the alpha animator
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(c1, View.ALPHA, 1f, 0.5f, 1f);
                alphaAnimator.setDuration(500);

                // Create the animator set and play the animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleAnimator, alphaAnimator);
                animatorSet.start();

                Intent intent = new Intent(getApplicationContext(), array.class);
                startActivity(intent);
            }
        } );

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the scale animator
                ObjectAnimator scaleAnimator = ObjectAnimator.ofPropertyValuesHolder(
                        c2,
                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.2f, 1f),
                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.2f, 1f)
                );
                scaleAnimator.setDuration(500);

                // Create the alpha animator
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(c2, View.ALPHA, 1f, 0.5f, 1f);
                alphaAnimator.setDuration(500);

                // Create the animator set and play the animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleAnimator, alphaAnimator);
                animatorSet.start();

                Intent intent = new Intent(getApplicationContext(), linkedlist.class);
                startActivity(intent);
            }
        } );

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the scale animator
                ObjectAnimator scaleAnimator = ObjectAnimator.ofPropertyValuesHolder(
                        c3,
                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.2f, 1f),
                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.2f, 1f)
                );
                scaleAnimator.setDuration(500);

                // Create the alpha animator
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(c3, View.ALPHA, 1f, 0.5f, 1f);
                alphaAnimator.setDuration(500);

                // Create the animator set and play the animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleAnimator, alphaAnimator);
                animatorSet.start();

                Intent intent = new Intent(getApplicationContext(), stack.class);
                startActivity(intent);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the scale animator
                ObjectAnimator scaleAnimator = ObjectAnimator.ofPropertyValuesHolder(
                        c4,
                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.2f, 1f),
                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.2f, 1f)
                );
                scaleAnimator.setDuration(500);

                // Create the alpha animator
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(c4, View.ALPHA, 1f, 0.5f, 1f);
                alphaAnimator.setDuration(500);

                // Create the animator set and play the animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleAnimator, alphaAnimator);
                animatorSet.start();
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the scale animator
                ObjectAnimator scaleAnimator = ObjectAnimator.ofPropertyValuesHolder(
                        c5,
                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.2f, 1f),
                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.2f, 1f)
                );
                scaleAnimator.setDuration(500);

                // Create the alpha animator
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(c5, View.ALPHA, 1f, 0.5f, 1f);
                alphaAnimator.setDuration(500);

                // Create the animator set and play the animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleAnimator, alphaAnimator);
                animatorSet.start();
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the scale animator
                ObjectAnimator scaleAnimator = ObjectAnimator.ofPropertyValuesHolder(
                        c6,
                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.2f, 1f),
                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.2f, 1f)
                );
                scaleAnimator.setDuration(500);

                // Create the alpha animator
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(c6, View.ALPHA, 1f, 0.5f, 1f);
                alphaAnimator.setDuration(500);

                // Create the animator set and play the animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleAnimator, alphaAnimator);
                animatorSet.start();
            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create the scale animator
                ObjectAnimator scaleAnimator = ObjectAnimator.ofPropertyValuesHolder(
                        c7,
                        PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 1.2f, 1f),
                        PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 1.2f, 1f)
                );
                scaleAnimator.setDuration(500);

                // Create the alpha animator
                ObjectAnimator alphaAnimator = ObjectAnimator.ofFloat(c7, View.ALPHA, 1f, 0.5f, 1f);
                alphaAnimator.setDuration(500);

                // Create the animator set and play the animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleAnimator, alphaAnimator);
                animatorSet.start();
            }
        });

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.array: i = new Intent(this , array.class); startActivity(i); break;
            case R.id.linkedlist: i = new Intent(this , linkedlist.class); startActivity(i); break;
            case R.id.stack: i = new Intent(this , stack.class); startActivity(i); break;
            case R.id.queue: i = new Intent(this , queue.class); startActivity(i); break;
//            case R.id.trees: i = new Intent(this , tree.class); startActivity(i); break;
//            case R.id.graphs: i = new Intent(this , graph.class); startActivity(i); break;
//            case R.id.dp: i = new Intent(this , dp.class); startActivity(i); break;
        }
    }
}