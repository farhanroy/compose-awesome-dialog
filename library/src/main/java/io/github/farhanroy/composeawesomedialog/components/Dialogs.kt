package io.github.farhanroy.composeawesomedialog.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import io.github.farhanroy.composeawesomedialog.ErrorHeader
import io.github.farhanroy.composeawesomedialog.InfoHeader
import io.github.farhanroy.composeawesomedialog.SuccessHeader
import io.github.farhanroy.composeawesomedialog.themes.Shapes

@Composable
fun SuccessDialog(
    title: String = "",
    desc: String = "",
    onDismiss: () -> Unit
) {
    Dialog(onDismissRequest = onDismiss ) {
        Box(
            Modifier
                .width(300.dp)
                .height(400.dp)) {
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
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(title.uppercase(), style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold))
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(desc, style = TextStyle(fontSize = 14.sp, ))
                        Spacer(modifier = Modifier.height(24.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth()) {
                            CancelButton(
                                Modifier
                                    .fillMaxWidth()
                                    .weight(1f))
                            Spacer(modifier = Modifier.width(8.dp))
                            OkButton(
                                Modifier
                                    .fillMaxWidth()
                                    .weight(1f))
                        }
                    }
                }
            }
            SuccessHeader(
                Modifier
                    .size(72.dp)
                    .align(Alignment.TopCenter)
                    .border(
                        border = BorderStroke(width = 5.dp, color = Color.White),
                        shape = CircleShape
                    ))
        }
    }
}

@Composable
fun ErrorDialog(
    title: String = "",
    desc: String = "",
    onDismiss: () -> Unit
) {
    Dialog(onDismissRequest = onDismiss) {
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
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(title.uppercase(), style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold))
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(desc, style = TextStyle(fontSize = 14.sp, ))
                        Spacer(modifier = Modifier.height(24.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth()) {
                            OkButton(
                                Modifier
                                    .fillMaxWidth()
                                    .weight(1f))
                            Spacer(modifier = Modifier.width(8.dp))
                            CancelButton(
                                Modifier
                                    .fillMaxWidth()
                                    .weight(1f))
                        }
                    }
                }
            }
            ErrorHeader(
                Modifier
                    .size(72.dp)
                    .align(Alignment.TopCenter)
                    .border(
                        border = BorderStroke(width = 5.dp, color = Color.White),
                        shape = CircleShape
                    ))
        }
    }
}

@Composable
fun InfoDialog(
    title: String = "",
    desc: String = "",
    onDismiss: () -> Unit,
) {
    Dialog(onDismissRequest = onDismiss) {
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
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(title.uppercase(), style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold))
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(desc, style = TextStyle(fontSize = 14.sp, ))
                        Spacer(modifier = Modifier.height(24.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth()) {
                            OkButton(
                                Modifier
                                    .fillMaxWidth()
                                    .weight(1f))
                            Spacer(modifier = Modifier.width(8.dp))
                            CancelButton(
                                Modifier
                                    .fillMaxWidth()
                                    .weight(1f))
                        }
                    }
                }
            }
            InfoHeader(
                Modifier
                    .size(72.dp)
                    .align(Alignment.TopCenter)
                    .border(
                        border = BorderStroke(width = 4.dp, color = Color.White),
                        shape = CircleShape
                    ))
        }
    }
}