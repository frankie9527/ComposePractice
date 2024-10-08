package com.compose.practice.navigation

/**
 * @author: Frankie
 * @Date: 2024/7/18
 * @Description:
 */
enum class HomeDestination(val route: String, val title: String) {
    AnimationsUse("Animations", "Animations Use Examples"),
    ComponentsUse("Components", "Components Use Examples"),
    ViewContainersUse("ViewContainersScreen", "ViewContainers Use Examples"),

}

enum class ComponentsDestination(val route: String, val title: String) {
    AndroidViewUse("android view", "android view examples"),
    BottomSheetUse("bottom sheet", "bottom sheet examples"),
    ButtonUse("button", "button examples"),
    CardUse("card", "card examples"),
    DialogUse("dialog", "dialog examples"),
    ImageUse("image", "image examples"),
    NavigationDrawerUse("navigation drawer", "navigation drawer examples"),
    ProgressUse("progress", "progress examples"),
    ScaffoldUse("scaffold", "scaffold examples"),
    TextUse("text", "text examples")
}
enum class ViewContainersDestination(val route: String, val title: String) {
    BoxUse("box", "box examples"),
    ColumnUse("column", "column examples"),
    ConstraintUse("constraint", "constraint examples"),
    FlowUse("flow", "flow examples"),
    PagerUse("pager", "pager examples"),
    RowUse("row", "row examples"),
    TabRowUse("tab row", "tab row examples"),
    TopBarUse("top bar", "top bar examples"),
}