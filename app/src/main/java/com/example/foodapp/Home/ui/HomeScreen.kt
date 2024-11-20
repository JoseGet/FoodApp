package com.example.foodapp.Home.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodapp.Home.ui.models.HomeTopBar

@Composable
fun HomeScreen(

) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .verticalScroll(rememberScrollState())
    ){

        Spacer(modifier = Modifier.height(50.dp))

        Row (
            modifier = Modifier
                .background(color = Color.Red)
                .fillMaxWidth()
        ){

            HomeTopBar()

        }

    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}