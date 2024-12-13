package com.mobiledimas.news.models

data class RegisterRequest(
    val username: String,
    val email: String,
    val password: String,
    val fullname: String
)
