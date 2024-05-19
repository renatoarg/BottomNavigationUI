package com.renatoarg.bottomnavigationui.ui.bottomNavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Settings

// Bottom Navigation Items:
val items = listOf(
    BottomNavigationItem(
        title = "Home",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        hasUpdates = false,
        badgeCount = null
    ),
    BottomNavigationItem(
        title = "History",
        selectedIcon = Icons.Filled.List,
        unselectedIcon = Icons.Outlined.List,
        hasUpdates = false,
        badgeCount = 2
    ),
    BottomNavigationItem(
        title = "Settings",
        selectedIcon = Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings,
        hasUpdates = true,
        badgeCount = null
    )
)