package com.example.studyspot.modules.Map_Screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.studyspot.ui.theme.StudySpotTheme

@Composable
fun RatingStarExample() {
    var userRating by remember { mutableStateOf(0f) }

    Column{
        // Rating Bar
        RatingBar(
            rating = userRating,
            onRatingChanged = { newRating ->
                userRating = newRating
            }
        )

    }
}

@Composable
fun RatingBar(
    rating: Float,
    onRatingChanged: (Float) -> Unit
) {
    Row{
        for (i in 1..5) {
            val filled = i <= rating
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = null,
                modifier = Modifier
                    .size(10.dp)
                    .clickable {
                        onRatingChanged(i.toFloat())
                    },
                tint = if (filled) Color.Yellow else Color.Gray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StudySpotTheme {
        RatingStarExample()
    }
}