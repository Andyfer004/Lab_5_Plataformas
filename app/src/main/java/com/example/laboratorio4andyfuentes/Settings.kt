package com.example.laboratorio4andyfuentes
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

class Settings : ComponentActivity() {
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
                    Greeting3("My profile")
                }
            }
        }
    }
}


    @Composable
    fun Greeting3(name: String, modifier: Modifier = Modifier) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopCenter)
                .verticalScroll(rememberScrollState())
                .padding(bottom = 0.dp)
                .background(Color.Black),
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
                    text = "Settings",
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

            )
            Icon(
                painter = painterResource(id = R.drawable.editprofile), // Cambia a tu recurso de icono
                contentDescription = "Editar",
                tint = Color.White,
                modifier = Modifier
                    .padding(5.dp)
                    .offset(x = (-150).dp)
                    .aspectRatio(5.5f)
            )
            Text(
                text = "Edit Profile",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize(Alignment.CenterStart)
                    .offset(x = (-80).dp, y = (-50).dp)
                    .padding(5.dp)
            )
            Divider(
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-45).dp)
                    .alpha(0.6f)
            )
            Icon(
                painter = painterResource(id = R.drawable.emailadress), // Cambia a tu recurso de icono
                contentDescription = "Notificaciones",
                tint = Color.White,
                modifier = Modifier
                    .padding(5.dp)
                    .offset(x = (-150).dp, y = (-52).dp)
                    .aspectRatio(6f)
            )
            Text(
                text = "Notifications",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize(Alignment.CenterStart)
                    .offset(x = (-75).dp, y = (-105).dp)
                    .padding(5.dp)
            )
            Divider(
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-100).dp)
                    .alpha(0.6f)
            )
            Icon(
                painter = painterResource(id = R.drawable.privacy), // Cambia a tu recurso de icono
                contentDescription = "Privacidad",
                tint = Color.White,
                modifier = Modifier
                    .padding(5.dp)
                    .offset(x = (-150).dp, y = (-110).dp)
                    .aspectRatio(6f)
            )
            Text(
                text = "Privacy",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize(Alignment.CenterStart)
                    .offset(x = (-100).dp, y = (-163).dp)
                    .padding(5.dp)
            )


                Divider(
                    modifier = Modifier
                        .height(20.dp)
                        .offset(y = -150.dp),
                    color = MaterialTheme.colorScheme.secondary
                )
            Icon(
                painter = painterResource(id = R.drawable.help), // Cambia a tu recurso de icono
                contentDescription = "Cerrar sesión",
                tint = Color.White,
                modifier = Modifier
                    .padding(5.dp)
                    .offset(x = (-150).dp, y = (-165).dp)
                    .aspectRatio(6f)
            )
            Text(
                text = "Help & Feedback",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize(Alignment.CenterStart)
                    .offset(x = (-60).dp, y = (-221).dp)
                    .padding(5.dp)
            )
            Text(
                text = "Troubleshooting tips and guides",
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize(Alignment.CenterStart)
                    .offset(x = (-35).dp, y = (-235).dp)
                    .padding(5.dp)
                    .alpha(0.8f)
            )
            Divider(
                modifier = Modifier
                    .height(2.dp)
                    .offset(y = -230.dp)
                    .alpha(0.6f),
                color = Color.White

            )
            Icon(
                painter = painterResource(id = R.drawable.about), // Cambia a tu recurso de icono
                contentDescription = "Cerrar sesión",
                tint = Color.White,
                modifier = Modifier
                    .padding(5.dp)
                    .offset(x = (-150).dp, y = (-240).dp)
                    .aspectRatio(6f)
            )
            Text(
                text = "About",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize(Alignment.CenterStart)
                    .offset(x = (-100).dp, y = (-295).dp)
                    .padding(5.dp)
            )
    Text(
        text = "App information and documents",
        fontSize = 12.sp,
        color = Color.White,
        modifier = Modifier
            .wrapContentSize(Alignment.CenterStart)
            .offset(x = (-35).dp, y = (-310).dp)
            .padding(5.dp)
            .alpha(0.8f)
    )
    Divider(
        modifier = Modifier
            .height(20.dp)
            .offset(y = -305.dp),
        color = MaterialTheme.colorScheme.secondary,
    )
            Text(
                text = "Logout",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize(Alignment.CenterStart)
                    .offset(y = (-300).dp)
                    .padding(5.dp)
            )
            Divider(
                modifier = Modifier
                    .height(400.dp)
                    .offset(y = -290.dp),
                color = MaterialTheme.colorScheme.secondary,
            )
        }
    }



@Preview(showBackground = true)
    @Composable
    fun Greeting3Preview() {
    Laboratorio4AndyFuentesTheme {
        Greeting2("Settings")
    }
}