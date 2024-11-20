package com.example.foodapp.Home.ui.components

import android.graphics.drawable.Icon
import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.DefaultTintColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodapp.R

@Composable
fun HomeIconButton(
    icon: Int,
    modifier: Modifier,
    color: Color
) {
    Button(
        modifier = Modifier
            .background(color = Color.Transparent)
            .size(45.dp),
        shape = CircleShape,
        colors = ButtonColors(
            containerColor = color,
            contentColor = DefaultTintColor,
            disabledContentColor = DefaultTintColor,
            disabledContainerColor = DefaultTintColor
        ),
        onClick = {},
        contentPadding = PaddingValues(0.dp)
    ) {
        Image(
            painter = painterResource(id = icon),
            contentScale = ContentScale.Crop,
            modifier = modifier,
            contentDescription = "",
            alignment = Alignment.Center
        )
    }
}