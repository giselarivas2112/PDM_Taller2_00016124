package com.pdm0126.foodspot.screens.Search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantApiRepository
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SearchViewModel : ViewModel() {

    private val restaurantRepository: RestaurantRepository = RestaurantApiRepository()
    private var _allRestaurants = listOf<Restaurant>()
    private val _query = MutableStateFlow("")
    val query = _query.asStateFlow()
    private val _results = MutableStateFlow<List<Restaurant>>(emptyList())
    val results = _results.asStateFlow()

    init {

        loadRestaurants()
    }

    private fun loadRestaurants() {
        viewModelScope.launch {
            _allRestaurants = restaurantRepository.getRestaurants()
        }
    }

    fun onQueryChange(newQuery: String) {
        _query.value = newQuery
        _results.value =
            _allRestaurants.filter { restaurant ->
                restaurant.name.contains(
                    newQuery,
                    ignoreCase = true
                ) ||
                        restaurant.menu.any { dish ->
                            dish.name.contains(
                                newQuery,
                                ignoreCase = true
                            )
                        }
            }
    }
}