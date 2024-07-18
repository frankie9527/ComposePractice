package com.compose.practice.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.compose.practice.navigation.ComponentsDestination

/**
 * author: Frankie
 * Date: 2024/7/18
 * Description:
 */
@Composable
fun ComponentsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(24.dp),
    ) {
        Text(
            text = "component use", Modifier.padding(16.dp),
            fontSize = 24.sp, color = MaterialTheme.colorScheme.primary
        )
        LazyColumn(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            items(items = ComponentsDestination.entries) { item ->
                Button(onClick = { navController.navigate(item.route) }) {
                    Text(item.title)
                }
            }
        }

    }
}