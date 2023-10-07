package com.example.navpractice

import androidx.compose.foundation.clickable
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun text (navController: NavController) {
    Card(
        modifier = Modifier
            .clickable { navController.navigate("first") }
    ) {
        Text(text = "text page")
    }
}