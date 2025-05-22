package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProfileXMLLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun ProfileXMLLayout(modifier: Modifier = Modifier) {
        AndroidView(
            modifier = modifier,
            factory = { context ->
                val view = LayoutInflater.from(context).inflate(R.layout.layout, null)

                val nameInput = view.findViewById<EditText>(R.id.editTextName)
                val ageInput = view.findViewById<EditText>(R.id.editTextAge)
                val resultText = view.findViewById<TextView>(R.id.textViewResult)
                val checkButton = view.findViewById<Button>(R.id.buttonCheck)

                checkButton.setOnClickListener {
                    val name = nameInput.text.toString().trim()
                    val ageStr = ageInput.text.toString().trim()

                    val age = ageStr.toIntOrNull()
                    val category = when {
                        age == null -> "Vui lòng nhập tuổi hợp lệ"
                        age > 65 -> "Người già"
                        age in 6..65 -> "Người lớn"
                        age in 2..5 -> "Trẻ em"
                        age <= 2 -> "Em bé"
                        else -> "Không xác định"
                    }

                    resultText.text = if (age != null) {
                        "Họ tên: $name\nTuổi: $age\nPhân loại: $category"
                    } else {
                        category
                    }
                }

                view
            }
        )
    }
}
