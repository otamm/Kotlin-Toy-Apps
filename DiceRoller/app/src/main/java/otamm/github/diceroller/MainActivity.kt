package otamm.github.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val diceValue: TextView = findViewById<TextView>(R.id.dice_value_text)
        rollButton.setOnClickListener {
            val randomInt: String = rollDice().toString()
            diceValue.text = randomInt
        }
    }

    private fun rollDice(): Int {
        val randomInt: Int = Random().nextInt(6) + 1
        return randomInt
    }
}