package com.example.footballstartinglineup.football

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.dp

fun DrawScope.drawArrowUp(
    color: Color = Color.Red,
    strokeWidth: Float = 4.dp.toPx()
) {
    drawLine(
        color = color,
        start = Offset(size.width - 100f, (size.height / 2) + 200f),
        end = Offset(x = size.width - 100f, y = (size.height / 2) - 200f),
        strokeWidth = strokeWidth,
        cap = StrokeCap.Round,
    )

    drawLine(
        color = color,
        start = Offset(x = size.width - 100f, y = (size.height / 2) - 200f),
        end = Offset(x = size.width - 150f, y = (size.height / 2) - 100f),
        strokeWidth = strokeWidth,
        cap = StrokeCap.Round,
    )

    drawLine(
        color = color,
        start = Offset(x = size.width - 100f, y = (size.height / 2) - 200f),
        end = Offset(x = size.width - 50f, y = (size.height / 2) - 100f),
        strokeWidth = strokeWidth,
        cap = StrokeCap.Round,
    )
}
