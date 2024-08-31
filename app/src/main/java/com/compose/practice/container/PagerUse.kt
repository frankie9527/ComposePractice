package com.compose.practice.container

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.compose.practice.uitls.UiData

/**
 * @author: Frankie
 * @Date: 2024/7/19
 * @Description:
 * HorizontalPager and VerticalPager are used in the same way
 * link  as follows
 * https://developer.android.google.cn/develop/ui/compose/layouts/pager
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PagerUse() {
    val count = rememberPagerState(pageCount = {
        UiData.listData.size
    })
    HorizontalPager(state = count, modifier = Modifier.statusBarsPadding()) { page ->
        // Our page content
        Box(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "this is $page", Modifier.align(Alignment.Center),
                fontSize = 24.sp, color = MaterialTheme.colorScheme.primary
            )
        }
    }
}