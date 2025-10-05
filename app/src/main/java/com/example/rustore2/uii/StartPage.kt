package com.example.rustore2.uii

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import java.io.File
import com.example.rustore2.MainActivity
import com.example.rustore2.uii.Mainapp
import com.example.rustore2.uii.AppCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.rustore2.R
import kotlinx.serialization.Serializable


@Serializable
object Main
@Serializable
object Card
@Serializable
object Start
@Serializable
object Category

@Composable
fun Starter(onNavigateToMain: () -> Unit) {
    Column (modifier = Modifier
        .background(color = Color.White)) {
        Image(ImageBitmap.imageResource(R.drawable.rustore_icon), contentDescription = "rustore")
        Text("Добро пожаловать в RuStore!")
        Text("Welcome text example")
        Button(onClick = {onNavigateToMain()}) {
            Text("Продолжить")
        }
    }
}

@Composable
fun Main(check: Boolean) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = if (check) {Main} else {Start}) {
        composable<Start> {
            Starter(
                onNavigateToMain = {
                    navController.navigate(
                        route = Main
                    )
                }
            )
        }
        composable<Main> { backStackEntry ->
            val main: Main = backStackEntry.toRoute()
            Mainapp(
                onNavigateToCard = {
                    navController.navigate(
                        route = Card
                    )
                },
                        onNavigateToCat = {
                    navController.navigate(
                        route = Category
                    )
                },
                onNavigateToStart = {
                    navController.navigate(
                        route = Start
                    )
                }
            )
        }
        composable<Card> {
            AppCard(
                onNavigateToMain = {
                    navController.navigate(
                        route = Main
                    )
                }
            )
        }
    }
}