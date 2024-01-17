package com.example.intentbro

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        val btnMyData: Button = findViewById(R.id.btn_mydata)
        btnMoveActivity.setOnClickListener(this)
        btnDialPhone.setOnClickListener(this)
        btnMyData.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_dial_number -> {
                val phoneNumber = ""
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }

            R.id.btn_mydata -> {
                val Mydata = Intent(this@MainActivity, MoveMyData::class.java)
                Mydata.putExtra(MoveMyData.EXTRA_NAME, "Reyhan Wafii")
                Mydata.putExtra(MoveMyData.EXTRA_AGE, 13)
                startActivity(Mydata)
            }


        }

    }

}










