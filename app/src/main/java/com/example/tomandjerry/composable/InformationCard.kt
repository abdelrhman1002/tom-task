import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcomposeapp.composable.SpacerHorizontal
import com.example.firstcomposeapp.composable.SpacerVertical
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.InformationCardDataEntity
import com.example.tomandjerry.ui.theme.Blue
import com.example.tomandjerry.ui.theme.DarkBlueColor
import com.example.tomandjerry.ui.theme.PrimaryTextColor
import com.example.tomandjerry.ui.theme.SansArabic
import com.example.tomandjerry.ui.theme.SecondaryTextColor

@Composable
fun InformationCard(
    modifier: Modifier = Modifier, cardData: InformationCardDataEntity
) {
    Box(
        modifier = modifier
            .padding(8.dp)
            .height(275.dp)
            .background(Color.White, shape = RoundedCornerShape(20.dp)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 5.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(cardData.imageResId),
                contentDescription = "",
                modifier = Modifier
                    .size(140.dp)
                    .offset(y = (-15).dp)
            )

            Text(
                text = cardData.cardName,
                fontSize = 18.sp,
                fontWeight = FontWeight.W600,
                textAlign = TextAlign.Start,
                color = PrimaryTextColor,
                fontFamily = SansArabic
            )

            SpacerVertical(6)

            Text(
                text = cardData.cardDescription,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                color = SecondaryTextColor,
                modifier = Modifier.padding(horizontal = 14.dp),
                fontFamily = SansArabic,
                fontWeight = FontWeight.W400,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis

            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp , horizontal = 10.dp)
                .align(Alignment.BottomCenter), verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .weight(3.5f)
                    .background(Blue.copy(alpha = 0.05f))
                    .height(35.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    SpacerHorizontal(8)
                    Icon(
                        painter = painterResource(R.drawable.icon),
                        contentDescription = "",
                        tint = DarkBlueColor,
                    )
                    SpacerHorizontal(8)
                    if (cardData.oldCount.isNotEmpty()) {
                        Text(
                            text = cardData.oldCount,
                            fontSize = 14.sp,
                            color = DarkBlueColor,
                            textDecoration = TextDecoration.LineThrough,
                            fontWeight = FontWeight.W500,
                            fontFamily = SansArabic,
                        )

                        SpacerHorizontal(2)

                        Text(
                            text = cardData.cheesesCount,
                            fontSize = 14.sp,
                            color = DarkBlueColor,
                            fontWeight = FontWeight.W500,
                            fontFamily = SansArabic,
                        )
                    }
                        else {
                        Text(
                            text = cardData.cheesesCount,
                            fontSize = 14.sp,
                            color = DarkBlueColor,
                            fontWeight = FontWeight.W500,
                            fontFamily = SansArabic,
                        )
                    }

                    Text(
                        "cheeses",
                        color = DarkBlueColor,
                        fontWeight = FontWeight.W500,
                        fontFamily = SansArabic,
                        modifier = modifier.padding(start = 6.dp)
                    )

                }

            }

            SpacerHorizontal(8)

            Icon(
                painter = painterResource(R.drawable.add_to_cart_container),
                contentDescription = "",
                tint = DarkBlueColor,
                modifier = Modifier
                    .size(35.dp)
                    .weight(1.25f)
            )
        }
    }
}