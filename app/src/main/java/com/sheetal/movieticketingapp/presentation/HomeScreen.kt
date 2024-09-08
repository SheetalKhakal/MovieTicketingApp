package com.sheetal.movieticketingapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sheetal.movieticketingapp.R

@Composable
fun HomeScreen(navController: NavController)
{
    val movieType = listOf(
        "Action","Comedy","Romance","Thriller", "Fantasy"
    )
    val movieCards = listOf(
        R.drawable.eternals_movie_card,
        R.drawable.spiderman_movie_cards,
        R.drawable.matrix_movie_card,
    )

    Column(modifier = Modifier
        .fillMaxSize()
        .background(AppTheme.primaryColor)
        .padding(start = 30.dp, end = 30.dp, bottom = 15.dp),
        verticalArrangement = Arrangement.SpaceEvenly)
    {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 58.dp, start = 20.dp, end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Text(
                text = "All Movies",
                style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.orangeColor),
                modifier = Modifier
                    .clickable { },
            )
            Text(
                text = "For Kids",
                style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white),
                modifier = Modifier
                    .clickable { },
            )
            Box(
                contentAlignment = Alignment.CenterStart
            ) {
                Text(
                    text = "My Tickets",
                    style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white),
                    modifier = Modifier
                        .clickable { },
                    color = Color.White
                )

                // Notification badge as an image on the right corner
                Image(
                    painter = painterResource(id = R.drawable.notification_badge),
                    contentDescription = "Notification Badge",
                    modifier = Modifier
                        .size(12.dp)
                        .align(Alignment.TopEnd)
                )
            }
         }

        Text(
            text = "Coming Soon",
            style = AppTheme.regularTextTheme.displayLarge.copy(color = AppTheme.white),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 23.dp),
        )
        Spacer(modifier = Modifier.size(8.dp))

        Image(
            painter = painterResource(id = R.drawable.featured_card),
            contentDescription = "Featured movie card",
            modifier = Modifier
                .width(330.dp)
                .height(200.dp)
                .align(Alignment.CenterHorizontally)
                .clickable { }
        )
        Spacer(modifier = Modifier.size(25.dp))

        var selectedIndex by remember { mutableStateOf(-1)}

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        )
        {
            items(movieType.size) { index ->
                val defaultBackColor = if (index == selectedIndex) AppTheme.orangeColor else Color.Transparent

                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .padding(start = 4.dp, top = 1.dp, end = 4.dp, bottom = 1.dp)
                            .width(60.dp)
                            .height(22.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .background(color = defaultBackColor)
                            .clickable {
                                selectedIndex = index
                            },
                        contentAlignment = Alignment.Center
                    )
                    {
                        Text(
                            text = movieType[index],
                            textAlign = TextAlign.Center,
                            style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white)
                        )
                    }
                    Spacer(modifier = Modifier.width(17.dp))
                }
            }
        }

        Text(
            text = "Now Showing",
            style = AppTheme.regularTextTheme.displayLarge.copy(color = AppTheme.white),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 28.dp, bottom = 18.dp),
        )

        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items(movieCards.size) { index ->
                var boxWidth by remember { mutableStateOf(147.dp)}
                var boxHeight by remember { mutableStateOf(202.dp)}

                    Box(
                        modifier = Modifier
                            .width(boxWidth)
                            .height(boxHeight)
                            .clip(RoundedCornerShape(10.dp))
                            .background(color = Color.Transparent)
                            .clickable {
                                // On click, update the dimensions
                                boxWidth = 177.dp
                                boxHeight = 242.dp

                                navController.navigate(Screens.DetailScreen.route)
                            },
                        contentAlignment = Alignment.Center )
                    {
                         Image(painter = painterResource(id = movieCards[index]),
                             contentDescription = "Movie Card",
                             contentScale = ContentScale.Crop)
                    }

                    Spacer(modifier = Modifier.width(20.dp))
            }


        }

        Row (modifier = Modifier.fillMaxWidth(),
           horizontalArrangement = Arrangement.Center)
        {
            Text(text = "Spider-Man: No Way Home",
                textAlign = TextAlign.Center,
                style = AppTheme.regularTextTheme.bodyLarge.copy(AppTheme.white),
                modifier = Modifier.padding(top = 18.dp)
            )
        }

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
            horizontalArrangement = Arrangement.Center)
        {
            Box(
                modifier = Modifier
                    .padding(start = 4.dp, top = 1.dp, end = 4.dp, bottom = 1.dp)
                    .width(30.dp)
                    .height(22.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = AppTheme.darkGrey)
                    .clickable { },
                contentAlignment = Alignment.Center
            )
            {
                Text(
                    text = "13+",
                    style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))

            Box(
                modifier = Modifier
                    .padding(start = 4.dp, top = 1.dp, end = 4.dp, bottom = 1.dp)
                    .width(50.dp)
                    .height(22.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = AppTheme.darkGrey)
                    .clickable { },
                contentAlignment = Alignment.Center
            )
            {
                Text(
                    text = "Action",
                    style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))

            Box(
                modifier = Modifier
                    .padding(start = 4.dp, top = 1.dp, end = 4.dp, bottom = 1.dp)
                    .width(41.dp)
                    .height(22.dp)
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = AppTheme.darkGrey)
                    .clickable { },
                contentAlignment = Alignment.Center
            )
            {
                Text(
                    text = "IMAX",
                    style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white)
                )
            }
        }

 }

}

