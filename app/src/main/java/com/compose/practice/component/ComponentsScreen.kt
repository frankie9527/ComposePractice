package com.compose.practice.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.compose.practice.UiData

/**
 * author: Frankie
 * Date: 2024/7/18
 * Description:
 */
@Composable
fun ComponentsScreen(navController: NavHostController, paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
    ) {
        Text(
            text = "component use", Modifier.padding(16.dp),
            fontSize = 24.sp, color = MaterialTheme.colorScheme.primary
        )
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),

        ) {
            items(items =UiData.componentData) { item ->
                Button(onClick = { navController.navigate(item.route) }) {
                    Text(item.text)
                }
            }
        }

    }
}