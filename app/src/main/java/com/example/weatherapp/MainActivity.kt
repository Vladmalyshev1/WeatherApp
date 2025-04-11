package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.weatherapp.data.api.CityClient
import com.example.weatherapp.data.api.WeatherClient
import com.example.weatherapp.data.repositories.CityRepository
import com.example.weatherapp.data.repositories.WeatherRepository
import com.example.weatherapp.ui.theme.WeatherAppTheme
import com.example.weatherapp.ui.viewmodels.WeatherViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val weatherApi = WeatherClient.api
        val cityApi = CityClient.api
        val weatherRepository = WeatherRepository(weatherApi, cityApi)
        val cityRepository = CityRepository()
        val weatherViewModel = WeatherViewModel(weatherRepository, cityRepository)

        setContent {
            WeatherAppTheme {
                App(weatherViewModel)
            }
        }
    }
}