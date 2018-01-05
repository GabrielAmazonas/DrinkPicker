package com.gabrielamazonas.drinkpicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
// The next import allows us to reference the components id's directly E.G.: selectedDrinkText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Kotlin: No semicolons

    //Kotlin: fun keyword indicates functions

    //Kotlin: onCreate is the first thing called when the activity is created.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // R = res folder
        // layout = res/layout folder
        // activity_main = activity_main.xml file
        setContentView(R.layout.activity_main)

        selectedDrinkText.text = "Sex on the Beach"




    }
}
