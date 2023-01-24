package com.example.tsaapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // variables to be declared later, private because can be used only in MainActivity
    private lateinit var tapHereButton: Button
    private lateinit var leftArrow: ImageButton
    private lateinit var rightArrow: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // variables are initialized
        tapHereButton = findViewById(R.id.tap_here_button)
        leftArrow = findViewById(R.id.left_arrow)
        rightArrow = findViewById(R.id.right_arrow)

        // OnClickeListener events on each view
        tapHereButton.setOnClickListener {
            showRandomArrow() // method call
        }

        leftArrow.setOnClickListener {
            reset()
        }

        rightArrow.setOnClickListener {
            reset()
        }
    }

    private fun reset() {
        /* This method resets the view again, makes the ImageButtons invisible and the button visible */
        leftArrow.visibility = View.INVISIBLE
        rightArrow.visibility = View.INVISIBLE
        tapHereButton.visibility = View.VISIBLE
    }

    private fun showRandomArrow() {
        /* This method gets a random value from the list with values either left or right, and depending
        * on the random value, corresponding image button is made visible and the button is made invisible*/
        tapHereButton.visibility = View.INVISIBLE // button is made invisible
        val direction = listOf("left", "right").random() // gets a random value, either left or right
        if (direction == "left") {
            leftArrow.visibility = View.VISIBLE // if random value is left, left arrow is made visible
        } else {
            rightArrow.visibility = View.VISIBLE // otherwise, i.e. random value is right and right arrow is made visible
        }
    }
}
