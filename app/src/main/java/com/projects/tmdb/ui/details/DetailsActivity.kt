package com.projects.tmdb.ui.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projects.tmdb.R

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    }

    companion object {
        const val EXTRAS_MOVIE_ID = "movie_id"
    }
}
