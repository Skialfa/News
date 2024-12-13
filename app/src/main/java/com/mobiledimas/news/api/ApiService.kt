package com.mobiledimas.news.api

import com.mobiledimas.news.models.LoginRequest
import com.mobiledimas.news.models.LoginResponse
import com.mobiledimas.news.models.RegisterRequest
import com.mobiledimas.news.models.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("MobileApiBasic/register.php")
    fun register(@Body registerRequest: RegisterRequest): Call<RegisterResponse>

    @POST("MobileApiBasic/login.php")
    fun login(@Body loginRequest: LoginRequest): Call<LoginResponse>

}