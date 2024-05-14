package com.example.sharedpreferences_v_14_05

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.example.sharedpreferences_v_14_05.ui.theme.SharedPreferences_v_1405Theme

class MainActivity : ComponentActivity() {
    // falta agregar referencias binding
    // falta crear la vista inflar con bindigns

    private lateinit var viewModel: MyViewModel // Corregido el nombre del ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val sharedPreferences = getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE)
        viewModel= ViewModelProvider(this).get(MyViewModel::class.java)



        val key1 ="key1"
        val email ="M...Andorid@hotmail.com"

        val key2 = "Key2"
        val contrasena= "@34reg3232"

        viewModel.guardarDatos(key1,email,key2,contrasena)

        viewModel.emailLiveData.observe(this,{
            email ->

            // agregar binding conectarcon con el Edit text

        })



        setContent {
            SharedPreferences_v_1405Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
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
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SharedPreferences_v_1405Theme {
        Greeting("Android")
    }
}