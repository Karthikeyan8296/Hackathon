package com.example.hackathon.ui.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hackathon.R
import com.example.hackathon.ui.components.BottomNavigationBar
import com.example.hackathon.ui.components.CardComponent
import com.example.hackathon.ui.components.DonationComponent
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            TopSectionComponent()
            Spacer(modifier = Modifier.height(24.dp))
            StatusComponent()
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
            ) {
                CardComponent(
                    icon = R.drawable.donation,
                    description = "Total \n Donation",
                    title = "23"
                )
                CardComponent(
                    icon = R.drawable.food,
                    description = "Food Distributed",
                    title = "124"
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Recent Donation",
                    modifier = Modifier.weight(1f),
                    style = TextStyle(fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                )
                Text(
                    text = "See All",
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        color = Color.Gray
                    )
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            DonationComponent()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}