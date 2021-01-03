package com.projects.tmdb.ui.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.projects.tmdb.R
import dagger.hilt.android.AndroidEntryPoint

/**
 * Shows detailed information about movie/show
 */

@AndroidEntryPoint
class DetailsActivity : AppCompatActivity() {
    private val viewModel by viewModels<DetailsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    }

    companion object {
        const val EXTRAS_MOVIE_ID = "movie_id"
    }
}
