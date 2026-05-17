package com.pdm0126.foodspot

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.foodspot.screens.RestaurantDetail.RestaurantDetailScreen
import com.pdm0126.foodspot.screens.RestaurantList.RestaurantListScreen
import com.pdm0126.foodspot.screens.Search.SearchScreen

@Composable
fun MainNavigation(){

    val backStack = rememberNavBackStack(Routes.RestaurantList)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull()},
        entryProvider = entryProvider {

            entry<Routes.RestaurantList>{
                RestaurantListScreen(
                    navigateToDetail = { restaurantId ->
                        backStack.add(Routes.RestaurantDetail(restaurantId))
                    },

                    navigateToSearch = { backStack.add(Routes.Search)}
                )
            }

            entry<Routes.RestaurantDetail>{entry ->
                RestaurantDetailScreen(
                    restaurantId = entry.restaurantId,

                    navigateToBack = { backStack.removeLastOrNull()}
                )
            }


            entry<Routes.Search>{
                SearchScreen(
                    navigateToBack = { backStack.removeLastOrNull()},

                    navigateToDetail = {restarantId ->
                        backStack.add(Routes.RestaurantDetail(restarantId))

                    }

                )
            }


        }
    )
}