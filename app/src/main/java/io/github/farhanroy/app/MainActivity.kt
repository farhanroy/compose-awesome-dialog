package io.github.farhanroy.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.window.Dialog
import io.github.farhanroy.app.ui.theme.ComposeAwesomeDialogTheme
import io.github.farhanroy.composeawesomedialog.ComposeAwesomeDialog
import io.github.farhanroy.composeawesomedialog.utils.ComposeAwesomeDialogType


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAwesomeDialogTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    val openDialog = remember { mutableStateOf(false)  }

    Button(onClick = { openDialog.value = true }) {
        Text(text = "Open")
    }

    if (openDialog.value) {
        ComposeAwesomeDialog(
            type = ComposeAwesomeDialogType.Success,
            onDismiss = { openDialog.value = false }
        )
    }
}
