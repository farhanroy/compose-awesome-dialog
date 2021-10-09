package io.github.farhanroy.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
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
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
 ComposeAwesomeDialog(type = ComposeAwesomeDialogType.Info)
}
