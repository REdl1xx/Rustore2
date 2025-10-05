package com.example.rustore2.uii

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.rustore2.uii.elementsmainapp.SearchBar

@Composable
fun Mainapp(onNavigateToCard: () -> Unit, onNavigateToCat: () -> Unit, onNavigateToStart: () -> Unit) {
    Column(modifier = Modifier
        .background(color = Color.White)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
        SearchBar(onClick = {
            onNavigateToCard()
        })
    }
    }
}
