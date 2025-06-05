package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.KitchenFontCardColor
import com.example.tomandjerry.ui.theme.PrimaryTextColor
import com.example.tomandjerry.ui.theme.SansArabic

@Composable
fun TomAccountCard(
    mainText: String,
    secondText: String,
    image: Int,
    background: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(background, shape = RoundedCornerShape(16.dp)),
        contentAlignment = Alignment.Center

    ) {
        Box(
            modifier = Modifier.align(Alignment.CenterStart).padding(start = 12.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(image),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp),
                    alignment = Alignment.TopEnd
                )
                Column(Modifier.padding(start = 12.dp)) {
                    Text(
                        mainText,
                        color = PrimaryTextColor.copy(0.6f),
                        fontWeight = FontWeight(600),
                        fontFamily = SansArabic,
                        fontSize = 20.sp,
                        letterSpacing = 0.6.sp
                    )
                    Text(
                        secondText,
                        color = PrimaryTextColor.copy(0.37f),
                        fontWeight = FontWeight(500),
                        fontFamily = SansArabic,
                        fontSize = 14.sp,
                        letterSpacing = 0.6.sp
                    )
                }


            }
        }
    }
}