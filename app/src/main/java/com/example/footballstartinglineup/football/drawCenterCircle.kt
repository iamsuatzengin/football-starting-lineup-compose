package com.example.footballstartinglineup.football

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

fun DrawScope.drawCenterCircle() {
    drawCircle(
        color = Color.White,
        style = Stroke(width = 4.dp.toPx()),
        radius = size.width / 6f
    )

    drawCircle(
        color = Color.White,
        radius = 8.dp.toPx()
    )
}
