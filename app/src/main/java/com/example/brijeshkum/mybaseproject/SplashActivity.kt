package com.example.brijeshkum.mybaseproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //val imageViewTarget = GlideDrawableImageViewTarget(imageViewSplash)
        Glide.with(this).load(R.raw.ezgif_com_gif).into(imageViewSplash)

        Handler().postDelayed(Runnable {
            startActivity(Intent(this, LoginActivity::class.java))
            supportFinishAfterTransition()
        }, 2000)
    }
}
