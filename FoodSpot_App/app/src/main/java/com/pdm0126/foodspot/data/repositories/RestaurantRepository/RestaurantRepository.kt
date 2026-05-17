package com.pdm0126.foodspot.data.repositories.RestaurantRepository

import com.pdm0126.foodspot.model.Restaurant

interface RestaurantRepository {

    suspend fun getRestaurants(): List<Restaurant>

    suspend fun getRestaurantById(id: Int): Restaurant?
}