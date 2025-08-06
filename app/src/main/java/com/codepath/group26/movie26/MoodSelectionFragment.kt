package com.codepath.group26.movie26

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContentProviderCompat
import androidx.core.content.ContentProviderCompat.requireContext
import com.codepath.asynchttpclient.AsyncHttpClient
import com.codepath.asynchttpclient.RequestParams
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import okhttp3.Headers
import okhttp3.internal.http2.Header
import org.json.JSONObject

/**
 * Fragment for mood selection screen
 * Displays the 6 mood cards for user selection
 */
class MoodSelectionFragment : Fragment() {

    // creating buttons for the moods selection
    private lateinit var happyButton: LinearLayout
    private lateinit var sadButton: LinearLayout
    private lateinit var excitedButton: LinearLayout
    private lateinit var romanticButton: LinearLayout
    private lateinit var scaredButton: LinearLayout
    private lateinit var thoughtfulButton: LinearLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        getMovie()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mood_selection, container, false)
    }

    fun getMovie(){
        val client = AsyncHttpClient()
        val url = "https://api.themoviedb.org/3/movie/popular?api_key=${BuildConfig.TMDB_API_KEY}"
        client.get(url, object : JsonHttpResponseHandler() {
            override fun onSuccess(statusCode: Int, headers: Headers, json: JSON) { // Corrected signature
                Log.d("TMDB_DEBUG", "Raw JSON response: $json")
                if (json.jsonObject != null) {
                    val responseObject = json.jsonObject
                    // TODO: Parse the popular movies from responseObject
                    // Example: val results = responseObject.getJSONArray("results")
                    Log.d("TMDB_DEBUG", "Response JSONObject: $responseObject")
                } else {
                    Log.w("TMDB_DEBUG", "Expected a JSONObject but got something else or null.")
                }
            }

            override fun onFailure(
                statusCode: Int,
                headers: Headers?, // Make headers nullable
                response: String?, // Error response is often a String
                throwable: Throwable? // Make throwable nullable
            ) {
                Log.e("TMDB_DEBUG", "Status Code: $statusCode")
                Log.e("TMDB_DEBUG", "Headers: $headers")
                Log.e("TMDB_DEBUG", "Response: $response")
                if (throwable != null) {
                    Log.e("TMDB_DEBUG", "Error: ${throwable.message}", throwable)
                }
            }
        })
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize the LinearLayouts from the layout
        happyButton = view.findViewById(R.id.mood_card_happy)
        sadButton = view.findViewById(R.id.mood_card_sad)
        excitedButton = view.findViewById(R.id.mood_card_excited)
        romanticButton = view.findViewById(R.id.mood_card_romantic)
        scaredButton = view.findViewById(R.id.mood_card_scared)
        thoughtfulButton = view.findViewById(R.id.mood_card_thoughtful)


        // TODO: Set up click listeners for mood cards
        // Set up click listeners for mood cards
        happyButton.setOnClickListener {
            handleMoodSelection("Happy")
        }

        sadButton.setOnClickListener {
            handleMoodSelection("Sad")
        }

        excitedButton.setOnClickListener {
            handleMoodSelection("Excited")
        }

        romanticButton.setOnClickListener {
            handleMoodSelection("Romantic")
        }

        scaredButton.setOnClickListener {
            handleMoodSelection("Scared")
        }

        thoughtfulButton.setOnClickListener {
            handleMoodSelection("Thoughtful")
        }
        // TODO: Navigate to movie results when mood is selected


    }



    //Here is what we do when one of the moods are selected
    private fun handleMoodSelection(mood: String) {
        // For now, let's just show a Toast
       // Toast.makeText(requireContext(), "Selected mood: $mood", Toast.LENGTH_SHORT).show()
        val genreMap = mapOf(
            "Happy" to "35,10751",
            "Sad" to "18,10749",
            "Excited" to "28,12",
            "Romantic" to "10749",
            "Scared" to "27,53",
            "Thoughtful" to "878,9648"
        )

        val genreIds = genreMap[mood] ?: "35"
        Toast.makeText(requireContext(), "Selected mood: $mood", Toast.LENGTH_SHORT).show()

        val intent = Intent(requireContext(), MovieListActivity::class.java)
        intent.putExtra("GENRE_IDS", genreIds)
        intent.putExtra("MOOD", mood)
        startActivity(intent)

        // TODO: Navigate to movie results when mood is selected
        // Example using Navigation Component:
        // val action = MoodSelectionFragmentDirections.actionMoodSelectionFragmentToMovieResultsFragment(mood)
        // findNavController().navigate(action)

        // Or, if using a custom interface to communicate with the Activity:
        // (activity as? OnMoodSelectedListener)?.onMoodSelected(mood)
    }

// Optional: Interface for communication with Activity (if not using Navigation Component directly)
// interface OnMoodSelectedListener {
//     fun onMoodSelected(mood: String)
// }
}
