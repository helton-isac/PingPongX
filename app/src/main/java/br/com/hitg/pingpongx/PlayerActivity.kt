package br.com.hitg.pingpongx

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_player.*

class PlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)


        btStart.setOnClickListener {
            val proximaTela = Intent(this, MainActivity::class.java)
            proximaTela.putExtra(Constants.KEY_EXTRA_PLAYER_1, etPlayer1.text.toString())
            proximaTela.putExtra(Constants.KEY_EXTRA_PLAYER_2, etPlayer2.text.toString())
            startActivity(proximaTela)
            finish()
        }
    }
}
