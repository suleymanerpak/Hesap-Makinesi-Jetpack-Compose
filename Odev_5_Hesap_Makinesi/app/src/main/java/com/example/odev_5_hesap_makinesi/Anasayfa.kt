package com.example.odev_5_hesap_makinesi

import android.webkit.WebSettings.TextSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.odev_5_hesap_makinesi.ui.theme.islemRenk
import com.example.odev_5_hesap_makinesi.ui.theme.islemRenkYazi
import com.example.odev_5_hesap_makinesi.ui.theme.numaraRenk
import com.example.odev_5_hesap_makinesi.ui.theme.numaraRenkYazi
import com.example.odev_5_hesap_makinesi.ui.theme.sifirlamaRenk
import com.example.odev_5_hesap_makinesi.ui.theme.sifirlamaRenkYazi



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa(){
    val alinanDeger = remember { mutableStateOf("0") }
    val birinciSayi = remember { mutableStateOf("") }
    val operator = remember { mutableStateOf("") }


    Scaffold( topBar = { TopAppBar(title = { Text(text = "Hesap Makinesi")}) })
    {paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues), verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
            )
        {
           Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End) {
               Text(text = alinanDeger.value,fontSize = 50.sp)
           }
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly )
            {
                Button(onClick = {alinanDeger.value = "0"},shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = sifirlamaRenk,
                        contentColor = sifirlamaRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "AC",fontSize = 24.sp)
                }

                Button(onClick = {},shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = sifirlamaRenk,
                        contentColor = sifirlamaRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "+/-",fontSize = 24.sp)
                }

                Button(onClick = {},shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = sifirlamaRenk,
                        contentColor = sifirlamaRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "%",fontSize = 24.sp)
                }

                Button(onClick = {},shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = islemRenk,
                        contentColor = islemRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "%",fontSize = 24.sp)
                }

            }

            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly)
            {
                Button(onClick = {alinanDeger.value = if (alinanDeger.value == "0") "7" else alinanDeger.value + "7" },shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "7",fontSize = 24.sp)
                }

                Button(onClick = {alinanDeger.value = if (alinanDeger.value == "0") "8" else alinanDeger.value + "8" },shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "8",fontSize = 24.sp)
                }

                Button(onClick = {alinanDeger.value = if (alinanDeger.value == "0") "9" else alinanDeger.value + "9" },shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "9",fontSize = 24.sp)
                }

                Button(onClick = {},shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = islemRenk,
                        contentColor = islemRenkYazi),modifier = Modifier.size(80.dp))
                {
                    Text(text = "X",fontSize = 24.sp)
                }

            }

            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly)
            {
                Button(onClick = {alinanDeger.value = if (alinanDeger.value == "0") "4" else alinanDeger.value + "4" },shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "4",fontSize = 24.sp)
                }

                Button(onClick = {alinanDeger.value = if (alinanDeger.value == "0") "5" else alinanDeger.value + "5" },shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "5",fontSize = 24.sp)
                }

                Button(onClick = {alinanDeger.value = if (alinanDeger.value == "0") "6" else alinanDeger.value + "6" },shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "6",fontSize = 24.sp)
                }

                Button(onClick = {},shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = islemRenk,
                        contentColor = islemRenkYazi),modifier = Modifier.size(80.dp))
                {
                    Text(text = "-",fontSize = 24.sp)
                }

            }

            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly)
            {
                Button(onClick = {alinanDeger.value = if (alinanDeger.value == "0") "1" else alinanDeger.value + "1" },shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "1",fontSize = 24.sp)
                }

                Button(onClick = {alinanDeger.value = if (alinanDeger.value == "0") "2" else alinanDeger.value + "2"},shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "2",fontSize = 24.sp)
                }

                Button(onClick = {alinanDeger.value = if (alinanDeger.value == "0") "3" else alinanDeger.value + "3"},shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "3", fontSize = 24.sp)
                }

                Button(onClick = {
                    birinciSayi.value = alinanDeger.value
                    operator.value = "+"
                    alinanDeger.value = "0"
                },shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = islemRenk,
                        contentColor = islemRenkYazi),modifier = Modifier.size(80.dp))
                {
                    Text(text = "+",fontSize = 24.sp)
                }

            }

            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly)
            {
                Button(onClick = {alinanDeger.value = if (alinanDeger.value == "0") "0" else alinanDeger.value + "0"},shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = "0                                                                                                                                                  " +
                            "",fontSize = 24.sp)
                }

                Button(onClick = {},shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = numaraRenk,
                        contentColor = numaraRenkYazi),
                    modifier = Modifier.size(80.dp))
                {
                    Text(text = ",",fontSize = 24.sp)
                }

                Button(onClick = {
                    if (operator.value == "+") {
                        val sonuc = birinciSayi.value.toInt() + alinanDeger.value.toInt()
                        alinanDeger.value = sonuc.toString() }
                                 },shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = islemRenk,
                        contentColor = islemRenkYazi),modifier = Modifier.size(80.dp))
                {
                    Text(text = "=",fontSize = 24.sp)
                }

            }

        }
    }
}



