package com.example.baithuchanhtuan3

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun TextDetail(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically)
        {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
            Spacer(Modifier.width(50.dp))
            Text(
                text = "Text Component",
                color = Color(0xFF5B9EFF),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
            )
        }
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    buildAnnotatedString {
                        append("The ")
                        withStyle(SpanStyle(textDecoration = TextDecoration.LineThrough)) { append("quick ") }
                        withStyle(
                            SpanStyle(
                                color = Color(0xFFB8860B),
                                fontWeight = FontWeight.Bold
                            )
                        ) { append("Brown ") }
                        append("\nfox j u m p s ")
                        withStyle(
                            SpanStyle(
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Italic
                            )
                        ) { append("over ") }
                        withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) { append("the ") }
                        withStyle(SpanStyle(fontStyle = FontStyle.Italic)) { append("lazy ") }
                        append("dog ")
                    },
                    fontSize = 60.sp,
                    textAlign = TextAlign.Center
                )
            }
    }

}