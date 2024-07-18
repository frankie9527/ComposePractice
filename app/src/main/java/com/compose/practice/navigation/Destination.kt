package com.compose.practice.navigation

/**
 * @author: Frankie
 * @Date: 2024/7/18
 * @Description:
 */
enum class HomeDestination(val route: String, val title: String) {
    ComponentsUse("Components", "Components Use Examples"),
    AnimationsUse("Animations", "Animations Use Examples"),
}

enum class ComponentsDestination(val route: String, val title: String) {
    ButtonUse("button", "button examples"),
    CardUse("card", "card examples"),
    DialogUse("dialog", "dialog examples"),
    ImageUse("image", "image examples"),
    ProgressUse("progress", "progress examples"),
    ScaffoldUse("scaffold", "scaffold examples"),
    TextUse("text", "text examples"),
}