package com.nikesh.primehaven.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nikesh.primehaven.R


@Composable
fun CategoriesRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        CategoryItem(R.drawable.cat_1, "House", modifier = Modifier.weight(1f))
        CategoryItem(R.drawable.cat_2, "Apartment", modifier = Modifier.weight(1f))
        CategoryItem(R.drawable.cat_3, "Villa", modifier = Modifier.weight(1f))
        CategoryItem(R.drawable.cat_4, "Bangla", modifier = Modifier.weight(1f))
        CategoryItem(R.drawable.cat_5, "Empty Land", modifier = Modifier.weight(1f))


    }
}