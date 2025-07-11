package com.example.baithuchanhtuan3

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ComponentsScreen(navController: NavController) {
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        item {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                }
                Spacer(modifier = Modifier.width(50.dp))
                Text(
                    "UI Components List",
                    color = Color(0xFF5B9EFF),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }
        item {Spacer(Modifier.height(16.dp))}
        item { Text("Display", fontWeight = FontWeight.Bold, fontSize = 32.sp)}
        item {ComponentItem("Text", "Displays text") { navController.navigate("text_detail") }}
        item {   ComponentItem("Image", "Displays an image") { navController.navigate("images") } }
        item {   Spacer(Modifier.height(8.dp))}
        item {   Text("Input", fontWeight = FontWeight.Bold, fontSize = 32.sp)}
        item {  ComponentItem("TextField", "Input field for text") { navController.navigate("text_field") }}
        item{ ComponentItem("PasswordField", "Input field for passwords") {}}
        item {   Spacer(Modifier.height(8.dp)) }
        item {   Text("Layout", fontWeight = FontWeight.Bold, fontSize = 32.sp) }
        item {   ComponentItem("Column", "Arranges elements vertically") { navController.navigate("column_layout") } }
        item {   ComponentItem("Row", "Arranges elements horizontally") { navController.navigate("row_layout") } }
        item {
            ComponentItem(
                "Tự tìm hiểu", "Tìm ra tất cả các thành phần UI Cơ bản",
                backgroundColor = Color(0xFFFFCDD2),
                textColor = Color.Black
            )
        }
    }
}

@Composable
fun ComponentItem(
    title: String,
    desc: String,
    backgroundColor: Color = Color(0xFFD6E6FF),
    textColor: Color = Color.Black,
    onClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp)
            .background(backgroundColor, RoundedCornerShape(12.dp))
            .clickable(enabled = onClick != {}, onClick = onClick)
            .padding(25.dp)
    ) {
        Text(title, fontWeight = FontWeight.Bold, color = textColor, fontSize = 30.sp )
        Text(desc, color = textColor, fontSize = 25.sp)
    }
}
