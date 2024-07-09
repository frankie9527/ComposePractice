package com.compose.practice.component

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

/**
 * @author: Frankie
 * @Date: 2024/7/9
 * @Description:
 */
@Composable
fun ButtonScreen() {
    val context= LocalContext.current
    Column {
        Button(onClick = { Toast.makeText(context,"Button",Toast.LENGTH_LONG).show()  },Modifier.padding(top =8.dp, start = 8.dp)) {
            Text("Button")
        }
        ElevatedButton(onClick = { Toast.makeText(context,"ElevatedButton",Toast.LENGTH_LONG).show()  },Modifier.padding(top =8.dp, start = 8.dp)) {
            Text("ElevatedButton")
        }
        FilledTonalButton(onClick = { Toast.makeText(context,"FilledTonalButton",Toast.LENGTH_LONG).show()  },Modifier.padding(top =8.dp, start = 8.dp)) {
            Text("FilledTonalButton")
        }

        OutlinedButton(onClick = { Toast.makeText(context,"FilledTonalButton",Toast.LENGTH_LONG).show()  },Modifier.padding(top =8.dp, start = 8.dp)) {
            Text("OutlinedButton")
        }
        TextButton(onClick = { Toast.makeText(context,"FilledTonalButton",Toast.LENGTH_LONG).show()  },Modifier.padding(top =8.dp, start = 8.dp)) {
            Text("TextButton")
        }
    }
}