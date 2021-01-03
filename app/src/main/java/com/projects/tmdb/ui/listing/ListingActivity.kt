package com.projects.tmdb.ui.listing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.projects.tmdb.R
import com.projects.tmdb.model.Movie
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.listing_activity.*
import java.util.*
import kotlin.collections.ArrayList

/**
 * Shows list of movie/show
 */
@AndroidEntryPoint
class ListingActivity : AppCompatActivity() {

    private val list = ArrayList<Movie>()
    private val viewModel by viewModels<ListingViewModel>()
    private lateinit var moviesAdapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listing_activity)

        init()
        subscribeUi()
    }

    private fun init() {
        val layoutManager = LinearLayoutManager(this)
        rvMovies.layoutManager = layoutManager

        val dividerItemDecoration = DividerItemDecoration(
            rvMovies.context,
            layoutManager.orientation
        )

        rvMovies.addItemDecoration(dividerItemDecoration)
        moviesAdapter = MoviesAdapter(this, list)
        rvMovies.adapter = moviesAdapter
    }

    private fun subscribeUi() {

    }

}
