package com.werlyndev.aiconomic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.werlyndev.aiconomic.navigation.AiconomicNavHost
import com.werlyndev.aiconomic.ui.theme.AiconomicTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AiconomicTheme {
                AiconomicNavHost()
            }
            
        }
    }
}
