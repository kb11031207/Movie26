package com.codepath.group26.movie26

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.codepath.group26.movie26.BuildConfig

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
        Log.d("TMDB_KEY_TEST", "API Key: ${BuildConfig.TMDB_API_KEY}")
        Log.d("TMDB_KEY_TEST", "API Key: ${BuildConfig.TMDB_BEARER_TOKEN}")
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