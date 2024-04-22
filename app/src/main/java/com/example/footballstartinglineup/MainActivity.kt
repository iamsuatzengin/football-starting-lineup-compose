package com.example.footballstartinglineup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.footballstartinglineup.football.FootballTeamStartingLineupUsage
import com.example.footballstartinglineup.ui.theme.FootballStartingLineupTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            FootballStartingLineupTheme {
                App()
            }
        }
    }
}

@Composable
private fun App() {
    Column(
        modifier = Modifier.background(Color(0xFF181829))
    ) {

        FootballTeamStartingLineupUsage(
            modifier = Modifier.systemBarsPadding()
        )
    }
}
