package com.compose.practice.container

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
fun ColumnUse() {
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = Modifier.padding(top = 24.dp)
    ) {
        items(items = UiData.listData){ item ->
            Text(text = "Column this is $item position",Modifier.padding(12.dp))
        }
    }
}