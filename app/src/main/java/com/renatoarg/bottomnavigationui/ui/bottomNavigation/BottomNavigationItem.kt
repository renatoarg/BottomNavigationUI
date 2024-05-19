package com.renatoarg.bottomnavigationui.ui.bottomNavigation

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasUpdates: Boolean,
    val badgeCount: Int?
)