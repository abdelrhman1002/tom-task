package com.example.tomandjerry.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.tomandjerry.ui.theme.Blue
import com.example.tomandjerry.ui.theme.DarkBlueColor
import com.example.tomandjerry.ui.theme.KitchenFontCardColor
import com.example.tomandjerry.ui.theme.SansArabic

@Composable
fun TemperatureCard(
    mainText: String,
    secondText: String,
    iconResId: Int,
    modifier: Modifier = Modifier,
    iconColor: Color = DarkBlueColor,
    horizontalPadding : Float = 20.0f

) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Blue.copy(0.15f)),
        shape = RoundedCornerShape(16.dp),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.padding(horizontal = horizontalPadding.dp, vertical = 20.dp)
        ) {
            Icon(
                painter = painterResource(id = iconResId),
                contentDescription = null,
                tint = iconColor,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(35.dp)
            )
            Text(
                text = mainText,
                fontSize = 16.sp,
                letterSpacing = 0.6.sp,
                color = KitchenFontCardColor,
                fontFamily = SansArabic,
                fontWeight = FontWeight.W500,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 14.dp, bottom = 4.dp)
            )
            Text(
                text = secondText,
                fontSize = 14.sp,
                letterSpacing = 0.6.sp,
                color = KitchenFontCardColor.copy(0.4f),
                fontFamily = SansArabic,
                fontWeight = FontWeight.W500,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}