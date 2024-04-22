package com.example.footballstartinglineup.football

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.footballstartinglineup.football.player.Player
import com.example.footballstartinglineup.ui.theme.DarkGreen
import com.example.footballstartinglineup.ui.theme.Green

const val FRAME_PADDING = 50f

@Composable
fun FootballTeamStartingLineup(
    modifier: Modifier = Modifier,
    lineup: List<Int> = listOf(4, 2, 3, 1)
) {
    Box(
        modifier = modifier.drawBehind {
            val canvasWidth = size.width
            val canvasHeight = size.height
            val rectHeight = size.height / 10
            val groundFrameWidth = canvasWidth - FRAME_PADDING
            val groundFrameHeight = canvasHeight - FRAME_PADDING
            val strokeWidth = 3.dp.toPx()

            for (i in 0 until 10) {
                val color = if (i % 2 == 0) Green else DarkGreen

                drawRect(
                    color = color,
                    topLeft = Offset(0f, i * rectHeight),
                    size = Size(width = canvasWidth, height = rectHeight)
                )
            }

            drawFootballGroundFrame(
                frameWidth = groundFrameWidth,
                frameHeight = groundFrameHeight,
                strokeWidth = strokeWidth
            )

            drawPenaltyArea(
                groundFramePadding = FRAME_PADDING,
                strokeWidth = strokeWidth
            )

            drawCornerQuarterCircles(strokeWidth = strokeWidth)

            drawArrowUp(strokeWidth = strokeWidth)

            drawCenterCircle()
        }

    ) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            require(lineup.size <= 4) { "Lineup must have at most 4 players" }

            if (lineup.size == 4) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val count = lineup[3]
                    for (i in 0 until count) {
                        Player(number = 9 + i)
                    }
                }
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val count = lineup[2]
                for (i in 0 until count) {
                    Player(number = 17 + i)
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val count = lineup[1]
                for (i in 0 until count) {
                    Player(number = 35 + i)
                }
            }

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val count = lineup[0]
                for (i in 0 until count) {
                    Player(number = 4 + i)
                }
            }

            Player(
                playerName = "GoalKeeper"
            )
        }
    }
}

@Preview
@Composable
private fun FieldFootballPrev() {
    FootballTeamStartingLineup(modifier = Modifier.fillMaxSize())
}
