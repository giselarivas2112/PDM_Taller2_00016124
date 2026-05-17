package com.pdm0126.foodspot.data.repositories.RestaurantRepository

import com.pdm0126.foodspot.dummy.dummyRestaurants
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.delay

class RestaurantApiRepository : RestaurantRepository {

    override suspend fun getRestaurants(): List<Restaurant> {
        delay(1500)
        return dummyRestaurants
    }

    override suspend fun getRestaurantById(id: Int): Restaurant? {
        delay(1500)
        return dummyRestaurants.find { it.id == id }
    }
}