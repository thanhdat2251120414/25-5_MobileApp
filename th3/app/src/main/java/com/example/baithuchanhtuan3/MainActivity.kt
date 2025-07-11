package com.example.baithuchanhtuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.baithuchanhtuan3.ui.theme.Baithuchanhtuan3Theme



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
    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {WelcomeScreen(navController) }
        composable("components") { ComponentsScreen(navController) }
        composable("text_detail") { TextDetail(navController) }
        composable("images"){Images(navController) }
        composable("text_field"){ TextField(navController)}
        composable("column_layout"){ ColumnLayout(navController)}
        composable("row_layout"){RowLayout(navController)}

    }
}
