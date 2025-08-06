package com.codepath.group26.movie26



import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbService {
    @GET("discover/movie")
    fun getMoviesByGenre(
        @Query("api_key") apiKey: String,
        @Query("with_genres") genreIds: String,
        @Query("sort_by") sortBy: String = "popularity.desc"
    ): Call<MovieResponse>
}
