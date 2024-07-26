package com.compose.practice.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


/**
 * @author: Frankie
 * @Date: 2024/7/25
 * @Description:
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetUse() {
    var showBottomSheet by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false,
    )
    Box(modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 24.dp)){
        Button(onClick = {  showBottomSheet=!showBottomSheet },Modifier.padding(top =8.dp, start = 8.dp).align(Alignment.TopCenter)) {
            val str=if(showBottomSheet){
                "show BottomSheetUse"
            }else{
                "hide BottomSheetUse"
            }
            Text(str)
        }

        if (showBottomSheet){
            ModalBottomSheet(
                modifier = Modifier.fillMaxHeight(),
                sheetState = sheetState,
                onDismissRequest = { showBottomSheet = false }
            ) {
                Text(
                    "Swipe up to open sheet. Swipe down to dismiss.",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }

}