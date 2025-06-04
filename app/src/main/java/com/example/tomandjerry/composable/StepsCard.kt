package com.example.tomandjerry.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.DarkBlueColor
import com.example.tomandjerry.ui.theme.KitchenFontCardColor
import com.example.tomandjerry.ui.theme.SansArabic

@Composable
fun StepCard(
    stepNumber: String, instruction: String, modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)
                .height(47.dp)
                .background(Color.White, shape = RoundedCornerShape(35)),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                instruction,
                modifier = Modifier.padding(start = 36.dp),
                fontFamily = SansArabic,
                fontSize = 18.sp,
                fontWeight = FontWeight(400),
                letterSpacing = 0.6.sp,
                color = KitchenFontCardColor.copy(0.6f)
            )
        }
        Card(
            shape = CircleShape,
            modifier = Modifier.size(48.dp),
            border = BorderStroke(1.5.dp, Color(0xffD0E5F0)),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFFFFF)
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
            ) {
                Text(
                    stepNumber,
                    fontFamily = SansArabic,
                    fontSize = 16.sp,
                    fontWeight = FontWeight(500),
                    color = DarkBlueColor,
                    letterSpacing = 0.6.sp
                )
            }
        }
    }
}