package io.github.farhanroy.composeawesomedialog.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import io.github.farhanroy.composeawesomedialog.themes.ButtonShapes
import io.github.farhanroy.composeawesomedialog.themes.Shapes

@Composable
fun OkButton(modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ },
        shape = Shapes.large,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF02CB6F)),
        modifier = modifier
    ) {
        Text("Ok", style = TextStyle(color = Color.White))
    }
}

@Composable
fun CancelButton(modifier: Modifier = Modifier) {
    Button(
        onClick = { /*TODO*/ },
        shape = Shapes.large,
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFEE4435)),
        modifier = modifier
    ) {
        Text("Cancel", style = TextStyle(color = Color.White))
    }
}