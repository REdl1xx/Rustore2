package com.example.rustore2.uii

import android.annotation.SuppressLint
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
object SearchBar
@Serializable
object AppCard


@Composable
fun Rootscreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SearchBar){
        composable<SearchBar>{}
    }
}
//&