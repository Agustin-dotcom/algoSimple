package com.example.algosimple

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.algosimple.ui.theme.AlgoSimpleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContentView(R.layout.activity_main)

       /* val textView: TextView = findViewById(R.id.textView)
        textView.text = "Agustín"*/

        /*val backgroundImage: ImageView = findViewById(R.id.backgroundImage)
        backgroundImage.setImageResource(R.drawable.ohyeah)*/

       /* val foregroundImage: ImageView = findViewById(R.id.foregroundImage)
        foregroundImage.setImageResource(R.drawable.nycfromabove)*/

       setContent {
            AlgoSimpleTheme {
                /*Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Agustín",
                        modifier = Modifier.padding(innerPadding)
                    )
                }*/
                LoginScreen()
            }
        }
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}
*/
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AlgoSimpleTheme {
        //Greeting("Android")
        LoginScreen()
    }
}
@Composable
fun LoginScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        // Imagen de fondo
        Image(
            painter = painterResource(id = R.drawable.ohyeah),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // Logo
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.TopCenter)
                .padding(top = 50.dp)
        )

        // Botón de Log in
        Button(
            onClick = { /* TODO: Login action */ },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp)
        ) {
            Text("Log in")
        }
    }
}