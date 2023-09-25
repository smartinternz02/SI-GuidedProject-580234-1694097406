package com.mohith.foodapp
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object RetrofitInstance {
    val api:Api by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.deshizon.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
    }
}
