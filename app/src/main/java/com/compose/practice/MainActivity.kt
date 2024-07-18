package com.compose.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.practice.component.AnimationsScreen
import com.compose.practice.component.ButtonScreen
import com.compose.practice.component.CardScreen
import com.compose.practice.component.ComponentsScreen
import com.compose.practice.component.DialogScreen
import com.compose.practice.component.ImageScreen
import com.compose.practice.component.ProgressScreen
import com.compose.practice.component.ScaffoldScreen
import com.compose.practice.component.TextScreen
import com.compose.practice.navigation.ComponentsDestination
import com.compose.practice.navigation.HomeDestination
import com.compose.practice.ui.theme.ComposePracticeTheme
import com.compose.practice.ui.theme.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePracticeTheme {
                Scaffold { innerPadding ->
                    MainScreen(innerPadding)
                }

            }
        }
    }
}

@Composable
fun MainScreen(paddingValues: PaddingValues) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController, paddingValues) }
        HomeDestination.entries.forEach { destination ->
            composable(destination.route) {
                when (destination) {
                    HomeDestination.ComponentsUse -> ComponentsScreen(navController,paddingValues)
                    HomeDestination.AnimationsUse -> AnimationsScreen(paddingValues)
                }
            }
            ComponentsDestination.entries.forEach { destination ->
                composable(destination.route) {
                    when (destination) {
                        ComponentsDestination.ButtonUse -> ButtonScreen(paddingValues)
                        ComponentsDestination.CardUse -> CardScreen(paddingValues)
                        ComponentsDestination.DialogUse -> DialogScreen(paddingValues)
                        ComponentsDestination.ImageUse -> ImageScreen(paddingValues)
                        ComponentsDestination.ProgressUse -> ProgressScreen(paddingValues)
                        ComponentsDestination.ScaffoldUse -> ScaffoldScreen()
                        ComponentsDestination.TextUse -> TextScreen(paddingValues)
                    }
                }
            }

        }
    }
}