package com.img.toasto

import android.content.Context
import android.widget.Toast

class Toasto {

    public fun showToastMy(context: Context, message: String){
        Toast.makeText(context,message+"",Toast.LENGTH_SHORT).show()

    }
}