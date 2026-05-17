package com.pdm0126.foodspot.screens.Search

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.foodspot.components.SearchResultItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    navigateToBack: () -> Unit,
    navigateToDetail: (Int) -> Unit,
    viewModel: SearchViewModel = viewModel()
) {

    val query by viewModel.query.collectAsState()
    val results by viewModel.results.collectAsState()

    Scaffold(
        containerColor = Color(0xFFF5F5F5),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Buscar",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 24.sp,
                        color = Color(0xFF1A1A1A)
                    )
                },

                navigationIcon = {
                    IconButton(
                        onClick = {
                            navigateToBack()
                        }
                    ) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(Color.White),

                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = Color(0xFF4A3FB3)
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFF5F5F5)
                )

            )

        }

    ) { innerpadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerpadding)
                .padding(horizontal = 20.dp)
        ) {

            OutlinedTextField(
                value = query,
                onValueChange = { newQuery -> viewModel.onQueryChange(newQuery)
                },

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),

                placeholder = {
                    Text(
                        text = "Busca restaurantes o platillos",
                        color = Color.Gray
                    )
                },

                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color(0xFF4A3FB3)
                    )
                },

                singleLine = true,

                shape = RoundedCornerShape(20.dp),

                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedBorderColor = Color(0xFF4A3FB3),
                    unfocusedBorderColor = Color.Transparent,
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    cursorColor = Color(0xFF4A3FB3)
                )

            )

            Spacer(modifier = Modifier.height(18.dp))

            if (query.isNotEmpty() && results.isNotEmpty()) {

                Text(
                    text = "${results.size} resultado${if (results.size != 1) "s" else ""}",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.height(12.dp))

            }

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(results) { restaurant ->
                    SearchResultItem(
                        restaurant = restaurant,
                        onClick = {
                            navigateToDetail(restaurant.id)
                        }

                    )

                }

            }

            if (results.isEmpty() && query.isNotEmpty()
            ) {

                Spacer(modifier = Modifier.height(60.dp))

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .background(Color.White),

                        contentAlignment = Alignment.Center
                    ) {

                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                            tint = Color(0xFF4A3FB3),
                            modifier = Modifier.size(36.dp)
                        )

                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    Text(
                        text = "No encontramos resultados",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF1A1A1A)
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "Intenta buscar otro restaurante",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )

                }

            }

        }

    }

}