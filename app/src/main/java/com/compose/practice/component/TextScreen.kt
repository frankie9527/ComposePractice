package com.compose.practice.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.compose.practice.R

/**
 * author: Frankie
 * Date: 2024/7/9
 * Description:
 */
@Composable
fun TextScreen() {
    Column (modifier = Modifier){
        Text(text = "this is text", Modifier.padding(top =8.dp, start = 8.dp),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            stringResource(id = R.string.app_name), Modifier.padding(top =8.dp, start = 8.dp),
            colorResource(id = R.color.purple_200),
        )
    }
}