package com.example.navpractice.Pages

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun WelcomePage (navController: NavController){
    Surface (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            Card (modifier = Modifier.size(200.dp)) {
                Text(text = "Press to activate your camera")
            }
            //CameraPage is still undefined
            Card (modifier = Modifier
                .clickable { navController.navigate("CameraPage") }
                .size(150.dp),
                colors = CardDefaults.cardColors(Color.Magenta),
                shape = RoundedCornerShape(20.dp)){

            }
            Card (modifier = Modifier
                .clickable { navController.navigate("first") }
                .size(150.dp),
                colors = CardDefaults.cardColors(Color.Magenta),
                shape = RoundedCornerShape(20.dp)){

            }
        }
    }
}