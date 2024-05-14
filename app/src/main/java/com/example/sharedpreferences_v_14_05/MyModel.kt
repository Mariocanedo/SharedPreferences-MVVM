package com.example.sharedpreferences_v_14_05

import android.content.SharedPreferences

class MyModel ( private val sharedPreferences : SharedPreferences ){





    fun GuardarDatos(emailKey : String, email :String, contrasenakey :String, contrasena :String){

      sharedPreferences.edit().apply{

          putString(emailKey,email)
          putString(contrasenakey,contrasena)
          apply()
      }

    }


    fun removeDatosFromPreferences(emailKey: String, contrasenakey: String){

        sharedPreferences.edit().apply{
            remove(emailKey)
            remove(contrasenakey)
            apply()
        }

    }



    //Este método toma una clave como parámetro y devuelve el valor asociado con esa clave desde
    // las SharedPreferences. Si no se encuentra ningún valor asociado con la clave proporcionada,
    // devuelve null
    fun getEmailFromPreferences( key: String):String?{
        return sharedPreferences.getString(key,"")
    }







}