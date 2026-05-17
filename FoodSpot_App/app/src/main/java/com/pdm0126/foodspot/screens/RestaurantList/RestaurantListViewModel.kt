package com.pdm0126.foodspot.screens.RestaurantList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantApiRepository
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestaurantListViewModel : ViewModel() {

    private val restaurantRepository: RestaurantRepository = RestaurantApiRepository()
    private val _allRestaurants = MutableStateFlow<List<Restaurant>>(emptyList())
    private val _filteredRestaurants = MutableStateFlow<List<Restaurant>>(emptyList())
    val filteredRestaurants = _filteredRestaurants.asStateFlow()
    private val _loading = MutableStateFlow<Boolean>(false)
    val loading = _loading.asStateFlow()
    private val _selectedCategory = MutableStateFlow<String?>(null)
    val selectedCategory = _selectedCategory.asStateFlow()
    private val _categories = MutableStateFlow<List<String>>(emptyList())
    val categories = _categories.asStateFlow()

    fun onCategorySelected(category: String?) {
        _selectedCategory.value = category
        _filteredRestaurants.value = if (category == null) {
            _allRestaurants.value
        } else {
            _allRestaurants.value.filter { restaurant ->
                restaurant.categories.contains(category)
            }
        }
    }

    init {
        loadRestaurants()
    }

    fun loadRestaurants() {
        viewModelScope.launch {
            _loading.value = true
            _allRestaurants.value = restaurantRepository.getRestaurants()
            _filteredRestaurants.value = _allRestaurants.value
            _categories.value = _allRestaurants.value.flatMap { it.categories }.distinct()
            _loading.value = false
        }
    }
}