package com.codepath.group26.movie26

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        
        // Load the mood selection fragment as the default screen
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MoodSelectionFragment())
                .commit()
        }
        
        // Set up bottom navigation (placeholder for now)
        // TODO: Implement bottom navigation click handlers when other fragments are created
    }
}

data class Movie(
    val id: Int,
    val title: String,
    val poster_path: String?,
    val overview: String,
    val vote_average: Float,
    val release_date: String
)

data class MovieResponse(
    val results: List<Movie>
)
