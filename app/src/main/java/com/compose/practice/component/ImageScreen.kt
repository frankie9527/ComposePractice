package com.compose.practice.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.compose.practice.R


/**
 * @author: Frankie
 * @Date: 2024/7/9
 * @Description:
 */
@Composable
fun ImageScreen(paddingValues: PaddingValues) {
    Column(modifier = Modifier
        .padding(paddingValues)) {
        Row{
            Image(
                painter = painterResource(R.drawable.ab1_inversions),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(88.dp)
                    .clip(CircleShape))
            Image(
                painter = painterResource(R.drawable.ab1_inversions),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(88.dp)
                    .clip(CircleShape))

        }
        Row{
            Image(
                painter = painterResource(R.drawable.ab1_inversions),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(88.dp)
                    .clip(CircleShape))
            Image(
                painter = painterResource(R.drawable.ab2_quick_yoga),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(80.dp)
            )
        }
    }

}