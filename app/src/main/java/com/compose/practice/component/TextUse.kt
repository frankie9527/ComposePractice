package com.compose.practice.component


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.practice.R

/**
 * author: Frankie
 * Date: 2024/7/9
 * Description:
 */
@Preview
@Composable
fun TextUse() {
    Column(modifier = Modifier
        .statusBarsPadding()
        .fillMaxSize()) {
        Text(
            text = "this is text", Modifier.padding(8.dp),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            stringResource(id = R.string.app_name), Modifier.padding(8.dp),
            colorResource(id = R.color.purple_200),
        )
        Text(
            text = "this is text",
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            colorResource(id = R.color.purple_200),
            textAlign = TextAlign.Center
        )
        Text(
            text = "this is text",
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            color = Color(android.graphics.Color.parseColor("#FF03DAC5")),
        )

    }
}