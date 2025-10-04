package com.example.rustore2.uii

import android.R.style.Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rustore2.uii.elementsmainapp.SearchBar


@Composable
fun Mainapp(name: String) {
    Column(modifier = Modifier
        .background(color = Color.White)
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
        SearchBar(onClick = {})
    }
    }
}


@Preview(showBackground = true)
@Composable
fun Vizov() {
    Mainapp("zzz")
}
