package com.compose.practice.component


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * @author: Frankie
 * @Date: 2024/7/18
 * @Description:
 */
@Composable
fun AnimationsScreen() {
    Text(
        text = "AnimationsScreen", Modifier.padding(16.dp),
        fontSize = 24.sp, color = MaterialTheme.colorScheme.primary
    )
}