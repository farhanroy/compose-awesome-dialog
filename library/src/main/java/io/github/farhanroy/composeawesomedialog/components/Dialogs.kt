package io.github.farhanroy.composeawesomedialog.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import io.github.farhanroy.composeawesomedialog.SuccessHeader
import io.github.farhanroy.composeawesomedialog.themes.Shapes

@Composable
fun SuccessDialog() {
    Dialog(onDismissRequest = {  }) {
        Box(
            Modifier
                .width(300.dp)
                .height(300.dp)) {
            Column(
                Modifier
                    .width(300.dp)
                    .height(300.dp)
            ) {
                Spacer(Modifier.height(36.dp))
                Box(
                    Modifier
                        .width(300.dp)
                        .height(164.dp)
                        .background(color = Color.White, shape = Shapes.large)) {

                }
            }
            SuccessHeader(Modifier.size(72.dp).align(Alignment.TopCenter).border(border = BorderStroke(width = 2.dp, color = Color.White), shape = CircleShape))
        }
    }
}