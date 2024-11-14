package com.example.smarthouse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long =3000;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashImage : ImageView = findViewById(R.id.imageView)
        val rotateAnimation = RotateAnimation(0f, 360f,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
            )
        rotateAnimation.duration=2000
        rotateAnimation.repeatCount=Animation.INFINITE
        splashImage.startAnimation(rotateAnimation)

        Handler().postDelayed({
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}