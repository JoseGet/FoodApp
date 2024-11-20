package com.example.foodapp.Home.ui.models

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.foodapp.Home.ui.components.HomeIconButton
import com.example.foodapp.R

@Composable
fun HomeTopBar(

) {

    HomeIconButton(
        icon = R.drawable.icon_menu,
        modifier = Modifier
            .width(12.dp)
            .height(16.dp),
        color = colorResource(id = R.color.menu_button_background)
    )

    Column(

    ) {

    }

    HomeIconButton(
        icon = R.drawable.shopping_bag,
        modifier = Modifier
            .width(18.dp)
            .height(20.dp),
        color = colorResource(id = R.color.cart_button_background)
    )
}