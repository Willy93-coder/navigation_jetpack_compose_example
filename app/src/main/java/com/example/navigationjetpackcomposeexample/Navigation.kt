package com.example.navigationjetpackcomposeexample

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.navigationjetpackcomposeexample.model.Routes.Pantalla2
import com.example.navigationjetpackcomposeexample.model.Routes.Pantalla3
import com.example.navigationjetpackcomposeexample.model.Routes.Pantalla4
import com.example.navigationjetpackcomposeexample.model.Routes.Pantalla5
import com.example.navigationjetpackcomposeexample.model.Routes.Pantalla6

@Composable
fun Screen1(navigationController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(text = "Pantalla 1", modifier = Modifier
            .align(Alignment.Center)
            .clickable { navigationController.navigate(Pantalla2.route) })
    }
}

@Composable
fun Screen2(navigationController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
        Text(text = "Pantalla 2", modifier = Modifier
            .align(Alignment.Center)
            .clickable { navigationController.navigate(Pantalla3.route) })
    }
}

@Composable
fun Screen3(navigationController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Text(text = "Pantalla 3", modifier = Modifier
            .align(Alignment.Center)
            .clickable { navigationController.navigate(Pantalla4.createRoute("Willy")) })
    }
}

@Composable
fun Screen4(navigationController: NavHostController, name: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        Text(
            text = name, modifier = Modifier
                .align(Alignment.Center)
                .clickable { navigationController.navigate(Pantalla5.createRoute(5)) }
        )
    }
}

@Composable
fun Screen5(navigationController: NavHostController, id: Int) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {
        Text(
            text = "User id: $id", modifier = Modifier
                .align(Alignment.Center)
                .clickable { navigationController.navigate(Pantalla6.createRoute("Aris")) },
            color = Color.White
        )
    }
}

@Composable
fun Screen6(navigationController: NavHostController, name: String?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Text(
            text = "Me llamo $name", modifier = Modifier
                .align(Alignment.Center)
        )
    }
}

