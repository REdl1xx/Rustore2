package com.example.rustore2.uii.elementsmainapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
// Импортируем AutoMirrored версию иконки
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rustore2.R // Убедитесь, что импортировали ваш R-файл

@Preview
@Composable
fun GosuslugiAppPage(modifier: Modifier = Modifier) {
    // Используем Column с вертикальной прокруткой для всей страницы
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color.White)
    ) {
        // -- 1. ВЕРХНИЙ БЛОК: ИКОНКА, НАЗВАНИЕ, КНОПКА --
        AppHeader()

        // -- 2. БЛОК СКРИНШОТОВ --
        ScreenshotsSection()

        // -- 3. БЛОК ОПИСАНИЯ --
        DescriptionSection()

        // -- 4. БЛОК РЕЙТИНГА И ОТЗЫВОВ --
        RatingAndReviewsSection()

        // -- 5. КНОПКА УСТАНОВКИ ВНИЗУ --
        InstallButtonFooter()
    }
}

@Composable
private fun AppHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.gosuslugi_icon),
            contentDescription = "Иконка приложения Госуслуги",
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(16.dp))
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Госуслуги",
                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                color = Color.Black
            )
            Text(
                text = "Минцифры России",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "100+ млн скачиваний",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )
        }
    }
}

@Composable
private fun ScreenshotsSection() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val screenshotItems = listOf(
            R.drawable.placeholder_1,
            R.drawable.placeholder_2,
            R.drawable.placeholder_3,
            R.drawable.placeholder_1, // Повторяем для примера
            R.drawable.placeholder_2
        )
        items(screenshotItems.size) { index ->
            Image(
                painter = painterResource(id = screenshotItems[index]),
                contentDescription = "Скриншот приложения ${index + 1}",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(240.dp)
                    .width(135.dp)
                    .clip(androidx.compose.foundation.shape.RoundedCornerShape(12.dp))
                    .background(Color.LightGray)
            )
        }
    }
}

@Composable
private fun DescriptionSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "О приложении",
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Официальное приложение портала Госуслуг Российской Федерации. " +
                    "Здесь вы можете получить доступ к государственным услугам в электронном виде: " +
                    "записаться к врачу, проверить и оплатить штрафы ГИБДД, заказать выписку из ЕГРН, " +
                    "а также хранить цифровые копии документов.",
            style = MaterialTheme.typography.bodyMedium,
            color = Color.DarkGray,
            maxLines = 4, // Ограничиваем количество строк для краткости
            overflow = TextOverflow.Ellipsis // Добавляем многоточие, если текст не влезает
        )
    }
}

@Composable
private fun RatingAndReviewsSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "4.8",
                style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold)
            )
            Row {
                repeat(5) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = null,
                        tint = if (it < 5) MaterialTheme.colorScheme.primary else Color.Gray,
                        modifier = Modifier.size(16.dp)
                    )
                }
            }
        }
        TextButton(onClick = { /* TODO: Navigate to all reviews */ }) {
            Text("Все отзывы")
            Icon(
                // ИСПОЛЬЗУЕМ ИСПРАВЛЕННУЮ ИКОНКУ
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = "Перейти ко всем отзывам"
            )
        }
    }
}

@Composable
private fun InstallButtonFooter() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = { /* TODO: Install action */ },
            modifier = Modifier.fillMaxWidth(),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp)
        ) {
            Text(
                text = "Установить",
                modifier = Modifier.padding(vertical = 8.dp),
                fontSize = 16.sp
            )
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GosuslugiAppPagePreview() {
    // Обертка для превью, чтобы имитировать фон приложения
    Box(modifier = Modifier.background(Color.White)) {
        GosuslugiAppPage()
    }
}
