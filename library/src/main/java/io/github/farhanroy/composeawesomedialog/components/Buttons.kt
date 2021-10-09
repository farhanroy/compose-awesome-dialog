package io.github.farhanroy.composeawesomedialog.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.farhanroy.composeawesomedialog.themes.ButtonShapes

@Composable
fun OkButton() {
    Box(
        Modifier
            .background(color = Color.Blue, shape = ButtonShapes.large)
            .width(50.dp).height(20.dp)) {
        Text(text = "Ok", textAlign = TextAlign.Center, color = Color.White)
    }
}

@Composable
fun CancelButton() {
    Box(
        Modifier
            .background(color = Color.Red, shape = ButtonShapes.large)
            .width(20.dp).height(20.dp)) {
        Text(text = "Cancel", textAlign = TextAlign.Center, color = Color.White)
    }
}