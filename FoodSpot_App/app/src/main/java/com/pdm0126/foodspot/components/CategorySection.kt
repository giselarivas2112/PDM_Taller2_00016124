package com.pdm0126.foodspot.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdm0126.foodspot.model.Restaurant

@Composable
fun CategorySection(
    title: String,
    restaurants: List<Restaurant>,
    onRestaurantClick: (Restaurant) -> Unit
) {

    Text(
        text = title,
        fontSize = 26.sp,
        fontWeight = FontWeight.ExtraBold,
        color = Color(0xFF4A3FB3),
        modifier = Modifier.padding(bottom = 14.dp)
    )

    LazyRow {

        items(restaurants) { restaurant ->

            RestaurantItem(
                restaurant = restaurant,
                onClick = {
                    onRestaurantClick(restaurant)
                }
            )
        }
    }
}