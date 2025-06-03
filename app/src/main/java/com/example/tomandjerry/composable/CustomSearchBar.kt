package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.composable.SpacerHorizontal
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.SansArabic
import com.example.tomandjerry.ui.theme.SecondaryTextColor

@Composable
fun CustomSearchBar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .padding( end = 8.dp)
            .height(55.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.White).fillMaxWidth(),
        contentAlignment = Alignment.CenterStart
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 12.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.search_icon),
                contentDescription = "Search Icon",
                tint = SecondaryTextColor,
                modifier = Modifier.size(30.dp)
            )
            SpacerHorizontal(8)
            Text(
                text = "Search about tom ...",
                color = SecondaryTextColor,
                fontSize = 14.sp,
                fontFamily = SansArabic,
                fontWeight = FontWeight.W400
            )
        }
    }
}