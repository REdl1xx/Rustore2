package com.example.rustore2.uii

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import java.io.File
import com.example.rustore2.MainActivity
import com.example.rustore2.uii.AppCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.rustore2.R
import com.example.rustore2.uii.elementsmainapp.AppInfo
import com.example.rustore2.uii.elementsmainapp.GosuslugiAppPage
import kotlinx.serialization.Serializable


@Serializable
object Main
@Serializable
object Card
@Serializable
object Start
@Serializable
object Category
@Serializable
object BigBrother

@Composable
fun Starter(onNavigateToMain: () -> Unit) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        Image(ImageBitmap.imageResource(R.drawable.rustore_icon), contentDescription = "rustore", modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(16.dp))
        Text("Добро пожаловать в RuStore!", modifier = Modifier.fillMaxWidth().padding(16.dp), fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Получите доступ к множеству приложений и игр в РуСтор, загружайте безопасно и удобно. Ручная модерация и безопасные платежи. При поддержке Минцифры России.", modifier = Modifier.fillMaxWidth().padding(16.dp), fontSize = 16.sp, fontWeight = FontWeight.Normal)
        Spacer(Modifier.weight(1f))
        Button(onClick = {onNavigateToMain()},
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text("Продолжить")
            Spacer(Modifier.weight(1f))
            Icon(Icons.Default.ArrowForward, contentDescription = "Продолжить")
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
                        onNavigateToGos = {
                    navController.navigate(
                        route = BigBrother
                    )
                })
        }
        composable<BigBrother> {backStackEntry ->
            val bigbro: BigBrother = backStackEntry.toRoute()
            GosuslugiAppPage(
            )
        }
    }
}

@Preview
@Composable
fun StarterPreview() {
    Starter(onNavigateToMain = {})
}