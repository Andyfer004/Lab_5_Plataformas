package com.example.laboratorio4andyfuentes
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4andyfuentes.R.drawable
import com.example.laboratorio4andyfuentes.ui.theme.Laboratorio4AndyFuentesTheme

class MainActivity1 : ComponentActivity() {
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
                    Greeting5( "Settings")
                }
            }
        }
    }
}


    @Composable
    fun Greeting5(name: String, modifier: Modifier = Modifier) {
        val context = LocalContext.current
        Box(
            modifier = modifier
                .fillMaxSize() // Utilizamos fillMaxSize para que el Box ocupe todo el espacio disponible
                .verticalScroll(rememberScrollState()) // Aplicamos verticalScroll al Box
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .wrapContentSize(Alignment.TopCenter),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    Icon(
                        painter = painterResource(id = drawable.home),
                        tint = Color.White,
                        contentDescription = "Home",
                        modifier = Modifier
                            .size(100.dp)
                            .padding(10.dp)
                            .offset(x = -70.dp, y = -30.dp)
                            .aspectRatio(1.5f)
                    )
                    Text(
                        text = "Home",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(10.dp)
                            .offset(x = -50.dp, y = -10.dp)
                    )

                }

                Divider(
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .offset(y = -50.dp)
                )
                Button(
                    onClick = {
                        val intent = Intent(context, MainActivity::class.java)
                        context.startActivity(intent)
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                    )
                ) {
                    // Contenido del botón
                    Icon(
                        painter = painterResource(id = drawable.ic_launcher_foreground),
                        contentDescription = "Search",
                        tint = Color.White,
                        modifier = Modifier
                            .height(80.dp)
                            .padding(10.dp)
                            .aspectRatio(1f)

                    )
                    Text(
                        text = "Campus Central AnimeVideo",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(10.dp)
                            .offset(x = -20.dp, y = 0.dp)
                    )
                }


                Button(
                    onClick = {
                        val intent = Intent(context, Log::class.java)
                        context.startActivity(intent)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                    )
                ) {
                    Icon(
                        painter = painterResource(id = drawable.editprofile),
                        contentDescription = "editprofile",
                        tint = Color.White,
                        modifier = Modifier
                            .height(80.dp)
                            .padding(10.dp)
                            .aspectRatio(1f)
                            .offset(x = -90.dp)

                    )
                    Text(
                        text = "Profile",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(10.dp)
                            .offset(x = -20.dp, y = 0.dp)
                    )

                }
                Button(
                    onClick = {
                        val intent = Intent(context, Settings::class.java)
                        context.startActivity(intent)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 90.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                    )
                ) {
                    Icon(
                        painter = painterResource(id = drawable.baseline_settings_24),
                        contentDescription = "settings",
                        tint = Color.White,
                        modifier = Modifier
                            .height(60.dp)
                            .padding(10.dp)
                            .aspectRatio(5f)
                            .offset(x = -80.dp)
                    )
                    Text(
                        text = "Settings",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(10.dp)
                            .offset(x = -100.dp, y = 0.dp)

                    )

                }
                Button(
                    onClick = {
                        val intent = Intent(context, Contacts::class.java)
                        context.startActivity(intent)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = 130.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                    )
                ) {
                    Icon(
                        painter = painterResource(id = drawable.phone),
                        contentDescription = "help",
                        tint = Color.White,
                        modifier = Modifier
                            .height(60.dp)
                            .padding(10.dp)
                            .offset(x = -30.dp, y = 0.dp)
                            .aspectRatio(1f)
                    )
                    Text(
                        text = "Help and Contacts",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(10.dp)
                            .offset(x = -20.dp, y = 0.dp)
                    )

                }
            }
        }
    }

@Preview(showBackground = true)
    @Composable
    fun Greeting5Preview() {
    Laboratorio4AndyFuentesTheme {
        Greeting5("Settings")
    }
}