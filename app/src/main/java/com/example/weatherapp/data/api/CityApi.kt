package com.example.weatherapp.data.api

import com.example.weatherapp.data.models.CityResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface CityApi {
    @GET("v1/city")
    suspend fun getCityData(
        @Query("name") name: String,
        @Header("X-Api-Key") api: String = "qoo3GC/lpyosMn+pNcaY3g==u6YGnHyoj4o64sGc"
    ): Response<List<CityResponse>>
}

object CityClient {

    val api: CityApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.api-ninjas.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CityApi::class.java)
    }
}