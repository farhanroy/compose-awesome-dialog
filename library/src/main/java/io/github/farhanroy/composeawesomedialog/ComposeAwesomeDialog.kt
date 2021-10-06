package io.github.farhanroy.composeawesomedialog

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(10.dp)
)

@Composable
fun AlertDialogSample() {
    MaterialTheme {
        Column {
            val openDialog = remember { mutableStateOf(false)  }

            Button(onClick = {
                openDialog.value = true
            }) {
                Text("Click me")
            }

            if (openDialog.value) {
                Dialog(onDismissRequest = { openDialog.value = false }) {
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
                        FlareHeader(Modifier.size(72.dp).align(Alignment.TopCenter).border(border = BorderStroke(width = 2.dp, color = Color.White), shape = CircleShape))
                    }
                }
            }
        }

    }
}
