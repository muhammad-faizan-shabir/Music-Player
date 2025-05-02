package com.example.songify

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.songify.databinding.ActivityAboutBinding


class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set theme same as that of MainActivity
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        // bind with about activity_about.xml
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()
    }

    // function to return text that is tio be shown in about section
    private fun aboutText(): String{
        return "A semester project for the course:\n   CS3009-Software Engineering" +
                "\n\nGroup members:\n"+
                "   22L-8225  Ahmed Mukhtar  6H\n"+
                "   22L-6761  Tahawar Ali          6H\n"+
                "   22L-6552  Faizan Shabir       6H"
    }
}