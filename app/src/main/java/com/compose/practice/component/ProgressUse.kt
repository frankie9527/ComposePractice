package com.compose.practice.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


/**
 * @author: Frankie
 * @Date: 2024/7/9
 * @Description:
 */
@Composable
fun ProgressUse() {
    Column(
        modifier = Modifier.statusBarsPadding()
    ) {
        var loading by remember { mutableStateOf(false) }
        var currentProgress by remember { mutableStateOf(0f) }
        Button(onClick = {
            loading = true

        }, enabled = !loading) {
            Text("Start loading")
        }
        if (!loading) return
        LinearProgressIndicator(
            progress = { currentProgress },
            modifier = Modifier.fillMaxWidth(),
        )
        CircularProgressIndicator(
            modifier = Modifier.width(64.dp),
            color = MaterialTheme.colorScheme.secondary,
            trackColor = MaterialTheme.colorScheme.surfaceVariant,
        )
    }

}
