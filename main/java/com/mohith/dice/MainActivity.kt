package com.mohith.dice
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*
class MainActivity : ComponentActivity() {
    private lateinit var resultTextView: TextView
    private lateinit var rollButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView = findViewById(R.id.resultTextView)
        rollButton = findViewById(R.id.rollButton)
        rollButton.setOnClickListener { rollDice() }
    }
    private fun rollDice() {
        val random = Random()
        val randomNumber = random.nextInt(6) + 1
        val drawableResource = when (randomNumber) {
            1 -> R.drawable.one
            2 -> R.drawable.two
            3 -> R.drawable.three
            4 -> R.drawable.four
            5 -> R.drawable.five
            else -> R.drawable.six
        }
        val diceImageView = findViewById<ImageView>(R.id.diceImageView)
        diceImageView.setImageResource(drawableResource)
        val resultText = "You rolled $randomNumber"
        resultTextView.text = resultText
    }
}