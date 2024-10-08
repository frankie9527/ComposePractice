package com.compose.practice.component

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.compose.practice.uitls.UiData
import org.various.player.ui.simple.SimpleVideoView


@Composable
fun AndroidViewUse() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        val context = LocalContext.current
        var md: Modifier? = null
        val configuration = LocalConfiguration.current
        val lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current;
        md = if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Modifier
                .fillMaxWidth()
                .height(240.dp)
                .statusBarsPadding()
        } else {
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .statusBarsPadding()
        }
        val simpleVideoView = remember {
            SimpleVideoView(context).apply {
                // Sets up listeners for View -> Compose communication
                setUserActionListener {
                    Toast.makeText(context, "nihao", Toast.LENGTH_LONG).show()
                }
            }
        }
        // If `lifecycleOwner` changes, dispose and reset the effect
        DisposableEffect(lifecycleOwner) {
            // Create an observer that triggers our remembered callbacks
            // for sending analytics events
            val observer = LifecycleEventObserver { _, event ->
                when (event) {
                    Lifecycle.Event.ON_RESUME -> simpleVideoView.resume()
                    Lifecycle.Event.ON_PAUSE -> simpleVideoView.pause()
                    Lifecycle.Event.ON_DESTROY -> simpleVideoView.release()
                    else -> {}
                }
            }

            // Add the observer to the lifecycle
            lifecycleOwner.lifecycle.addObserver(observer)

            // When the effect leaves the Composition, remove the observer
            onDispose {
                lifecycleOwner.lifecycle.removeObserver(observer)
            }
        }
        // Adds view to Compose
        AndroidView(
            modifier = md, // Occupy the max size in the Compose UI tree
            factory = { context ->
                // Creates view
                simpleVideoView
            },
            update = { view ->
                // View's been inflated or state read in this block has been updated
                // Add logic here if necessary

                // As selectedItem is read here, AndroidView will recompose
                // whenever the state changes
                // Example of Compose -> View communication
//                view.setPlayData(UiData.url, "update view")
//                view.startSyncPlay()
            },
            onRelease = { view ->
                view.release()
            }
        )

        Button(onClick = {
            simpleVideoView.setPlayData(UiData.url, "play url")
            simpleVideoView.startSyncPlay()
        }, Modifier.padding(top = 8.dp, start = 8.dp)) {
            Text("play url")
        }
        Button(onClick = {
            simpleVideoView.setPlayData(UiData.url1, "play url1")
            simpleVideoView.startSyncPlay()
        }, Modifier.padding(top = 8.dp, start = 8.dp)) {
            Text("play url1")
        }
    }
}
