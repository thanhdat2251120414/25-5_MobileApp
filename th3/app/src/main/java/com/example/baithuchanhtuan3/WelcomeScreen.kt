package com.example.baithuchanhtuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp, end = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Column(horizontalAlignment = Alignment.End) {
                Text("Pham Hoang Tuan", fontWeight = FontWeight.Bold, fontSize = 24.sp)
                Text("2251120455", fontSize = 16.sp)
            }
        }

        Spacer(modifier = Modifier.height(56.dp))

        Image(
            painter = painterResource(id = R.drawable.jetpack_compose_logo),
            contentDescription = "Jetpack Compose logo",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            "Jetpack Compose",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
            textAlign = TextAlign.Center,
            color = Color.Gray,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { navController.navigate("components") },
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(bottom = 50.dp),
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1976D2), // Nền xanh dương
                contentColor = Color.White          // Chữ trắng
            )
        ) {
            Text("I'm ready", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        }

    }
}
