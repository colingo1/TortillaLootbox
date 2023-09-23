package com.example.tortillalootbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.tortillalootbox.ui.theme.TortillaLootboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TortillaLootboxTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize().padding(20.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var result by remember {mutableStateOf(1)}

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = "Hola $name!",
            modifier = Modifier.weight(1.0f),
            fontSize = TextUnit(value = 8.0f, type = TextUnitType.Em)
        )
        Box(
            modifier = Modifier.weight(10.0f)
        ) {
            BurritoImage()
        }
        Button(
            onClick = { /*TODONT*/ },
            modifier = Modifier.weight(1.0f)
        ) {
            Text(
                text = "Search for Ingredient!"
            )
        }
    }
}

@Composable
fun BurritoImage() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.burrito_open),
            contentDescription = null
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TortillaLootboxTheme {
        Greeting("Android")
    }
}