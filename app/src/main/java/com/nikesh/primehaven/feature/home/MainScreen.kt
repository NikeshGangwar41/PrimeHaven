package com.nikesh.primehaven.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nikesh.primehaven.R
import com.nikesh.primehaven.ui.components.CategoriesRow
import com.nikesh.primehaven.ui.components.HeaderSection
import com.nikesh.primehaven.ui.components.PropertyCard
import com.nikesh.primehaven.ui.components.SearchRow


@Composable
@Preview
fun MainScreen() {
    val items = remember { sampleProperties() }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .background(colorResource(R.color.lightGrey)),
        contentPadding = PaddingValues(bottom = 100.dp)

    ) {
        item { HeaderSection() }
        item {
            Spacer(
                modifier = Modifier.height(16.dp)
            )
        }
        item { SearchRow() }
        item {
            Spacer(
                modifier = Modifier.height(16.dp)
            )
        }
        item { CategoriesRow() }
        items(items.size) {
            PropertyCard(item = items[it])
        }
        item {
            Spacer(
                modifier = Modifier.height(16.dp)
            )
        }
    }
}