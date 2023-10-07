package com.example.navpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navpractice.Pages.WelcomePage


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "first") {
        composable("first") { FirstPage(navController) }
        composable("second") { SecondPage(navController) }
        composable("text") { text(navController) }
        composable("welcome") { WelcomePage(navController) }
    }
}


@Composable
fun FirstPage(navController: NavController) {
    Column {
        Text("This is the First Page")
        Button(onClick = { navController.navigate("welcome") }) {
            Text("Go to Second Page")
        }
    }
}

@Composable
fun SecondPage(navController: NavController) {
    Column {
        Text("This is the Second Page")
        Button(onClick = { navController.navigate("text") }) {
            Text("Go to text Page")
        }
    }
}




