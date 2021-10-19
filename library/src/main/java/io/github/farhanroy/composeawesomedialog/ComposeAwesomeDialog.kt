package io.github.farhanroy.composeawesomedialog

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import io.github.farhanroy.composeawesomedialog.components.ErrorDialog
import io.github.farhanroy.composeawesomedialog.components.InfoDialog
import io.github.farhanroy.composeawesomedialog.components.SuccessDialog
import io.github.farhanroy.composeawesomedialog.utils.ComposeAwesomeDialogType

@Composable
fun ComposeAwesomeDialog(
    type: ComposeAwesomeDialogType,
    title: String,
    desc: String,
    onDismiss: () -> Unit
) {
    MaterialTheme {
        when (type) {
            ComposeAwesomeDialogType.Success -> { SuccessDialog(title =  title, desc = desc, onDismiss = onDismiss) }
            ComposeAwesomeDialogType.Error -> { ErrorDialog(title =  title, desc = desc,onDismiss = onDismiss) }
            ComposeAwesomeDialogType.Info -> { InfoDialog (title =  title, desc = desc, onDismiss = onDismiss) }
        }

    }
}
