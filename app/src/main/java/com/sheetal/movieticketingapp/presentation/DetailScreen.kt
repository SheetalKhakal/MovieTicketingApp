package com.sheetal.movieticketingapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sheetal.movieticketingapp.R

@Composable
fun DetailScreen(navController: NavController)
{
    var commentText by remember {mutableStateOf("")}

    Column(
        modifier = Modifier
             .fillMaxSize()
            .background(AppTheme.primaryColor),
        verticalArrangement = Arrangement.Top,
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
               // .width(390.dp)
                .height(560.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Transparent)
                .clickable { },
            contentAlignment = Alignment.TopStart
        ) {

            Image(
                painter = painterResource(id = R.drawable.spider),
                contentDescription = "Spiderman movie card",
                modifier = Modifier.fillMaxSize()
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 70.dp, start = 30.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                Image(
                    painter = painterResource(id = R.drawable.back_arrow),
                    contentDescription = "Back button",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable { navController.popBackStack() },
                )
            }

            Column(modifier = Modifier
                .padding(start = 30.dp, end = 30.dp)
                ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 450.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Row {
                        Box(
                            modifier = Modifier
                                .padding(start = 4.dp, top = 1.dp, end = 4.dp, bottom = 1.dp)
                                .width(30.dp)
                                .height(22.dp)
                                .clip(RoundedCornerShape(5.dp))
                                .background(color = AppTheme.darkGrey),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Text(
                                text = "13+",
                                style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white)
                            )
                        }
                        // Spacer(modifier = Modifier.width(10.dp))

                        Box(
                            modifier = Modifier
                                .padding(start = 4.dp, top = 1.dp, end = 4.dp, bottom = 1.dp)
                                .width(50.dp)
                                .height(22.dp)
                                .clip(RoundedCornerShape(5.dp))
                                .background(color = AppTheme.darkGrey),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Text(
                                text = "Action",
                                style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white)
                            )
                        }
                        //    Spacer(modifier = Modifier.width(10.dp))

                        Box(
                            modifier = Modifier
                                .padding(start = 4.dp, top = 1.dp, end = 4.dp, bottom = 1.dp)
                                .width(41.dp)
                                .height(22.dp)
                                .clip(RoundedCornerShape(5.dp))
                                .background(color = AppTheme.darkGrey),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Text(
                                text = "IMAX",
                                style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white)
                            )
                        }

                        //    Spacer(modifier = Modifier.width(10.dp))

                        Box(
                            modifier = Modifier
                                .padding(start = 4.dp, top = 1.dp, end = 4.dp, bottom = 1.dp)
                                .width(67.dp)
                                .height(22.dp)
                                .clip(RoundedCornerShape(5.dp))
                                .background(color = AppTheme.darkGrey)
                                .clickable { },
                            contentAlignment = Alignment.Center
                        )
                        {
                            Text(
                                text = "2 Trailers",
                                style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white)
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .width(80.dp)
                            .height(22.dp)
                            .clip(RoundedCornerShape(5.dp))
                            .background(color = Color.Transparent)
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.clock),
                                contentDescription = "clock",
                                modifier = Modifier.size(12.dp)
                            )


                            Text(
                                text = "2h 13m",modifier = Modifier.padding(start = 4.dp),
                                style = AppTheme.regularTextTheme.bodyMedium.copy(color = AppTheme.white,
                                    fontSize = AppTheme.textSize10)
                            )
                        }

                    }
                }

                Text(text = "Spider-Man: No Way Home",
                    style = AppTheme.mediumTextTheme.headlineMedium.copy(AppTheme.white),
                    modifier = Modifier.padding(top = 20.dp ))
            }

        }

        Column(modifier = Modifier
            .fillMaxHeight()
            .padding(start = 30.dp, end = 30.dp )
            .verticalScroll(rememberScrollState())
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = AppTheme.regularTextTheme.bodySmall.toSpanStyle().copy(color = AppTheme.white,
                            fontSize = AppTheme.textSize11)) {
                            append("With Spider-Man's identity now revealed, our friendly neighborhood web-slinger is unmasked and no longer able to separate his normal life as Peter Parker from the high stakes of being a superhero. When Peter asks for help from Doctor Strange, the stakes become even more dangerous, forcing him to discover what it...")
                        }
                        withStyle(style = AppTheme.regularTextTheme.bodySmall.toSpanStyle().copy(color = AppTheme.orangeColor,
                            fontSize = AppTheme.textSize11)) {
                            append(" More")
                        }
                    },
                    style = TextStyle(
                        lineHeight = 18.sp
                    ),
                )
            }

            Text(text = "10.4K Comments",
                style = AppTheme.regularTextTheme.bodySmall.copy(AppTheme.white),
                modifier = Modifier.padding(top = 30.dp))

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ){
                Box(modifier = Modifier
                    .size(35.dp)
                    .clip(RoundedCornerShape(25.dp))
                    .background(AppTheme.lightGrey),
                    contentAlignment = Alignment.Center
                )
                {
                    Text(text = "KC",
                        style = AppTheme.regularTextTheme.bodySmall.copy(AppTheme.white), )
                }

                Spacer(modifier = Modifier.width(13.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(35.dp)
                        .drawWithContent {
                            // Draw a border at the bottom
                            drawContent()
                            drawLine(
                                color = AppTheme.grey,
                                start = Offset(0f, size.height),
                                end = Offset(size.width, size.height),
                                strokeWidth = 0.5.dp.toPx()
                            )
                        }
                ) {
                    BasicTextField(
                        value = commentText,
                        onValueChange = { it ->
                            commentText = it
                        },
                        keyboardOptions = KeyboardOptions.Default,
                        textStyle = AppTheme.regularTextTheme.bodySmall.copy(AppTheme.grey),
                        modifier = Modifier
                            .background(Color.Transparent)
                            .padding(5.dp),
                        decorationBox = { innerTextField ->
                            Box(
                                contentAlignment = Alignment.CenterStart,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                if (commentText.isEmpty()) {
                                    Text(
                                        text = "Add a comment",
                                        style = AppTheme.regularTextTheme.bodySmall.copy(color = AppTheme.grey, fontSize = AppTheme.textSize11)
                                    )
                                }
                                innerTextField()
                            }
                        },
                    )
                }

            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 30.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ){
                Box(modifier = Modifier
                    .size(35.dp)
                    .clip(RoundedCornerShape(25.dp))
                    .background(AppTheme.lightGrey),
                    contentAlignment = Alignment.Center
                )
                {
                    Text(text = "AG",
                        style = AppTheme.regularTextTheme.bodySmall.copy(AppTheme.white), )
                }

                Spacer(modifier = Modifier.width(13.dp))
                
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween)
                    {
                        Text(text = "Andrew Garfield",
                            style = AppTheme.regularTextTheme.bodySmall.copy(color = AppTheme.white,
                                fontSize = AppTheme.textSize10))

                        Text(text = "2w",
                            modifier = Modifier.padding(start = 10.dp),
                            style = AppTheme.regularTextTheme.bodySmall.copy(color = AppTheme.white,
                                fontSize = AppTheme.textSize10, fontWeight = FontWeight.W300
                            ))

                    }
                    Text(text = "This trailer looks sick! So excited to see this! <3",
                        style = AppTheme.regularTextTheme.bodySmall.copy(color = AppTheme.white,
                            fontSize = AppTheme.textSize11))
                }
            }
        }
    }
}
