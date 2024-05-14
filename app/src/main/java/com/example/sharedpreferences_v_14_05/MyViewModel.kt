package com.example.sharedpreferences_v_14_05

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyViewModel(application: Application):AndroidViewModel(application){


    // instanciamos las clase que necesitamos ( preferences , model)
    private val sharedPreferences: SharedPreferences = application.getSharedPreferences("SharedPreferences",
        Context.MODE_PRIVATE)

     private val myModel = MyModel(sharedPreferences)


    // ocupar Live data para agregar observadores
    private val _emailLiveData = MutableLiveData<String?>()
     val emailLiveData :LiveData<String?>
         get() = _emailLiveData


    private val _contrasenakey = MutableLiveData<String?>()
    val contresenaKey :LiveData<String?>
        get()= _contrasenakey


    fun guardarDatos(emailkey:String, email: String,contrasenaKey: String, contrasena :String){

        myModel.GuardarDatos(emailkey, email,contrasenaKey,contrasena)

    }

    fun eliminarDatos(emailKey:String,contrasenaKey:String){
        myModel.removeDatosFromPreferences(emailKey,contrasenaKey)

    }


    // crear un método Obtener Datos








}