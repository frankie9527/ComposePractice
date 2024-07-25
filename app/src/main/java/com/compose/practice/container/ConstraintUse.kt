package com.compose.practice.container

import androidx.compose.foundation.layout.BoxWithConstraints

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.layoutId

/**
 * @author: Frankie
 * @Date: 2024/7/25
 * @Description:
 */
@Preview
@Composable
fun ConstraintUse() {
    Demo1()
}


@Composable
fun Demo1() {
    ConstraintLayout {
        // Create references for the composables to constrain
        val (button, text) = createRefs()

        Button(
            onClick = { /* Do something */ },
            // Assign reference "button" to the Button composable
            // and constrain it to the top of the ConstraintLayout
            modifier = Modifier.constrainAs(button) {
                top.linkTo(parent.top, margin = 16.dp)
            }
        ) {
            Text("Button")
        }

        // Assign reference "text" to the Text composable
        // and constrain it to the bottom of the Button composable
        Text(
            "Text",
            Modifier.constrainAs(text) {
                top.linkTo(button.bottom, margin = 16.dp)
            }
        )
    }
}


@Composable
fun Demo2() {
    BoxWithConstraints {
        val constraints = if (minWidth < 600.dp) {
            decoupledConstraints(margin = 16.dp) // Portrait constraints
        } else {
            decoupledConstraints(margin = 32.dp) // Landscape constraints
        }

        ConstraintLayout(constraints) {
            Button(
                onClick = { /* Do something */ },
                modifier = Modifier.layoutId("button")
            ) {
                Text("Button")
            }

            Text("Text", Modifier.layoutId("text"))
        }
    }
}


@Composable
fun Demo3() {
    ConstraintLayout {
        // Create guideline from the start of the parent at 10% the width of the Composable
        val startGuideline = createGuidelineFromStart(0.1f)
        // Create guideline from the end of the parent at 10% the width of the Composable
        val endGuideline = createGuidelineFromEnd(0.1f)
        //  Create guideline from 16 dp from the top of the parent
        val topGuideline = createGuidelineFromTop(16.dp)
        //  Create guideline from 16 dp from the bottom of the parent
        val bottomGuideline = createGuidelineFromBottom(16.dp)
    }
}


@Composable
fun Demo4() {
    ConstraintLayout {
        val constraintSet = ConstraintSet {
            val button = createRefFor("button")
            val text = createRefFor("text")

            val topBarrier = createTopBarrier(button, text)
        }
    }
}


@Composable
fun Demo5() {
    ConstraintLayout {
        val constraintSet = ConstraintSet {
            val button = createRefFor("button")
            val text = createRefFor("text")

            val verticalChain = createVerticalChain(button, text, chainStyle = ChainStyle.Spread)
            val horizontalChain = createHorizontalChain(button, text)
        }
    }
}

private fun decoupledConstraints(margin: Dp): ConstraintSet {
    return ConstraintSet {
        val button = createRefFor("button")
        val text = createRefFor("text")

        constrain(button) {
            top.linkTo(parent.top, margin = margin)
        }
        constrain(text) {
            top.linkTo(button.bottom, margin)
        }
    }
}