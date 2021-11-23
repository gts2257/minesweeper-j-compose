package com.jayasuryat.uigame.composable.topbar

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
internal fun GameOverTopBar(
    modifier: Modifier = Modifier,
    onRestartClicked: () -> Unit,
) {

    Row(
        modifier = modifier
    ) {

        TextChip(
            text = "Game over",
            modifier = Modifier
                .align(alignment = Alignment.CenterVertically),
            contentColor = Color.Red
        )

        Spacer(modifier = Modifier.width(16.dp))

        Icon(
            imageVector = Icons.Filled.Refresh,
            tint = Color.White,
            modifier = Modifier
                .size(38.dp)
                .align(alignment = Alignment.CenterVertically)
                .border(
                    width = 1.dp,
                    color = Color.White,
                    shape = CircleShape,
                )
                .clickable { onRestartClicked() }
                .padding(8.dp),
            contentDescription = null,
        )
    }
}

@Preview
@Composable
private fun Preview() {

    GameOverTopBar(
        modifier = Modifier.wrapContentSize(),
        onRestartClicked = {},
    )
}