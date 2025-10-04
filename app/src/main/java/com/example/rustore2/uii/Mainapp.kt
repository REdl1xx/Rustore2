package com.example.rustore2.uii

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Mainapp(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun vizov(){
    Mainapp()
}