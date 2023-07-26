package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val buttonSkills = findViewById<AppCompatButton>(R.id.buttonSkills)
        val buttonEducation = findViewById<AppCompatButton>(R.id.buttonEducation)
        val buttonWork = findViewById<AppCompatButton>(R.id.buttonWork)
        val buttonAchievement = findViewById<AppCompatButton>(R.id.buttonAchievement)

        buttonSkills.setOnClickListener{
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }
        buttonEducation.setOnClickListener{
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
        buttonWork.setOnClickListener{
            val intent = Intent(this, WorkActivity::class.java)
            startActivity(intent)
        }
        buttonAchievement.setOnClickListener{
            val intent = Intent(this, AchievementActivity::class.java)
            startActivity(intent)
        }
    }
}