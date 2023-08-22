package com.example.laboratorio4andyfuentes
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Divider
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.size
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.magnifier
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio4andyfuentes.R.drawable
import com.example.laboratorio4andyfuentes.ui.theme.Laboratorio4AndyFuentesTheme

class Contacts : ComponentActivity() {
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
                    color = MaterialTheme.colorScheme.secondary
                ) {
                    Greeting4("My profile")
                }
            }
        }
    }
}


    @Composable
    fun Greeting4(name: String, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopCenter)
                .verticalScroll(rememberScrollState())
                .padding(bottom = 0.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally


        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = drawable.cancel),
                    tint = Color.White,
                    contentDescription = "Back",
                    modifier = Modifier
                        .size(50.dp)
                        .offset(x = 10.dp)
                )
                Text(
                    text = "Emergency Contacts",
                    color = Color.White,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(x = (-20).dp)
                )
            }
            Divider(
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (0).dp)
                    .alpha(0.5f)
            )
            Box(

            ){
                Row {
                    Icon(
                        painter = painterResource(id = drawable.emergency),
                        tint = Color.Red,
                        contentDescription = "Add",
                        modifier = Modifier
                            .size(50.dp)
                            .offset(x = 10.dp)
                    )
                    Text(
                        text = "Emergencias",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(x = (-100).dp, y = 5.dp)
                    )
                }
                    Text(
                        text = "Si se presenta un incidente o percance por favor ",
                        color = Color.White,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .offset(x = 10.dp, y = 30.dp)
                            .fillMaxWidth()

                    )
                }
            Text(
                text = "marca el número de emergencia y rápidamente te",
                color = Color.White,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .offset(x = 10.dp, y = -5.dp)
                    .fillMaxWidth()
            )
            Text(
                text = "apoyamos.",
                color = Color.White,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .offset(x = -103.dp, y = -5.dp)
                    .fillMaxWidth()
            )
            Surface(
                modifier = Modifier
                    .width(300.dp)
                    .height(30.dp),
                color = Color.Black,
                shape = RoundedCornerShape(10.dp) // Ajusta el radio para hacer las esquinas curvas
            )

            {
                Icon(
                    painter = painterResource(id = drawable.phone),
                    tint = Color.White,
                    contentDescription = "Add",
                    modifier = Modifier
                        .size(50.dp)
                        .offset(x = -130.dp)
                        .aspectRatio(6f)
                )
                Text(
                    text = "Call 5978-1736",
                    fontSize = 16.sp,
                    color = Color.White,
                    modifier = Modifier
                        .offset(x= 40.dp, y = 4.dp)
                )

            }
            Divider(
                color = Color.Transparent,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .offset(y = 0.dp)
                    .alpha(0.8f)
                    .wrapContentSize(Alignment.Center)
            )
            Divider(
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (0).dp)
                    .alpha(0.5f)
            )
            Row(

            ) {
                Icon(
                    painter = painterResource(id = drawable.suport),
                    tint = Color.Red,
                    contentDescription = "Add",
                    modifier = Modifier
                        .size(50.dp)
                        .offset(x = 10.dp)
                )
                Text(
                    text = "Soporte Crunchyroll",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(x = (-55).dp, y = 5.dp)
                )
            }
            Text(
                text = "El soporte de Crunchyroll está disponible para:",
                color = Color.White,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .offset(x = 15.dp, y = -10.dp)
                    .fillMaxWidth()
            )
            Text(
                text = "- Error en la aplicación",
                color = Color.White,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .offset(x = -60.dp, y = -5.dp)
                    .fillMaxWidth()
            )
            Text(
                text = "- Fallo en la reproducción de videos",
                color = Color.White,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .offset(x = -21.dp, y = -5.dp)
                    .fillMaxWidth()
            )
            Text(
                text = "- Problemas con la cuenta",
                color = Color.White,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .offset(x = -48.dp, y = -5.dp)
                    .fillMaxWidth()
            )
            Text(
                text = "Horario de atención: 24/7",
                color = Color.White,
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .offset(x = -20.dp, y = 0.dp)
                    .fillMaxWidth()
            )
            Surface(
                modifier = Modifier
                    .width(300.dp)
                    .height(30.dp),
                color = Color.Black,
                shape = RoundedCornerShape(10.dp) // Ajusta el radio para hacer las esquinas curvas
            )

            {
                Icon(
                    painter = painterResource(id = drawable.phone),
                    tint = Color.White,
                    contentDescription = "Add",
                    modifier = Modifier
                        .size(50.dp)
                        .offset(x = -130.dp)
                        .aspectRatio(6f)
                )
                Text(
                    text = "Call 2507-1500 ex 21312",
                    fontSize = 16.sp,
                    color = Color.White,
                    modifier = Modifier
                        .offset(x= 40.dp, y = 4.dp)
                )

            }
            Divider(
                color = Color.Transparent,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .offset(y = 0.dp)
                    .alpha(0.8f)
                    .wrapContentSize(Alignment.Center)
            )
            Divider(
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(x = (0).dp)
                    .alpha(0.5f)
            )

            }



        }



@Preview(showBackground = true)
    @Composable
    fun Greeting4Preview() {
    Laboratorio4AndyFuentesTheme {
        Greeting4("Settings")
    }
}