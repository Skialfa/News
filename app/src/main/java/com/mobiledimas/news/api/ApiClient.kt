package com.mobiledimas.news.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient{
    private const val BASE_URL = "https://10.126.75.155/"

    private val client = OkHttpClient.Builder()
        .addInterceptor{chain -> val request = chain.request().newBuilder()
            .addHeader("Content-Type", "application/json")
            .build()
            chain.proceed(request)
        }
        .build()

    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}