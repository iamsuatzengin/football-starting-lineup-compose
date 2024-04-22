package com.example.footballstartinglineup.football

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

fun DrawScope.drawPenaltyArea(
    groundFramePadding: Float = FRAME_PADDING,
    strokeWidth: Float = 4.dp.toPx()
) {
    val penaltyAreaBigger = Size(width = 400f, height = 200f)
    val penaltyAreaSmaller = Size(width = 200f, height = 100f)

    // Current team penalty area that is displayed on the screen
    drawRect(
        color = Color.White,
        style = Stroke(
            width = strokeWidth,
        ),
        topLeft = Offset((size.width / 2f) - 200, groundFramePadding),
        size = penaltyAreaBigger
    )

    drawRect(
        color = Color.White,
        style = Stroke(width = strokeWidth),
        topLeft = Offset((size.width / 2f) - 100, groundFramePadding),
        size = penaltyAreaSmaller
    )

    // Away team penalty area
    drawRect(
        color = Color.White,
        style = Stroke(width = strokeWidth),
        topLeft = Offset((size.width / 2f) - 200, size.height - 250f),
        size = penaltyAreaBigger
    )

    drawRect(
        color = Color.White,
        style = Stroke(strokeWidth),
        topLeft = Offset((size.width / 2f) - 100, size.height - 150f),
        size = penaltyAreaSmaller
    )
}
