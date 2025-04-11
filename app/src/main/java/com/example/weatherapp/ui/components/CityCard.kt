package com.example.weatherapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.weatherapp.data.models.City

@Composable
fun CityCard(city: City, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .padding(12.dp)
            .height(65.dp)
            .fillMaxWidth()
            .border(width = 1.dp, color = Color.LightGray)
            .clickable { onClick() }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(Color.White, Color.LightGray)
                    )
                )
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = city.name, style = MaterialTheme.typography.titleLarge.copy(color = Color.Black))
        }
    }
}
