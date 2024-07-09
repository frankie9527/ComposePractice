package com.compose.practice

/**
 * @author: Frankie
 * @Date: 2024/7/9
 * @Description:
 */
data class Data(val route: String,val text: String)
class  UiData{
    companion object{
        val componentData= listOf(
            Data("button","Use Button"),
            Data("card","Use Card"),
            Data("dialog","Use Dialog"),
            Data("image","Use Image"),
            Data("progress","Progress indicators"),
            Data("scaffold","Use Scaffold"),
            Data("text","Use Text"),)
    }
}