package com.example.tomandjerry.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.composable.SpacerHorizontal
import com.example.firstcomposeapp.composable.SpacerVertical
import com.example.tomandjerry.ui.theme.LightBlue


@Composable
fun TomKitchenScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 55.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(LightBlue.copy(0.4f))
                .height(450.dp),
        ) {
            Image(
                painter = painterResource(com.example.tomandjerry.R.drawable.tom_kitchen),
                contentDescription = "Tom in the kitchen",
                modifier = Modifier.fillMaxSize(),
                alignment = Alignment.BottomStart,
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(18.dp, top = 60.dp)
            ) {
                Row {
                    Icon(
                        painter = painterResource(com.example.tomandjerry.R.drawable.meal_background_icon),
                        tint = Color.White,
                        contentDescription = "",
                        modifier = Modifier.size(26.dp)
                    )
                    SpacerHorizontal(12)
                    Text(
                        text = "High tension",
                        modifier = Modifier.align(Alignment.CenterVertically),
                        color = Color.White,
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp
                    )

                }
                SpacerVertical(26)
                Row {
                    Icon(
                        painter = painterResource(com.example.tomandjerry.R.drawable.chef_meal_icon),
                        tint = Color.White,
                        contentDescription = "",
                        modifier = Modifier.size(26.dp)
                    )
                    SpacerHorizontal(12)
                    Text(
                        text = "Shocking foods",
                        modifier = Modifier.align(Alignment.CenterVertically),
                        color = Color.White,
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp
                    )

                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(16.dp))
                .offset(y = (-200).dp),
            )
    }
}