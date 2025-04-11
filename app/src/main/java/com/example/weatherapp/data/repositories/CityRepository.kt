package com.example.weatherapp.data.repositories

import com.example.weatherapp.R
import com.example.weatherapp.data.models.City


class CityRepository {
    val cities = listOf(
        City("Ижевск", "Izhevsk"),
        City("Москва", "Moscow"),
        City("Казань", "Kazan"),
        City("Екатеринбург", "Ekaterinburg"),
        City("Санкт-Петербург", "Saint Petersburg"),
        City("Омск", "Omsk")

    )
}