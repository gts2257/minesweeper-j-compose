package com.jayasuryat.minesweeperui.composable.action

import android.util.Log
import androidx.compose.runtime.Stable

@Stable
internal val NoOpActionListener: MinefieldActionsListener
    get() = MinefieldActionsListener { event ->
        Log.d("MinefieldAction", "On action received : $event")
    }
