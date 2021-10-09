package io.github.farhanroy.composeawesomedialog

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.farhanroy.composeawesomedialog.components.ErrorDialog
import io.github.farhanroy.composeawesomedialog.components.InfoDialog
import io.github.farhanroy.composeawesomedialog.components.SuccessDialog
import io.github.farhanroy.composeawesomedialog.utils.ComposeAwesomeDialogType

@Composable
fun ComposeAwesomeDialog(
    type: ComposeAwesomeDialogType
) {
    MaterialTheme {
        Column {
            val openDialog = remember { mutableStateOf(false)  }

            Button(onClick = {
                openDialog.value = true
            }) {
                Text("Click me")
            }

            if (openDialog.value) {
                when (type) {
                    ComposeAwesomeDialogType.Success -> { SuccessDialog() }
                    ComposeAwesomeDialogType.Error -> { ErrorDialog() }
                    ComposeAwesomeDialogType.Info -> { InfoDialog() }
                }
            }
        }

    }
}
