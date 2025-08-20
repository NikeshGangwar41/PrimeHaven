package com.nikesh.primehaven.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nikesh.primehaven.R
import com.nikesh.primehaven.core.model.Property
import com.nikesh.primehaven.util.getDrawableId

@Composable
fun PropertyCard(item: Property) {
    val white = colorResource(R.color.white)
    val blue = colorResource(R.color.blue)
    val black = colorResource(R.color.black)
    val grey = colorResource(R.color.grey)

    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .height(320.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(30.dp))
            .background(white)
    ) {
        Box {
            Image(
                painter = painterResource(getDrawableId(item.pickPath)),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(white)
                    .height(233.dp)
                    .padding(12.dp)
                    .clip(RoundedCornerShape(30.dp)),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "$${item.price}",
                color = white,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(start = 28.dp, bottom = 28.dp)
                    .align(Alignment.BottomStart)
                    .clip(RoundedCornerShape(5.dp))
                    .background(blue)
                    .padding(horizontal = 16.dp, vertical = 6.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = item.type,
                color = black,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = item.address,
                color = grey,
                fontSize = 13.sp,
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MetaClip(
                    icon = R.drawable.bed,
                    title = "${item.bed} Bed"
                )
                MetaClip(
                    icon = R.drawable.bath,
                    title = "${item.bath} Bath"
                )
                MetaClip(
                    icon = R.drawable.garage,
                    title = if (item.isGarage) "Garage" else "No Garage"
                )
                MetaClip(
                    icon = R.drawable.size,
                    title = "${item.size} Sqft"
                )
            }
        }
    }
}

@Preview
@Composable
fun PropertyCardPreview() {
    PropertyCard(
        item = Property(
            type = "House",
            title = "House with Great View",
            address = "Newyork NY",
            pickPath = "pic_1",
            price = 800,
            bed = 1,
            bath = 2,
            size = 500,
            isGarage = false,
            score = 4.9,
            description = "This 2 bed /1 bath home boasts an enormous, open-living plan..."
        )
    )
}
