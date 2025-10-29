package com.example.tweetsy.models

import com.example.tweetsy.api.TweetsyApi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class TweetsRepo @Inject constructor(private val tweetsyApi: TweetsyApi) {

    private val _categories = MutableStateFlow<List<String>>(emptyList())
    val category: StateFlow<List<String>>
        get() = _categories

    private val _tweets = MutableStateFlow<List<TweetListItem>>(emptyList())
    val tweets: StateFlow<List<TweetListItem>>
        get() = _tweets

    suspend fun getCategory() {
        val response = tweetsyApi.getCategory()
        if (response.isSuccessful && response.body() != null) {
            _categories.emit(response.body()!!)
        }
    }
    suspend fun getTweets(category: String) {
        val response = tweetsyApi.getTweets("tweets[?(@.category ==\"$category\")]")
        if (response.isSuccessful && response.body() != null) {
            _tweets.emit(response.body()!!)
        }
    }
}