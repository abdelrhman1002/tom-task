import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.composable.SpacerVertical
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.SleepingPlaceOption
import com.example.tomandjerry.composable.TomAccountCard
import com.example.tomandjerry.ui.theme.KitchenFontCardColor
import com.example.tomandjerry.ui.theme.PrimaryTextColor
import com.example.tomandjerry.ui.theme.SansArabic
import com.example.tomandjerry.ui.theme.SecondaryTextColor
import com.example.tomandjerry.ui.theme.WhiteColor

@Composable
fun TomAccountScreen() {

    Column {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xffEEF4F6))
        ) {
            Box {
                Box(Modifier.fillMaxWidth()) {
                    Image(
                        painter = painterResource(R.drawable.background_container),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.33f)
                    )
                    Card(
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 26.dp),
                        colors = CardDefaults.cardColors(Color.Transparent)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.profile_icon),
                            contentDescription = null,
                            modifier = Modifier
                                .size(105.dp)
                                .align(Alignment.CenterHorizontally)
                        )
                        Text(
                            "Tom",
                            fontSize = 28.sp,
                            color = Color.White,
                            fontFamily = SansArabic,
                            fontWeight = FontWeight(500),
                            modifier = Modifier
                                .align(
                                    Alignment.CenterHorizontally
                                )
                                .padding(top = 12.dp),
                            lineHeight = 50.sp
                        )
                        Text(
                            "specializes in failure!",
                            fontSize = 16.sp,
                            color = Color.White.copy(0.8f),
                            fontFamily = SansArabic,
                            fontWeight = FontWeight(400),
                            modifier = Modifier
                                .align(
                                    Alignment.CenterHorizontally
                                )
                                .padding(bottom = 8.dp)
                        )

                        Card(
                            colors = CardDefaults.cardColors(Color.White.copy(0.12f)),
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            shape = RoundedCornerShape(55)
                        ) {
                            Text(
                                "Edit foolishness",
                                fontSize = 14.sp,
                                color = Color.White,
                                fontFamily = SansArabic,
                                fontWeight = FontWeight(500),
                                modifier = Modifier
                                    .align(
                                        Alignment.CenterHorizontally
                                    )
                                    .padding(horizontal = 16.dp, vertical = 8.dp)
                            )
                        }
                    }
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.702f)
                    .padding(bottom = 22.dp)
                    .align(Alignment.BottomCenter),
                colors = CardDefaults.cardColors(WhiteColor),
                shape = RoundedCornerShape(
                    topStart = 24.dp, topEnd = 24.dp, bottomStart = 0.dp, bottomEnd = 0.dp
                )
            ) {
                val scrollState = rememberScrollState()

                Column(Modifier.verticalScroll(scrollState)) {
                    Card(
                        modifier = Modifier.padding(
                            start = 20.dp, end = 20.dp, top = 26.dp, bottom = 8.dp
                        ), colors = CardDefaults.cardColors(Color.Transparent)
                    ) {

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            TomAccountCard(
                                mainText = "2M 12K",
                                secondText = "No. of quarrels",
                                image = R.drawable.stat_icon_container,
                                background = Color(0xffD0E5F0),
                                modifier = Modifier.weight(1f)
                            )
                            TomAccountCard(
                                mainText = "+500 h",
                                secondText = "Chase time",
                                image = R.drawable.stat_icon_container2,
                                background = Color(0xffDEEECD),
                                modifier = Modifier.weight(1f)
                            )

                        }
                        SpacerVertical(12)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            TomAccountCard(
                                mainText = "2M 12K",
                                secondText = "Hunting times",
                                image = R.drawable.stat_icon_container3,
                                background = Color(0xffF2D9E7),
                                modifier = Modifier.weight(1f)
                            )
                            TomAccountCard(
                                mainText = "3M 7K",
                                secondText = "Heartbroken",
                                image = R.drawable.stat_icon_container4,
                                background = Color(0xffFAEDCF),
                                modifier = Modifier.weight(1f)
                            )
                        }
                        SpacerVertical(30)
                        Text(
                            "Tom settings",
                            fontWeight = FontWeight(700),
                            fontFamily = SansArabic,
                            fontSize = 26.sp,
                            color = KitchenFontCardColor.copy(.87f)
                        )
                        SleepingPlaceOption("Change sleeping place", R.drawable.bed_single_02)
                        SleepingPlaceOption("Meow settings", R.drawable.cat)
                        SleepingPlaceOption("Password to open the fridge", R.drawable.fridge)

                    }

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp),
                        colors = CardDefaults.cardColors(Color(0x001A1F14).copy(0.07f))
                    ) {

                    }
                    Card(
                        modifier = Modifier.padding(
                            start = 20.dp, end = 20.dp, top = 12.dp, bottom = 8.dp
                        ), colors = CardDefaults.cardColors(Color.Transparent)
                    ) {
                        Text(
                            "His favorite foods",
                            fontWeight = FontWeight(700),
                            fontFamily = SansArabic,
                            fontSize = 26.sp,
                            color = KitchenFontCardColor.copy(.87f)
                        )
                        SleepingPlaceOption("Mouses", R.drawable.alert_01)
                        SleepingPlaceOption("Last stolen meal", R.drawable.hamburger_02)
                        SleepingPlaceOption("Change sleep mood", R.drawable.sleeping)
                        SpacerVertical(24)
                        Text(
                            "v.TomBeta",
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            color = Color(0x99121212).copy(alpha = 0.6f),
                            fontSize = 14.sp,
                            fontFamily = SansArabic,
                            fontWeight = FontWeight(400)
                        )
                    }
                }
            }
        }
    }

}