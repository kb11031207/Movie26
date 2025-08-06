package com.codepath.group26.movie26

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MovieListActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        recyclerView = findViewById(R.id.recyclerViewMovies)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val genreIds = intent.getStringExtra("GENRE_IDS") ?: return
        fetchMovies(genreIds)
    }

    private fun fetchMovies(genreIds: String) {
        RetrofitInstance.api.getMoviesByGenre(
            apiKey = "5f8971495f0354b7a4b7a02418e1dba0",
            genreIds = genreIds
        ).enqueue(object : Callback<MovieResponse> {
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                if (response.isSuccessful) {
                    val movies = response.body()?.results ?: emptyList()
                    adapter = MovieAdapter(movies)
                    recyclerView.adapter = adapter
                }
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                Toast.makeText(this@MovieListActivity, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
