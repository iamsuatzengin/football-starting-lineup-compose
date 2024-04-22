package com.example.footballstartinglineup.football

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

fun DrawScope.drawFootballGroundFrame(
    frameWidth: Float,
    frameHeight: Float,
    padding: Float = FRAME_PADDING,
    strokeWidth: Float = 4.dp.toPx()
) {
    val canvasHeight = size.height

    val path = Path().apply {
        moveTo(padding, padding)
        lineTo(frameWidth, padding)
        lineTo(frameWidth, frameHeight)

        lineTo(padding, frameHeight)
        close()

        moveTo(padding, canvasHeight / 2f)

        lineTo(frameWidth, canvasHeight / 2f)
    }

    drawPath(
        path = path,
        color = Color.White,
        style = Stroke(width = strokeWidth)
    )
}
