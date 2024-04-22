package com.example.footballstartinglineup.football

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

fun DrawScope.drawCornerQuarterCircles(
    strokeWidth: Float = 4.dp.toPx()
) {

    // Top left corner quarter circle
    drawArc(
        color = Color.White,
        startAngle = 0f,
        sweepAngle = 90f,
        useCenter = true,
        style = Stroke(width = strokeWidth),
        size = Size(width = 100f, height = 100f)
    )

    // Top right corner quarter circle
    drawArc(
        color = Color.White,
        startAngle = 90f,
        sweepAngle = 90f,
        useCenter = true,
        style = Stroke(width = strokeWidth),
        size = Size(width = 100f, height = 100f),
        topLeft = Offset(size.width - 100f, 0f)
    )

    // Bottom left corner quarter circle
    drawArc(
        color = Color.White,
        startAngle = 270f,
        sweepAngle = 90f,
        useCenter = true,
        style = Stroke(width = strokeWidth),
        size = Size(width = 100f, height = 100f),
        topLeft = Offset(0f, size.height - 100f)
    )

    // Bottom right corner quarter circle
    drawArc(
        color = Color.White,
        startAngle = 180f,
        sweepAngle = 90f,
        useCenter = true,
        style = Stroke(width = strokeWidth),
        size = Size(width = 100f, height = 100f),
        topLeft = Offset(size.width - 100f, size.height - 100f)
    )
}
