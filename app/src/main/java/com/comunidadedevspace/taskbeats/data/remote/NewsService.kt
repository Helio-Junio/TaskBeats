package com.comunidadedevspace.taskbeats.data.remote

import com.comunidadedevspace.taskbeats.BuildConfig
import retrofit2.http.GET

interface NewsService {

    //https://api.thenewsapi.com/v1/news/top?api_token=ZSt2icdHpnqvbjtXl9EHYTw17GdppH5iuHqARKFZ&locale=us&limit=3
    @GET("top?api_token=${BuildConfig.API_KEY}&locale=us")
    suspend fun fetchTopNews(): NewsResponse

    @GET("all?api_token=${BuildConfig.API_KEY}&locale=us")
    suspend fun fetchAllNews(): NewsResponse

}