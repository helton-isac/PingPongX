package br.com.hitg.pingpongx

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val proximaTela = Intent(this, PlayerActivity::class.java)
            startActivity(proximaTela)
            finish()
        }, 2000)
    }
}
