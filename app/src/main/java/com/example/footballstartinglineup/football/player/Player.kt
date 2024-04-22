package com.example.footballstartinglineup.football.player

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Player(
    modifier: Modifier = Modifier,
    number: Int = 24,
    playerName: String = "Player"
) {
    Column(
        modifier = modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .background(Color.LightGray, CircleShape)
                .padding(horizontal = 12.dp, vertical = 10.dp)
        ) {
            Text(text = "$number")
        }

        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = playerName,
            color = Color.White,
            modifier = Modifier
                .background(
                    color = Color.DarkGray,
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(8.dp),
            fontSize = 12.sp
        )
    }
}
