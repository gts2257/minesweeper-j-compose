package com.jayasuryat.minesweeperengine.state

import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import com.jayasuryat.minesweeperengine.model.block.GridSize
import com.jayasuryat.minesweeperengine.model.block.Position
import com.jayasuryat.minesweeperengine.model.cell.RawCell

@Stable
public interface StatefulGrid {

    public val gridSize: GridSize

    public val totalMines : Int

    public val cells: List<List<State<RawCell>>>

    public operator fun get(position: Position): State<RawCell>

    public fun getOrNull(position: Position): State<RawCell>?

    public fun updateCellsWith(
        updatedCells: List<RawCell>,
    )

    public suspend fun updateCellsWith(
        updatedCells: List<RawCell>,
        delayForEachCell: Long,
    )
}