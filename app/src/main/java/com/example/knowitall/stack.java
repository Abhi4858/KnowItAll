package com.example.knowitall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class stack extends AppCompatActivity implements View.OnClickListener {

    CardView c1;
    CardView c2;
    CardView c3;
    CardView c4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        getSupportActionBar().hide();

        c1 = findViewById(R.id.item1);
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

                Intent intent = new Intent(getApplicationContext(), stackbasics.class);
                startActivity(intent);
            }
        });

        c2 = findViewById(R.id.item2);
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

                Intent intent = new Intent(getApplicationContext(), stackoperations.class);
                startActivity(intent);
            }
        });

        c3 = findViewById(R.id.item3);
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

                Intent intent = new Intent(getApplicationContext(), stackapplications.class);
                startActivity(intent);
            }
        });

        c4 = findViewById(R.id.item4);
        c4.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.item1: i = new Intent(this , stackbasics.class); startActivity(i); break;
            case R.id.item2: i = new Intent(this , stackoperations.class); startActivity(i); break;
            case R.id.item3: i = new Intent(this , stackapplications.class); startActivity(i); break;
//            case R.id.queue: i = new Intent(this , queue.class); startActivity(i); break;
//            case R.id.trees: i = new Intent(this , tree.class); startActivity(i); break;
//            case R.id.graphs: i = new Intent(this , graph.class); startActivity(i); break;
//            case R.id.dp: i = new Intent(this , dp.class); startActivity(i); break;
        }
    }
}