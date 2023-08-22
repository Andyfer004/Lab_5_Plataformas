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

class Log : ComponentActivity() {
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
                    Greeting2("My profile")
                }
            }
        }
    }
}


    @Composable
    fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopCenter)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "$name",
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize(Alignment.TopCenter)
                    .padding(5.dp)
                    .offset(x = (140).dp)

            )
            Icon(
                painter = painterResource(id = R.drawable.baseline_settings_24), // Cambia a tu recurso de icono
                contentDescription = "Configuración",
                tint = Color.White,   // Color del icono
                modifier = Modifier
                    .wrapContentSize(Alignment.TopCenter)
                    .padding(5.dp),
            )
        }


            Image(
                painter = painterResource(id = drawable.imagen7),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .alpha(alpha = 0.8f)
                    .offset(y = (-80).dp),

                )
             Image(
            painter = painterResource(id = R.drawable.icono), // Cambia a tu recurso de icono
            contentDescription = "Editar",
            // Color del icono
            modifier = Modifier
                .padding(5.dp)
                .aspectRatio(3f)
                .offset(y = (-240).dp),

             )
            Text(
                text = "Andy Fernando Fuentes Velásquez",
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .offset(y = (-240).dp)
                    .padding(5.dp)
            )
        Divider(
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-225).dp)
                .alpha(alpha = 0.6f)
        )
            Icon(
                painter = painterResource(id = R.drawable.ic_launcher_foreground), // Cambia a tu recurso de icono
                contentDescription = "Editar",
                tint = Color.White,
                modifier = Modifier
                    .padding(5.dp)
                    .offset(x = (-160).dp, y = (-240).dp)
                    .aspectRatio(5f)
            )
            Text(
                text = "My Campus",
                fontSize = 18.sp,
                color = Color.White,
                modifier = Modifier
                    .wrapContentSize(Alignment.CenterStart)
                    .offset(x = (-88).dp, y = (-310).dp)
                    .padding(5.dp)
            )
        Text(
            text = "Campus Central",
            fontSize = 12.sp,
            color = Color.White,
            modifier = Modifier
                .offset(x = (-88).dp, y = (-315).dp)
                .wrapContentSize(Alignment.CenterStart),
        )
        Divider(
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-303).dp)
                .alpha(alpha = 0.6f)
        )
    Icon(
        painter = painterResource(id = R.drawable.friends), // Cambia a tu recurso de icono
        contentDescription = "Editar",
        tint = Color.White,
        modifier = Modifier
            .padding(5.dp)
            .offset(x = (-158).dp, y = (-320).dp)
            .aspectRatio(5f)
    )
        Text(
            text = "My Friends",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier
            .wrapContentSize(Alignment.CenterStart)
            .offset(x = (-88).dp, y = (-375).dp)
            .padding(5.dp)
        )
        Divider(
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-373).dp)
                .alpha(alpha = 0.6f)
        )
        Icon(
            painter = painterResource(id = R.drawable.calendar), // Cambia a tu recurso de icono
            contentDescription = "Editar",
            tint = Color.White,
            modifier = Modifier
                .padding(5.dp)
                .offset(x = (-160).dp, y = (-385).dp)
                .aspectRatio(5.5f)
        )
        Text(
            text = "My Calendar",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier
                .wrapContentSize(Alignment.CenterStart)
                .offset(x = (-85).dp, y = (-440).dp)
                .padding(5.dp)
        )
        Divider(
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-435).dp)
                .alpha(alpha = 0.6f)
        )
        Icon(
            painter = painterResource(id = R.drawable.courses), // Cambia a tu recurso de icono
            contentDescription = "Editar",
            tint = Color.White,
            modifier = Modifier
                .padding(5.dp)
                .offset(x = (-160).dp, y = (-450).dp)
                .aspectRatio(5.5f)
        )
        Text(
            text = "My Courses",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier
                .wrapContentSize(Alignment.CenterStart)
                .offset(x = (-85).dp, y = (-505).dp)
                .padding(5.dp)
        )
        Divider(
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-500).dp)
                .alpha(alpha = 0.6f)
        )
        Icon(
            painter = painterResource(id = R.drawable.mygrades_foreground), // Cambia a tu recurso de icono
            contentDescription = "Editar",
            tint = Color.White,
            modifier = Modifier
                .padding(5.dp)
                .offset(x = (-160).dp, y = (-515).dp)
                .aspectRatio(5.5f)
        )

        Text(
            text = "My Grades",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier
                .wrapContentSize(Alignment.CenterStart)
                .offset(x = (-88).dp, y = (-570).dp)
                .padding(5.dp)
        )
        Divider(
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-565).dp)
                .alpha(alpha = 0.6f)
        )
        Icon(
            painter = painterResource(id = R.drawable.grups), // Cambia a tu recurso de icono
            contentDescription = "Editar",
            tint = Color.White,
            modifier = Modifier
                .padding(5.dp)
                .offset(x = (-160).dp, y = (-580).dp)
                .aspectRatio(5.5f)
        )
        Text(
            text = "My Groups",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier
                .wrapContentSize(Alignment.CenterStart)
                .offset(x = (-88).dp, y = (-635).dp)
                .padding(5.dp)
        )
        Divider(
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-630).dp)
                .alpha(alpha = 0.6f)
        )
        Icon(
            painter = painterResource(id = R.drawable.events), // Cambia a tu recurso de icono
            contentDescription = "Editar",
            tint = Color.White,
            modifier = Modifier
                .padding(5.dp)
                .offset(x = (-160).dp, y = (-645).dp)
                .aspectRatio(5.5f)
        )
        Text(
            text = "My Events",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier
                .wrapContentSize(Alignment.CenterStart)
                .offset(x = (-88).dp, y = (-700).dp)
                .padding(5.dp)
        )
        Divider(
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-695).dp)
                .alpha(alpha = 0.6f)
        )
        Icon(
            painter = painterResource(id = R.drawable.groups_foreground), // Cambia a tu recurso de icono
            contentDescription = "Editar",
            tint = Color.Red,
            modifier = Modifier
                .padding(5.dp)
                .offset( y = (-710).dp)
                .aspectRatio(5.5f)
        )

        }

        }



@Preview(showBackground = true)
    @Composable
    fun Greeting2Preview() {
    Laboratorio4AndyFuentesTheme {
        Greeting2("My profile")
    }
}