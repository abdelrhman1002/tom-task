package com.example.tomandjerry.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.composable.SpacerHorizontal
import com.example.firstcomposeapp.composable.SpacerVertical
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.StepCard
import com.example.tomandjerry.composable.TemperatureCard
import com.example.tomandjerry.ui.theme.Blue
import com.example.tomandjerry.ui.theme.DarkBlueColor
import com.example.tomandjerry.ui.theme.KitchenFontCardColor
import com.example.tomandjerry.ui.theme.KitchenPhotoCardColor
import com.example.tomandjerry.ui.theme.LightBlue
import com.example.tomandjerry.ui.theme.SansArabic
import com.example.tomandjerry.ui.theme.WhiteColor


@Composable
fun TomKitchenScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .background(LightBlue.copy(0.5f))
                .fillMaxSize()
                .background(Color.Transparent)
                .align(Alignment.TopCenter)

        ) {
            Image(
                painter = painterResource(R.drawable.ellipse_3),
                contentDescription = "Tom in the kitchen",
                modifier = Modifier
                    .fillMaxWidth(0.49f)
                    .fillMaxHeight(0.38f),
                contentScale = ContentScale.Crop,
            )

            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 14.dp, top = 54.dp)
            ) {
                Row {
                    Icon(
                        painter = painterResource(R.drawable.meal_background_icon),
                        tint = Color.White.copy(0.87f),
                        contentDescription = "",
                        modifier = Modifier.size(26.dp)
                    )
                    SpacerHorizontal(12)
                    Text(
                        text = "High tension",
                        modifier = Modifier.align(Alignment.CenterVertically),
                        color = Color.White.copy(0.87f),
                        fontWeight = FontWeight(500),
                        fontSize = 20.sp,
                        letterSpacing = 0.6.sp

                    )
                }
                SpacerVertical(20)
                Row {
                    Icon(
                        painter = painterResource(R.drawable.chef_meal_icon),
                        tint = Color.White.copy(0.87f),
                        contentDescription = "",
                        modifier = Modifier.size(26.dp)
                    )
                    SpacerHorizontal(12)
                    Text(
                        text = "Shocking foods",
                        modifier = Modifier.align(Alignment.CenterVertically),
                        color = Color.White.copy(0.87f),
                        fontWeight = FontWeight(500),
                        fontSize = 20.sp,
                        letterSpacing = 0.6.sp
                    )
                }
            }

        }
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.78f)
                .background(color = WhiteColor, shape = RoundedCornerShape(16.dp))
                .align(Alignment.BottomCenter)
                .verticalScroll(scrollState).padding(horizontal = 4.dp)
        ) {

            Column(
                Modifier
                    .fillMaxSize()
                    .padding(top = 50.dp, start = 16.dp, end = 16.dp, bottom = 120.dp),
            ) {
                Text(
                    text = "Electric Tom pasta",
                    fontSize = 24.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xDE1F1F1E),
                    fontFamily = SansArabic,
                    letterSpacing = 0.3.sp
                )
                Icon(
                    painter = painterResource(R.drawable.heart),
                    contentDescription = null,
                    tint = DarkBlueColor.copy(0.85f),
                    modifier = Modifier
                        .width(29.6.dp)
                        .height(26.dp)
                        .align(Alignment.End)
                )

                Card(
                    colors = CardDefaults.outlinedCardColors(containerColor = Blue.copy(0.12f)),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.padding(bottom = 10.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(vertical = 7.dp, horizontal = 10.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.icon),
                            contentDescription = "",
                            tint = DarkBlueColor,
                            modifier = Modifier
                                .size(22.dp)
                                .padding(end = 6.dp)
                        )
                        Text(
                            "5 cheeses",
                            color = DarkBlueColor,
                            fontSize = 14.sp,
                            fontFamily = SansArabic,
                            fontWeight = FontWeight(500)
                        )
                    }
                }
                Text(
                    text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                    color = KitchenFontCardColor,
                    letterSpacing = 0.5.sp,
                    fontFamily = SansArabic,
                    fontSize = 17.sp,
                    fontWeight = FontWeight(500),
                    modifier = Modifier.padding(bottom = 30.dp)
                )
                Text(
                    "Details",
                    fontSize = 24.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xDE1F1F1E),
                    fontFamily = SansArabic,
                    letterSpacing = 0.5.sp
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 14.dp)
                ) {
                    TemperatureCard(
                        "1000 V",
                        "Temperature",
                        R.drawable.temperature_icon,
                        modifier = Modifier.weight(1f)
                    )
                    SpacerHorizontal(10)
                    TemperatureCard(
                        "3 sparks",
                        "Time",
                        R.drawable.time_icon,
                        iconColor = KitchenPhotoCardColor,
                        horizontalPadding = 30f,
                        modifier = Modifier.weight(1f)
                    )
                    SpacerHorizontal(10)

                    TemperatureCard(
                        "1M 12K",
                        "No. of deaths",
                        R.drawable.devil_icon,
                        iconColor = KitchenPhotoCardColor,
                        modifier = Modifier.weight(1f),
                        horizontalPadding = 18f
                    )

                }
                Text(
                    "Preparation method",
                    fontSize = 24.sp,
                    fontWeight = FontWeight(500),
                    letterSpacing = 0.6.sp,
                    fontFamily = SansArabic,
                    modifier = Modifier.padding(vertical = 16.dp)
                )
                StepCard(
                    stepNumber = "1", instruction = "Put the pasta in a toaster."
                )
                SpacerVertical(11)
                StepCard(
                    stepNumber = "2", instruction = "Pour battery juice over it."
                )
                SpacerVertical(11)

                StepCard(
                    stepNumber = "3", instruction = "Wait for the spark to ignite."
                )
                SpacerVertical(11)
                StepCard(
                    stepNumber = "4", instruction = "Serve with an insulating glove."
                )
            }
        }

        Image(
            painter = painterResource(R.drawable.spaghetti),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .fillMaxWidth(0.6f)
                .padding(top = 16.dp, end = 28.dp)
        )

        Box(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.13f)
                .background(Color.White)
                .align(Alignment.BottomEnd),

            ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp, horizontal = 20.dp),
                shape = RoundedCornerShape(30),
                colors = CardDefaults.cardColors(KitchenPhotoCardColor),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp, horizontal = 90.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Add to cart",
                        fontFamily = SansArabic,
                        fontWeight = FontWeight(500),
                        fontSize = 20.sp,
                        color = Color.White.copy(0.87f),
                        letterSpacing = 0.6.sp,
                        modifier = Modifier.padding(end = 6.dp)
                    )
                    Icon(
                        painter = painterResource(R.drawable.ellipse_4),
                        contentDescription = null,
                        tint = Color.White.copy(1f),
                        modifier = Modifier.size(7.dp),
                    )
                    Column(modifier = Modifier.padding(start = 8.dp)) {
                        Text(
                            "3 cheeses",
                            color = Color.White,
                            letterSpacing = 0.6.sp,
                            fontWeight = FontWeight(500),
                            fontFamily = SansArabic,
                            fontSize = 16.sp
                        )
                        Text(
                            "5 cheeses",
                            color = Color.White.copy(0.8f),
                            letterSpacing = 0.6.sp,
                            fontWeight = FontWeight(500),
                            fontFamily = SansArabic,
                            fontSize = 14.sp,
                            textDecoration = TextDecoration.LineThrough,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    }
                }
            }

        }
    }
}