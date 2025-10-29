package com.example.tweetsy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tweetsy.models.TweetsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(private val repository: TweetsRepo) : ViewModel() {

    val categories: StateFlow<List<String>>
        get() = repository.category

    init {
        viewModelScope.launch {
            repository.getCategory()
        }

    }

}