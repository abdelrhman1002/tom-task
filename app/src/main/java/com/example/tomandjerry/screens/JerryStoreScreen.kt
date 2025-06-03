package com.example.tomandjerry.screens

import InformationCard
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.composable.SpacerHorizontal
import com.example.firstcomposeapp.composable.SpacerVertical
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.CustomSearchBar
import com.example.tomandjerry.composable.InformationCardDataEntity
import com.example.tomandjerry.ui.theme.Blue
import com.example.tomandjerry.ui.theme.CardColor
import com.example.tomandjerry.ui.theme.DarkBlueColor
import com.example.tomandjerry.ui.theme.PrimaryTextColor
import com.example.tomandjerry.ui.theme.SansArabic
import com.example.tomandjerry.ui.theme.SecondaryTextColor

@Composable
fun JerryStoreScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffEEF4F6))
            .padding(horizontal = 16.dp, vertical = 55.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.jerry),
                    contentDescription = "Jerry Image",
                    modifier = Modifier
                        .size(54.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
                Card(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .weight(1f),
                    colors = CardDefaults.outlinedCardColors(containerColor = Color.Transparent)
                ) {
                    Text(
                        "Hi, Jerry 👋🏻",
                        fontWeight = FontWeight.W500,
                        fontFamily = SansArabic,
                        fontSize = 14.sp,
                        color = PrimaryTextColor,
                    )
                    Text(
                        text = "Which Tom do you want to buy?",
                        fontSize = 12.sp,
                        color = SecondaryTextColor,
                        fontFamily = SansArabic,
                        fontWeight = FontWeight.W400
                    )
                }
                Box(contentAlignment = Alignment.TopEnd, modifier = Modifier.size(50.dp)) {
                    Card(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(16.dp))
                            .border(
                                1.5.dp, Color.Gray.copy(alpha = 0.2f), RoundedCornerShape(16.dp)
                            ), colors = CardDefaults.cardColors(Color.White)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.notification_icon),
                            contentDescription = "Notification Icon",
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(11.dp)
                        )
                    }

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .offset(x = 6.dp, y = (-6).dp)
                            .size(22.dp)
                            .clip(CircleShape)
                            .background(DarkBlueColor)
                    ) {
                        Text(
                            text = "3",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            SpacerVertical(12)

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                CustomSearchBar(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(R.drawable.setting_icon),
                    contentDescription = "",
                    modifier = Modifier.size(55.dp)
                )
            }

            SpacerVertical(24)

            Box(
                modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(CardColor, Blue),
                            )
                        )
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "Buy 1 Tom and get 2 for free",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W600,
                            fontFamily = SansArabic
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Adopt Tom! (Free Fail-Free)",
                            color = Color.White,
                            fontFamily = SansArabic,
                            fontSize = 12.sp,
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Guarantee)",
                            color = Color.White,
                            fontSize = 12.sp,
                            fontFamily = SansArabic
                        )
                    }
                }
                Image(
                    painter = painterResource(R.drawable.ellipse1),
                    contentDescription = "",
                    modifier = Modifier
                        .size(150.dp)
                        .offset(x = 40.dp)
                        .graphicsLayer(rotationZ = 15f)
                )
                Image(
                    painter = painterResource(R.drawable.ellipse2),
                    contentDescription = "",
                    modifier = Modifier
                        .size(150.dp)
                        .offset(x = 45.dp)
                        .graphicsLayer(rotationZ = 15f)
                )
                Image(
                    painter = painterResource(R.drawable.tom),
                    contentDescription = "Tom the cat character",
                    modifier = Modifier
                        .size(120.dp)
                        .offset(y = (-4).dp)
                        .clip(RoundedCornerShape(12.dp))
                        .scale(1.8f)
                        .padding(top = 14.dp)
                )
            }

            SpacerVertical(24)

            Row(
                modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Cheap tom section",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W600,
                    fontFamily = SansArabic,
                )
                Row {
                    Text(
                        text = "View all",
                        fontSize = 12.sp,
                        fontFamily = SansArabic,
                        fontWeight = FontWeight.W500,
                        color = DarkBlueColor,
                    )
                    SpacerHorizontal(4)
                    Icon(
                        painter = painterResource(id = R.drawable.icon2),
                        contentDescription = "View all",
                        tint = DarkBlueColor,
                        modifier = Modifier
                            .size(12.dp)
                            .offset(y = 2.dp)
                    )
                }
            }

            SpacerVertical(12)
        }

        items(dataCard.chunked(2)) { rowItems ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.5.dp),
            ) {
                rowItems.forEach { item ->
                    InformationCard(
                        modifier = Modifier.weight(1f), cardData = item
                    )
                }
            }
        }
    }
}

val dataCard = listOf(
    InformationCardDataEntity(
        cardName = "Sport Tom",
        cheesesCount = "3",
        oldCount = "5",
        cardDescription = "He runs 1 meter... trips over his boot",
        imageResId = R.drawable.image_card_photo1,
    ),
    InformationCardDataEntity(
        cardName = "Chef Jerry",
        cheesesCount = "5",
        oldCount = "",
        cardDescription = "He loves one-sidedly... and is beaten by the other side.",
        imageResId = R.drawable.image_card_photo2,
    ),
    InformationCardDataEntity(
        cardName = "Tom the bomb",
        cheesesCount = "10",
        oldCount = "",
        cardDescription = "He blows himself up before Jerry can catch him.",
        imageResId = R.drawable.image_card_photo3,
    ),
    InformationCardDataEntity(
        cardName = "Spy Tom",
        cheesesCount = "12",
        oldCount = "",
        cardDescription = "Disguises itself as a table",
        imageResId = R.drawable.image_card_photo4,
    ),
    InformationCardDataEntity(
        cardName = "Frozen Tom",
        cheesesCount = "10",
        oldCount = "",
        cardDescription = "He was chasing Jerry, he froze after the first look",
        imageResId = R.drawable.image_card_photo5,
    ),
    InformationCardDataEntity(
        cardName = "Sleeping Tom",
        cheesesCount = "10",
        oldCount = "",
        cardDescription = "He doesn't chase anyone, he just snores in stereo.",
        imageResId = R.drawable.image_card_photo6,
    ),
)