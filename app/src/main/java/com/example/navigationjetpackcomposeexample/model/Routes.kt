package com.example.navigationjetpackcomposeexample.model

sealed class Routes(val route: String) {
    object Pantalla1: Routes("pantalla1")
    object Pantalla2: Routes("pantalla2")
    object Pantalla3: Routes("pantalla3")
    // Navegacion con argumentos obligatorios
    object Pantalla4: Routes("pantalla4/{name}") {
        fun createRoute(name: String) = "pantalla4/$name"
    }
    // Navegacion con argumentos obligatorios
    object Pantalla5: Routes("pantalla5/{id}") {
        fun createRoute(id: Int) = "pantalla5/$id"
    }
    // Navegacion con argumentos opcionales
    object Pantalla6: Routes("pantalla6?name={name}") {
        fun createRoute(name: String) = "pantalla6?name=$name"
    }
}