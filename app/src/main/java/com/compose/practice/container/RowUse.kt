package com.compose.practice.container

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.compose.practice.uitls.UiData

/**
 * @author: Frankie
 * @Date: 2024/7/18
 * @Description:
 */
@Composable
fun RowUse() {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = Modifier.statusBarsPadding()
    ) {
        items(items = UiData.listData) { item ->
            Text(text = "Row this is $item position", Modifier.padding(12.dp))
        }
    }
}