package com.example.lab33

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScreenA(onBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically)
    ) {
        Text("Ейфелева вежа: Найвідоміший символ, створений Густавом Ейфелем " +
                "до Всесвітньої виставки 1889 року, символ інновацій та Парижа у всьому світі.")
        Button(onClick = onBack) { Text("Назад") }
    }
}
