package com.example.myapplication.WEEK3

import android.R.color.black
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.WEEK3.ui.theme.MyApplicationTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AnimationScreen()
        }
    }
}

@Composable
fun AnimationScreen() {
    var isExpanded by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (isExpanded) 1.5f else 1.0f,
        animationSpec = tween(durationMillis = 3000),
        label = "scaleAnimation"
    )

    val alpha by animateFloatAsState(
        targetValue = if (isExpanded) 1.0f else 1.0f,
        animationSpec = tween(durationMillis = 4000),
        label = "alphaAnimation"
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .size((100 * scale).dp)
                .alpha(alpha)
                .clickable { isExpanded = !isExpanded }
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = if (isExpanded) "shrink" else "expand",
                color = Color.Blue
            )
        }
    }
}
