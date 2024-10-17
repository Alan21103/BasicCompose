package com.example.basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccompose.ui.theme.BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text("Login", style = TextStyle(fontSize = 50.sp, color = Color.Blue,
            fontWeight = FontWeight.Bold))

        Text("Ini adalah halaman Login", style = TextStyle(fontSize = 20.sp,
            fontStyle = FontStyle.Italic))

        Image(painter = painterResource(id = R.drawable.umy), contentDescription = null,
            modifier = Modifier.padding(top = 30.dp).size(220.dp))

        Text(
            " Nama",
            style = TextStyle(fontSize = 18.sp, color = Color.Blue, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top = 20.dp)
        )

        Text(
            " Rosihan Syahlan Syahputra",
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Medium),
            modifier = Modifier.padding(top = 20.dp)
        )

        Text(
            "20220140127",
            style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Medium),
            modifier = Modifier.padding(top = 8.dp)
        )

        Image(painter = painterResource(id = R.drawable.poto), contentDescription = null,
            modifier = Modifier.padding(top = 30.dp).size(220.dp))

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicComposeTheme {
        BasicLayout()
    }
}