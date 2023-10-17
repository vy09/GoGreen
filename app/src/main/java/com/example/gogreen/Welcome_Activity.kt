package com.example.gogreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.gogreen.ui.login.LoginActivity

class WelcomeActivity : AppCompatActivity() {
    private val screenDelay: Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app's main activity
            val i = Intent(this@WelcomeActivity, LoginActivity::class.java) // Replace MainActivity with your desired activity
            startActivity(i)

            // Close this activity
            finish()
        }, screenDelay)
    }


}