package com.example.hamlet_login_sample.api

import com.example.hamlet_login_sample.model.LoginResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServices {

    @FormUrlEncoded
    @POST("auth/login")
    fun loginUser(@Field("email") email:String,
              @Field("password") password: String): Call<LoginResponse>
}