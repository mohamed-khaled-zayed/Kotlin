package com.binarycase.mohamed.myfirstlibrary

import android.content.Context
import android.widget.Toast

class PrettyToast {

    fun showSuccessToast(context : Context, text : String){
        Toast.makeText(context,text,Toast.LENGTH_LONG).show()
    }
}