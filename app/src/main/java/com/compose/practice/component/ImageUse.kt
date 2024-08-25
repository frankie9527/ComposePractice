package com.compose.practice.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.compose.practice.R
import com.compose.practice.uitls.imageUrl
import com.compose.practice.uitls.rememberGlideRequest


/**
 * @author: Frankie
 * @Date: 2024/7/9
 * @Description:
 * https://developer.android.google.cn/develop/ui/compose/graphics/images/loading
 * https://coil-kt.github.io/coil/compose/
 */
@Preview
@Composable
fun ImageUse() {
    Column(modifier = Modifier.fillMaxWidth(),horizontalAlignment= Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(R.drawable.ab1_inversions),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(128.dp)
                .padding(top = 36.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(R.drawable.ab1_inversions),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(128.dp)
                .padding(top = 24.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(R.drawable.ab1_inversions),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(128.dp)
                .padding(top = 24.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(R.drawable.ab2_quick_yoga),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(128.dp)
                .padding(top = 24.dp)
        )

        val image =rememberGlideRequest(url = imageUrl);
        image?.let {
            //http
            Image(
                bitmap = it,
                contentDescription = null,
                modifier = Modifier
                    .size(128.dp)
                    .padding(top = 24.dp)
            )
        }

        AsyncImage(
            model = imageUrl,
            modifier = Modifier
                .size(128.dp)
                .padding(top = 24.dp),
            contentDescription = "Translated description of what the image contains",
            placeholder = painterResource(R.drawable.ic_launcher_background),
            error = painterResource(R.drawable.ic_launcher_background),
        )
    }

}


