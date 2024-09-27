package com.example.lkjh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


		val rollButtonMA: Button = findViewById(R.id.button_ActMain)
		rollButtonMA.setOnClickListener {
			rollDiceMA()
		}
    }


	private fun rollDiceMA() {
		val diceMA = DiceMA(6)
		val cubeRoll = diceMA.rollMA()
		val diceImg: ImageView = findViewById(R.id.imageView)
		diceImg.setImageResource(R.drawable.dice6)

		when (cubeRoll){
			1 -> diceImg.setImageResource(R.drawable.dice1)
			2 -> diceImg.setImageResource(R.drawable.dice2)
			3 -> diceImg.setImageResource(R.drawable.dice3)
			4 -> diceImg.setImageResource(R.drawable.dice4)
			5 -> diceImg.setImageResource(R.drawable.dice5)
			6 -> diceImg.setImageResource(R.drawable.dice6)
		}
	}

	class DiceMA (val numSidesMA: Int) {
		fun rollMA (): Int {
			return (1..numSidesMA).random()
		}
	}
}
