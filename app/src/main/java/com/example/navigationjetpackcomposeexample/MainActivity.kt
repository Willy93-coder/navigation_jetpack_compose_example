package com.example.navigationjetpackcomposeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigationjetpackcomposeexample.model.Routes
import com.example.navigationjetpackcomposeexample.model.Routes.Pantalla1
import com.example.navigationjetpackcomposeexample.model.Routes.Pantalla2
import com.example.navigationjetpackcomposeexample.model.Routes.Pantalla3
import com.example.navigationjetpackcomposeexample.model.Routes.Pantalla4
import com.example.navigationjetpackcomposeexample.model.Routes.Pantalla6
import com.example.navigationjetpackcomposeexample.ui.theme.NavigationJetpackComposeExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationJetpackComposeExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navigationController = rememberNavController()
                    NavHost(
                        navController = navigationController,
                        startDestination = Pantalla1.route
                    ) {
                        composable(Pantalla1.route) { Screen1(navigationController) }
                        composable(Pantalla2.route) { Screen2(navigationController) }
                        composable(Pantalla3.route) { Screen3(navigationController) }
                        composable(
                            Pantalla4.route,
                            arguments = listOf(navArgument("name") { type = NavType.StringType })
                        ) { backStackEntry ->
                            Screen4(
                                navigationController,
                                backStackEntry.arguments?.getString("name").orEmpty()
                            )
                        }
                        composable(
                            "pantalla5/{id}",
                            arguments = listOf(navArgument("id") { type = NavType.IntType })
                        ) { backStackEntry ->
                            Screen5(
                                navigationController,
                                backStackEntry.arguments?.getInt("id") ?: 0
                            )

                        }
                        composable(
                            Pantalla6.route,
                            arguments = listOf(navArgument("name") { defaultValue = "Pepe" })
                        ) { backStackEntry ->
                            Screen6(
                                navigationController,
                                backStackEntry.arguments?.getString("name")
                            )
                        }
                    }
                }
            }
        }
    }
}