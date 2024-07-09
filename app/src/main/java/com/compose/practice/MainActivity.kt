package com.compose.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.practice.component.ButtonScreen
import com.compose.practice.component.TextScreen
import com.compose.practice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePracticeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("text") { TextScreen() }
        composable("button") { ButtonScreen() }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        Button(onClick = { navController.navigate("text") },Modifier.padding(top =8.dp, start = 8.dp)) {
            Text("Use Text")
        }
        Button(onClick = { navController.navigate("button") },Modifier.padding(top =8.dp, start = 8.dp)) {
            Text("Use Button")
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePracticeTheme {
        MainScreen()
    }
}