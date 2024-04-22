package com.example.footballstartinglineup.football

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

enum class Team {
    FENERBAHCE,
    GALATASARAY
}

@Composable
fun FootballTeamStartingLineupUsage(
    modifier: Modifier = Modifier
) {
    val lineup = remember {
        mutableStateOf(
            listOf(4, 2, 3, 1)
        )
    }

    var selectedTeam by remember { mutableStateOf(Team.FENERBAHCE) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF181829))
            .padding(top = 24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            SelectTeamBar(
                teamName = "Fenerbahçe",
                selected = selectedTeam == Team.FENERBAHCE
            ) {
                selectedTeam = Team.FENERBAHCE
                lineup.value = listOf(4, 2, 3, 1)
            }

            SelectTeamBar(
                teamName = "Galatasaray",
                selected = selectedTeam == Team.GALATASARAY
            ) {
                selectedTeam = Team.GALATASARAY
                lineup.value = listOf(4, 3, 3)
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        FootballTeamStartingLineup(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clip(RoundedCornerShape(16.dp)),
            lineup = lineup.value
        )
    }
}

@Composable
fun SelectTeamBar(
    modifier: Modifier = Modifier,
    teamName: String = "Fenerbahçe",
    selected: Boolean = false,
    onTeamSelected: () -> Unit
) {
    val brush = if(selected) Brush.linearGradient(
        listOf(Color(0xFFF4A58A), Color(0xFFED6B4E))
    ) else Brush.linearGradient(
        listOf(Color(0xFF181829), Color(0xFF181829))
    )

    Box(
        modifier = modifier
            .background(
                brush = brush,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 24.dp, vertical = 12.dp)
            .clickable {
                onTeamSelected()
            }
    ) {
        Text(
            text = teamName,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
    }
}