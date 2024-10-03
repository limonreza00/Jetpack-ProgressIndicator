package com.coderscastle.jetpack_progressindicator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coderscastle.jetpack_progressindicator.ui.theme.JetpackProgressIndicatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackProgressIndicatorTheme {
                ProgressIndicatorScreen()
            }
        }
    }
}


@Composable
fun ProgressIndicatorScreen (){

    var isShowing by remember { mutableStateOf(false) }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        if (isShowing){

            LinearProgressIndicator(
                modifier = Modifier.fillMaxWidth(),
                color = Color.Black,
                trackColor = Color.Yellow
            )

            CircularProgressIndicator(
                modifier = Modifier.height(100.dp).padding(top = 20.dp)
            )

        }

        Button(
            onClick = {
                isShowing = !isShowing
            })
        {
            Text(text = if (isShowing) {"Dismiss"} else {"Show"})
        }
    }
}