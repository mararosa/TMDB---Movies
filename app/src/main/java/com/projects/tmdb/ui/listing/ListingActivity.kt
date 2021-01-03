package com.projects.tmdb.ui.listing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.projects.tmdb.R
import com.projects.tmdb.model.Movie
import dagger.hilt.android.AndroidEntryPoint

/**
 * Shows list of movie/show
 */
@AndroidEntryPoint
class ListingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listing_activity)
    }
}
