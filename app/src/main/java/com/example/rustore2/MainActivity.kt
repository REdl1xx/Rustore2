package com.example.rustore2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.rustore2.ui.theme.Rustore2Theme
import com.example.rustore2.uii.Main

val check: Boolean = false
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Rustore2Theme {
                // Это единственная строка, которая должна быть здесь.
                // Она запускает всю вашу навигацию и экраны.
                Main()
            }
        }
    }
}
