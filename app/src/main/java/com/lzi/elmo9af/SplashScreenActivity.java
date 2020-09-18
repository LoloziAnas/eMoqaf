package com.lzi.elmo9af;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView imageViewLogo = findViewById(R.id.iv_logo);

        /***Animation initialized*/
        /**Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);*/

        /*** set animation */
        /**imageViewLogo.setAnimation(animation);*/

        /**** handler */
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);

    }

}
