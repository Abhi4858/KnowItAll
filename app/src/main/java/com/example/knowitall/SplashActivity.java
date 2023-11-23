package com.example.knowitall;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        imageView = findViewById(R.id.imageView);

        getSupportActionBar().hide();
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = new Intent(SplashActivity.this , MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        } , 2000);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_animation);
        imageView.startAnimation(animation);

        // Set a listener to start the next activity when the animation ends
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Animation started
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Animation ended, start the next activity
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finish the splash activity to prevent going back to it
            }
            @Override
            public void onAnimationRepeat(Animation animation) {
                // Animation repeated
            }
        });
    }

}
