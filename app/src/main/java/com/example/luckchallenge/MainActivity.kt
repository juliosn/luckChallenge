package com.example.luckchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btnRoll)
        btnRoll.setOnClickListener { luckChallenge() }
    }
    private fun luckChallenge()
    {
        val number = (1..6).random()
        val editDice: EditText = findViewById(R.id.edtNumber)

        val drawableResource: ImageView = findViewById(R.id.imgRollDice)

        val image = when(number){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        drawableResource.setImageResource(image)

        if(editDice.text.toString().trim().isEmpty())
        {
            Toast.makeText(this,"Please, insert a number", Toast.LENGTH_SHORT).show()
        }
        else {
            if(number == Integer.parseInt(editDice.text.toString()))
            {
                Toast.makeText(this,"You win!", Toast.LENGTH_SHORT).show()
            }
            else {
                if(number != Integer.parseInt(editDice.text.toString()))
                {
                    Toast.makeText(this,"You lose!", Toast.LENGTH_SHORT).show()
                }
            }
        }




    }
}