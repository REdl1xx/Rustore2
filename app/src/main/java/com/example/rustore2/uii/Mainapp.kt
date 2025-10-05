package com.example.rustore2.uii

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rustore2.uii.elementsmainapp.SearchBar
import com.example.rustore2.MainActivity
import com.example.rustore2.R
import com.example.rustore2.uii.elementsmainapp.AppHeader
import com.example.rustore2.uii.elementsmainapp.AppInfo


@Composable
fun Mainapp(onNavigateToCard: () -> Unit, onNavigateToGos: () -> Unit) {
    Column(modifier = Modifier
        .background(color = Color.White)
        .fillMaxSize()
    ) {
            Row(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                SearchBar(onClick = { onNavigateToGos() })
            }
            Row(
                modifier = Modifier
                    .padding(16.dp)
            ) {
                val sampleAppInfo = AppInfo(
                    name = "Госуслуги",
                    developer = "Минцифры России",
                    downloads = "100+ млн скачиваний",
                    iconRes = R.drawable.gosuslugi_icon
                )
                AppHeader(appInfo = sampleAppInfo, onClick = {onNavigateToGos()})

        }
        Row (modifier = Modifier
            .padding(16.dp)
        ){
            val sampleAppInfo = AppInfo(
                name = "Госуслуги",
                developer = "Минцифры России",
                downloads = "100+ млн скачиваний",
                iconRes = R.drawable.gosuslugi_icon
            )
            AppHeader(appInfo = sampleAppInfo, onClick = {onNavigateToGos()})
        }
        Row (modifier = Modifier
            .padding(16.dp)
        ){
            val sampleAppInfo = AppInfo(
                name = "Госуслуги",
                developer = "Минцифры России",
                downloads = "100+ млн скачиваний",
                iconRes = R.drawable.gosuslugi_icon
            )
            AppHeader(appInfo = sampleAppInfo, onClick = {onNavigateToGos()})
        }
        Row (modifier = Modifier
            .padding(16.dp)
        ){
            val sampleAppInfo = AppInfo(
                name = "Госуслуги",
                developer = "Минцифры России",
                downloads = "100+ млн скачиваний",
                iconRes = R.drawable.gosuslugi_icon
            )
            AppHeader(appInfo = sampleAppInfo, onClick = {onNavigateToGos()})
        }
        Row (modifier = Modifier
            .padding(16.dp)
        ){
            val sampleAppInfo = AppInfo(
                name = "Госуслуги",
                developer = "Минцифры России",
                downloads = "100+ млн скачиваний",
                iconRes = R.drawable.gosuslugi_icon
            )
            AppHeader(appInfo = sampleAppInfo, onClick = {onNavigateToGos()})
        }
        Row (modifier = Modifier
            .padding(16.dp)
        ){
            val sampleAppInfo = AppInfo(
                name = "Госуслуги",
                developer = "Минцифры России",
                downloads = "100+ млн скачиваний",
                iconRes = R.drawable.gosuslugi_icon
            )
            AppHeader(appInfo = sampleAppInfo,  onClick = {onNavigateToGos()})
        }
        Row (modifier = Modifier
            .padding(16.dp)
        ){
            val sampleAppInfo = AppInfo(
                name = "Госуслуги",
                developer = "Минцифры России",
                downloads = "100+ млн скачиваний",
                iconRes = R.drawable.gosuslugi_icon
            )
            AppHeader(appInfo = sampleAppInfo, onClick = {onNavigateToGos()})
        }
        Row (modifier = Modifier
            .padding(16.dp)
        ){
            val sampleAppInfo = AppInfo(
                name = "Госуслуги",
                developer = "Минцифры России",
                downloads = "100+ млн скачиваний",
                iconRes = R.drawable.gosuslugi_icon
            )
            AppHeader(appInfo = sampleAppInfo, onClick = {onNavigateToGos()})
        }
        Row (modifier = Modifier
            .padding(16.dp)
        ){
            val sampleAppInfo = AppInfo(
                name = "Госуслуги",
                developer = "Минцифры России",
                downloads = "100+ млн скачиваний",
                iconRes = R.drawable.gosuslugi_icon
            )
            AppHeader(appInfo = sampleAppInfo, onClick = {onNavigateToGos()})
        }
        Row (modifier = Modifier
            .padding(16.dp)
        ){
            val sampleAppInfo = AppInfo(
                name = "Госуслуги",
                developer = "Минцифры России",
                downloads = "100+ млн скачиваний",
                iconRes = R.drawable.gosuslugi_icon
            )
            AppHeader(appInfo = sampleAppInfo, onClick = {onNavigateToGos()})
        }
        Row (modifier = Modifier
            .padding(16.dp)
        ){
            val sampleAppInfo = AppInfo(
                name = "Госуслуги",
                developer = "Минцифры России",
                downloads = "100+ млн скачиваний",
                iconRes = R.drawable.gosuslugi_icon
            )
            AppHeader(appInfo = sampleAppInfo, onClick = {onNavigateToGos()})
        }
        }
    }