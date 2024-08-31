package com.compose.practice.container

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * @author: Frankie
 * @Date: 2024/7/18
 * @Description:
 */
@Preview
@Composable
fun BoxUse() {
    Box(modifier = Modifier.fillMaxSize().statusBarsPadding().background(Color.Cyan)){
        Text(text = "top left", Modifier.align(Alignment.TopStart))
        Text(text = "top center", Modifier.align(Alignment.TopCenter))
        Text(text = "top right", Modifier.align(Alignment.TopEnd))

        Text(text = "center left", Modifier.align(Alignment.CenterStart))
        Text(text = "center", Modifier.align(Alignment.Center))
        Text(text = "center right", Modifier.align(Alignment.CenterEnd))

        Text(text = "bottom left", Modifier.align(Alignment.BottomStart))
        Text(text = "bottom center", Modifier.align(Alignment.BottomCenter))
        Text(text = "bottom right", Modifier.align(Alignment.BottomEnd))

    }
}