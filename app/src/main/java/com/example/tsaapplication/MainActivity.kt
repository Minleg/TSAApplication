package com.example.tsaapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tapHereButton: Button
    private lateinit var leftArrow: ImageButton
    private lateinit var rightArrow: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapHereButton = findViewById(R.id.tap_here_button)
        leftArrow = findViewById(R.id.left_arrow)
        rightArrow = findViewById(R.id.right_arrow)

        tapHereButton.setOnClickListener {
            showRandomArrow()
        }

        leftArrow.setOnClickListener {
            reset()
        }

        rightArrow.setOnClickListener {
            reset()
        }
    }

    private fun reset() {
        leftArrow.visibility = View.INVISIBLE
        rightArrow.visibility = View.INVISIBLE
        tapHereButton.visibility = View.VISIBLE
    }

    private fun showRandomArrow() {
        tapHereButton.visibility = View.INVISIBLE
        val direction = listOf("left", "right").random()
        if (direction == "left") {
            leftArrow.visibility = View.VISIBLE
        } else {
            rightArrow.visibility = View.VISIBLE
        }
    }
}
