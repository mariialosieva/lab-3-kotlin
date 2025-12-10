package com.example.lab33


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    openA: () -> Unit,
    openB: () -> Unit,
    openC: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically)
    )  {
        Text(
            text = "Визначні місця Парижу",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        PlaceBlock(title = "Ейфелева вежа", onMore = openA)
        PlaceBlock(title = "Лувр", onMore = openB)
        PlaceBlock(title = "Собор Нотр-Дам", onMore = openC)
    }
}

@Composable
private fun PlaceBlock(title: String, onMore: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(title)
        Button(onClick = onMore) { Text("Детальніше") }
    }
}
