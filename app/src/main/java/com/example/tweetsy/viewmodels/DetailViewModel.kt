package com.example.tweetsy.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tweetsy.models.TweetListItem
import com.example.tweetsy.models.TweetsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val repository: TweetsRepo,
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    val tweets: StateFlow<List<TweetListItem>>
        get() = repository.tweets

    init {
        viewModelScope.launch {
            val savedStateHandle = savedStateHandle.get<String>("category")?:"Motivation"
            repository.getTweets(savedStateHandle)
        }

    }

}