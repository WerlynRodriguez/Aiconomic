package com.werlyndev.aiconomic.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.werlyndev.aiconomic.screens.CategoryScreen
import com.werlyndev.aiconomic.screens.WalletScreen

@Composable
fun AiconomicNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = "WalletScreen",
        modifier = modifier,) {
        // Wallet screen
        composable("WalletScreen") {
            WalletScreen(navController)
        }

        // Category screen
        composable("CategoryScreen") {
            CategoryScreen(navController)
        }
    }
}