package com.example.studyspot

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.studyspot.modules.navbar.BottomNavBar
import com.example.studyspot.modules.navbar.BottomNavItem
import com.example.studyspot.ui.theme.StudySpotTheme
import com.example.studyspot.utilities.navigation.NavigationSetup

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudySpotTheme {
                // A surface container using the 'background' color from the theme )
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationSetup(navController = rememberNavController())

                }
            }
        }
    }
}