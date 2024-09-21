package com.example.hackathon.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hackathon.R
import com.example.hackathon.ui.theme.Status

@Composable
fun DonationComponent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .background(color = Status)
            .height(101.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 12.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.spark),
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
            Spacer(modifier = modifier.width(8.dp))
            Text(text = "Food Donation 1", style = TextStyle(fontWeight = FontWeight.SemiBold))
        }
        Spacer(modifier = modifier.height(8.dp))
        Text(text = "Status : Pending Pickup",
            modifier = Modifier.padding(start = 12.dp))

    }

}

@Preview
@Composable
private fun DonationComponentPreview() {
    DonationComponent()
}