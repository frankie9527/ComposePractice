package com.compose.practice.container

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



/**
 * @author: Frankie
 * @Date: 2024/7/25
 * @Description:
 * FlowRow and FlowColumn are used in the same way
 * verticalArrangement = Arrangement.Bottom
 */
@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
fun FlowUse() {
    FlowRow(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Bottom,
        maxItemsInEachRow = 3
    ) {
        FlowItems()
    }
}

@Composable
private fun FlowItems() {
    Item(
        modifier = Modifier.width(50.dp),
        color =  MaterialTheme.colorScheme.primary
    )
    Item(
        modifier = Modifier.width(70.dp),
        color =  MaterialTheme.colorScheme.primary
    )
    Item(
        modifier = Modifier.width(96.dp),
        color =  MaterialTheme.colorScheme.primary
    )
    Item(
        modifier = Modifier.width(40.dp),
        color =  MaterialTheme.colorScheme.primary
    )

    Item(
        modifier = Modifier.width(150.dp),
        color = MaterialTheme.colorScheme.primary
    )
    Item(
        modifier = Modifier.width(60.dp),
        color =  MaterialTheme.colorScheme.primary
    )
    Item(
        modifier = Modifier.width(102.dp),
        color = MaterialTheme.colorScheme.primary
    )
    Item(
        modifier = Modifier.width(42.dp),
        color =  MaterialTheme.colorScheme.primary
    )

    Item(
        modifier = Modifier.width(50.dp),
        color =  MaterialTheme.colorScheme.primary
    )
    Item(
        modifier = Modifier.width(120.dp),
        color =  MaterialTheme.colorScheme.primary
    )
    Item(
        modifier = Modifier.width(110.dp),
        color = MaterialTheme.colorScheme.primary
    )
    Item(
        modifier = Modifier.width(90.dp),
        color = MaterialTheme.colorScheme.primary
    )
}
@Composable
fun Item(modifier: Modifier = Modifier, color: Color) {
    Box(
        modifier
            .padding(4.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(color)
            .height(48.dp)
    )
}