package com.compose.practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.practice.component.BottomSheetUse
import com.compose.practice.screen.AnimationsScreen
import com.compose.practice.component.ButtonUse
import com.compose.practice.component.CardUse
import com.compose.practice.screen.ComponentsScreen
import com.compose.practice.component.DialogUse
import com.compose.practice.component.ImageUse
import com.compose.practice.component.ProgressUse
import com.compose.practice.component.ScaffoldUse
import com.compose.practice.component.TextUse
import com.compose.practice.container.BoxUse
import com.compose.practice.container.ColumnUse
import com.compose.practice.container.ConstraintUse
import com.compose.practice.container.FlowUse
import com.compose.practice.container.PagerUse
import com.compose.practice.container.RowUse
import com.compose.practice.screen.ViewContainersScreen
import com.compose.practice.navigation.ComponentsDestination
import com.compose.practice.navigation.HomeDestination
import com.compose.practice.navigation.ViewContainersDestination
import com.compose.practice.ui.theme.ComposePracticeTheme
import com.compose.practice.screen.HomeScreen

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
        composable("home") { HomeScreen(navController) }
        HomeDestination.entries.forEach { destination ->
            composable(destination.route) {
                when (destination) {
                    HomeDestination.AnimationsUse -> AnimationsScreen()
                    HomeDestination.ComponentsUse -> ComponentsScreen(navController)
                    HomeDestination.ViewContainersUse -> ViewContainersScreen(navController)
                }
            }
            ComponentsDestination.entries.forEach { destination ->
                composable(destination.route) {
                    when (destination) {
                        ComponentsDestination.BottomSheetUse -> BottomSheetUse()
                        ComponentsDestination.ButtonUse -> ButtonUse()
                        ComponentsDestination.CardUse -> CardUse()
                        ComponentsDestination.DialogUse -> DialogUse()
                        ComponentsDestination.ImageUse -> ImageUse()
                        ComponentsDestination.ProgressUse -> ProgressUse()
                        ComponentsDestination.ScaffoldUse -> ScaffoldUse()
                        ComponentsDestination.TextUse -> TextUse()
                    }
                }
            }

            ViewContainersDestination.entries.forEach { destination ->
                composable(destination.route) {
                    when (destination) {
                        ViewContainersDestination.BoxUse -> BoxUse()
                        ViewContainersDestination.ColumnUse -> ColumnUse()
                        ViewContainersDestination.ConstraintUse -> ConstraintUse()
                        ViewContainersDestination.FlowUse -> FlowUse()
                        ViewContainersDestination.PagerUse -> PagerUse()
                        ViewContainersDestination.RowUse -> RowUse()

                    }}}
        }
    }
}