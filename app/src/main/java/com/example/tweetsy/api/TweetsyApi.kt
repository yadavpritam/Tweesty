package com.example.tweetsy.api

import com.example.tweetsy.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyApi {
    @GET("/v3/b/68b0a963d0ea881f406984f3?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category: String): Response<List<TweetListItem>>

    @GET("/v3/b/68b0a963d0ea881f406984f3?meta=false")
    @Headers("X-JSON-PATH: tweets..category")
    suspend fun getCategory(): Response<List<String>>

}