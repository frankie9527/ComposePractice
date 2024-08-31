package com.compose.practice.container

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.compose.practice.uitls.UiData


/**
 * @author: Frankie
 * @Date: 2024/7/25
 * @Description:
 */
@Preview
@Composable
fun TabRowUse() {
    val tabIndex = remember { mutableStateOf(0) }
    Column(modifier = Modifier.statusBarsPadding().fillMaxSize()) {
        Type1(tabIndex)
        Type2(tabIndex)
        Type3(tabIndex)

    }
}

@Composable
fun Type1(tabIndex: MutableState<Int>) {
    TabRow(selectedTabIndex = tabIndex.value) {
        UiData.titleList.forEachIndexed() { index, item ->
            Tab(modifier = Modifier.width(120.dp), selected = false, onClick = {
                tabIndex.value = index;
            }, text = {
                Text(text = item)
            })
        }
    }
}

@Composable
fun Type2(tabIndex: MutableState<Int>) {
    TabRow(selectedTabIndex = tabIndex.value,
        contentColor = Color.Black,
        indicator = { tabPositions ->
            TabRowDefaults.SecondaryIndicator(
                Modifier
                    .tabIndicatorOffset(tabPositions[tabIndex.value])
                    .height(4.dp),
                color = Color.Yellow
            )
        }
    ) {
        UiData.titleList.forEachIndexed() { index, item ->
            Tab(selected = false, onClick = {
                tabIndex.value = index;
            }, text = {
                Text(text = item)
            })
        }
    }
}

@Composable
fun Type3(tabIndex: MutableState<Int>) {
    TabRow(selectedTabIndex = tabIndex.value) {
        UiData.titleList.forEachIndexed() { index, item ->
            Tab(selected = false, onClick = {
                tabIndex.value = index;
            }, text = {
                CustomTab(title = item, selected = tabIndex.value == index)
            })
        }
    }
}

@Composable
fun CustomTab(title: String, selected: Boolean) {
    val icon = when (title) {
        "home" -> Icons.Default.Home
        "news" -> Icons.Default.Email
        else -> Icons.Default.Menu
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(imageVector = icon, contentDescription = null)
        Text(text = title, color = if (selected) Color.Blue else Color.Green)
    }
}


