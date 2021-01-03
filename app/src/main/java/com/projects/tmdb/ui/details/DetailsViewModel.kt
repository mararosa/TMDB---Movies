package com.projects.tmdb.ui.details

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.projects.tmdb.data.MovieRepository
import com.projects.tmdb.model.MovieDesc
import com.projects.tmdb.model.Result
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onStart


/**
 * ViewModel for Movie details screen
 */
class DetailsViewModel @ViewModelInject constructor(private val movieRepository: MovieRepository) :
    ViewModel() {

}