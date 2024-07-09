package com.compose.practice.component

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.compose.practice.component.dialog.AlertDialogExample


/**
 * @author: Frankie
 * @Date: 2024/7/9
 * @Description:
 */
@Composable
fun DialogScreen(paddingValues: PaddingValues) {
    val openAlertDialog = remember { mutableStateOf(false) }
    Button(onClick = {openAlertDialog.value=true  },
        Modifier.padding(top =8.dp, start = 8.dp)) {
        Text("Button")
    }
    if (openAlertDialog.value){
        AlertDialogExample(
            onDismissRequest = {
                openAlertDialog.value=false
                println("onDismissRequest")
            },
            onConfirmation = {
                openAlertDialog.value=false
                println("onConfirmation") // Add logic here to handle confirmation.
            },
            dialogTitle = "Alert dialog example",
            dialogText = "This is an example of an alert dialog with buttons.",
            icon = Icons.Default.Info
        )
    }

}

