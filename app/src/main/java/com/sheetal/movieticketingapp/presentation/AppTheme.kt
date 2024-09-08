package com.sheetal.movieticketingapp.presentation

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sheetal.movieticketingapp.R


object AppTheme {

    // Colors
    val primaryColor = Color(0xFF1E1F27)
    val orangeColor = Color(0xFFD98639)
    val white = Color(0xFFFFFFFF)
    val darkGrey = Color(0xFF484747)
    val lightGrey = Color(0xFFC4C4C4)
    val grey = Color(0xFF8F8F8F)

    // Poppins Font
    val poppinsFont = FontFamily(
        Font(R.font.poppins_regular),
        Font(R.font.poppins_medium, FontWeight.W500),
        Font(R.font.poppins_semibold, FontWeight.W600),
        Font(R.font.poppins_bold, FontWeight.Bold)
    )

    // Text
    val defaultTextFont = poppinsFont
    val textSize28 = 28.sp
    val textSize22 = 22.sp
    val textSize18 = 18.sp
    val textSize16 = 16.sp
    val textSize14 = 14.sp
    val textSize12 = 12.sp
    val textSize11 = 11.sp
    val textSize10 = 10.sp

    // Text Themes
    val largeTextTheme = Typography(
        headlineLarge = TextStyle(
            fontFamily = defaultTextFont,
            fontWeight = FontWeight.W600,
            fontSize = textSize28
        ),

    )

    val mediumTextTheme = Typography(
        headlineMedium = TextStyle(
            fontFamily = defaultTextFont,
            fontWeight = FontWeight.W500,
            fontSize = textSize18
        )
    )
    val regularTextTheme = Typography(
        displayLarge = TextStyle(
            fontFamily = defaultTextFont,
            fontWeight = FontWeight.W400,
            fontSize = textSize22
        ),
        bodyLarge = TextStyle(
            fontFamily = defaultTextFont,
            fontWeight = FontWeight.W400,
            fontSize = textSize16
        ),
        bodyMedium = TextStyle(
            fontFamily = defaultTextFont,
            fontWeight = FontWeight.W400,
            fontSize = textSize14
        ),
        bodySmall = TextStyle(
            fontFamily = defaultTextFont,
            fontWeight = FontWeight.W400,
            fontSize = textSize12
        )
    )

}