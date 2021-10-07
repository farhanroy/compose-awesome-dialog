package io.github.farhanroy.composeawesomedialog.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import io.github.farhanroy.composeawesomedialog.themes.ButtonShapes

@Composable
fun OkButton() {
    Box(
        Modifier
            .background(color = Color.Green, shape = ButtonShapes.large)
            .fillMaxWidth()) {
        Text(text = "Ok", textAlign = TextAlign.Center, color = Color.White)
    }
}

@Composable
fun CancelButton() {
    Box(
        Modifier
            .background(color = Color.Red, shape = ButtonShapes.large)
            .fillMaxWidth()) {
        Text(text = "Cancel", textAlign = TextAlign.Center, color = Color.White)
    }
}