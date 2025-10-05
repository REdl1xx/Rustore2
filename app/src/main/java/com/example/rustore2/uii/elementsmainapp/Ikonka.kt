package com.example.rustore2.uii.elementsmainapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rustore2.R

/**
 * Модель данных, описывающая основную информацию о приложении.
 * @param name Название приложения.
 * @param developer Разработчик.
 * @param downloads Информация о скачиваниях.
 * @param iconRes Id ресурса иконки (например, R.drawable.my_icon).
 */
data class AppInfo(
    val name: String,
    val developer: String,
    val downloads: String,
    val iconRes: Int
)

/**
 * Composable-функция для отображения "шапки" с иконкой и информацией о приложении.
 * @param appInfo Объект с данными о приложении.
 * @param modifier Модификатор для настройки внешнего вида и отступов.
 */

@Composable
fun AppHeader(appInfo: AppInfo, modifier: Modifier = Modifier, onClick: @Composable () -> Unit) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Иконка приложения
            Image(
                painter = painterResource(id = appInfo.iconRes),
                contentDescription = "Иконка приложения ${appInfo.name}",
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(22.dp)) // Скругляем углы сильнее для "современного" вида
            )

            Spacer(modifier = Modifier.width(16.dp))

            // Информация о приложении
            Column(modifier = Modifier.weight(1f)) {
                // Название
                Text(
                    text = appInfo.name,
                    style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                    color = Color.Black
                )
                // Разработчик
                Text(
                    text = appInfo.developer,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.primary // Используем основной цвет темы
                )
                // Количество скачиваний
                Text(
                    text = appInfo.downloads,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            }
        }
    }
