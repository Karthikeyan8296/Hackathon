package com.example.hackathon.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hackathon.ui.components.BottomNavigationBar
import com.example.hackathon.ui.components.CardComponent
import com.example.hackathon.ui.components.StatusComponent
import com.example.hackathon.ui.components.TopSectionComponent
import com.example.hackathon.ui.theme.Status

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = {
            BottomNavigationBar()
        }
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {
            Spacer(modifier = Modifier.height(24.dp))
            TopSectionComponent()
            Spacer(modifier = Modifier.height(24.dp))
            StatusComponent()
            Spacer(modifier = Modifier.height(16.dp))
            Row() {
                CardComponent()
                CardComponent()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}