package com.example.laboratorio4andyfuentes
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4andyfuentes.R.drawable
import com.example.laboratorio4andyfuentes.ui.theme.Laboratorio4AndyFuentesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio4AndyFuentesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxWidth()
                        .wrapContentSize(Alignment.TopCenter),
                    color = MaterialTheme.colorScheme.primary
                ) {
                    Greeting("Bienvenidos a AnimeVideo")
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopCenter).verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "$name!",
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
            fontSize = 20.sp,
           color = Color.White,
        )
        Image(
            painter = painterResource(id = drawable.imagen1),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().aspectRatio(1f).offset(y = (-80).dp),

        )
        Text(
            text = "DESTACADOS" ,
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier.offset(x=-100.dp,y=-160.dp).wrapContentSize(Alignment.CenterStart),
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = drawable.imagen2),
                contentDescription = null,
                modifier = Modifier.size(230.dp).weight(5f).offset(y=-150.dp)// Misma proporción de espacio
            )
            Image(
                painter = painterResource(id = drawable.imagen3),
                contentDescription = null,
                modifier = Modifier.size(230.dp).weight(5f).offset(y=-150.dp) // Misma proporción de espacio
            )
        }
        Text(
            text = "Servicios y Recursos" ,
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier.offset(x=-70.dp,y=-140.dp).wrapContentSize(Alignment.CenterStart),
        )

        Image(
                painter = painterResource(id = drawable.imagen6),
                contentDescription = null,
                modifier = Modifier.size(600.dp).aspectRatio(2f).wrapContentSize(Alignment.Center)
                    .offset(x = -70.dp, y = -370.dp) //
            )
        Image(
                painter = painterResource(id = drawable.imagen4),
                contentDescription = null,
                modifier = Modifier.size(230.dp).aspectRatio(2f).wrapContentSize(Alignment.Center)
                    .offset(x = -80.dp, y = -650.dp)
            )

    }
}

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Laboratorio4AndyFuentesTheme {
            Greeting("Bienvenidos a AnimeVideo")
        }
    }
