/*
 * Copyright 2021 Jaya Surya Thotapalli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jayasuryat.uigame.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.Modifier
import com.jayasuryat.minesweeperui.composable.action.MinefieldActionsListener
import com.jayasuryat.minesweeperui.composable.grid.GridLayoutInformation
import com.jayasuryat.minesweeperui.composable.grid.Minefield
import com.jayasuryat.minesweeperui.composable.theme.MinesweeperColors
import com.jayasuryat.minesweeperui.composable.theme.MinesweeperTheme
import com.jayasuryat.util.LogCompositions

@Composable
internal fun MinefieldScreen(
    modifier: Modifier = Modifier,
    layoutInfo: GridLayoutInformation,
    actionListener: MinefieldActionsListener,
) {

    LogCompositions(name = "MinefieldScreen")

    Box(
        modifier = modifier
    ) {

        LogCompositions(name = "MinefieldScreen\$Box")

        AnimatingGradient(
            modifier = Modifier.fillMaxSize()
        )

        MinesweeperTheme(
            colors = getMinefieldColors(),
        ) {

            Minefield(
                modifier = Modifier
                    .fillMaxSize(),
                gridInfo = layoutInfo,
                actionListener = actionListener,
            )
        }
    }
}

@Composable
@ReadOnlyComposable
private fun getMinefieldColors(): MinesweeperColors {

    return MinesweeperColors(
        minefield = MaterialTheme.colors.background,
        text = MaterialTheme.colors.onBackground,
        mine = MaterialTheme.colors.error,
        flagIconTint = MaterialTheme.colors.background,
        mineIconTint = MaterialTheme.colors.onError,
    )
}
