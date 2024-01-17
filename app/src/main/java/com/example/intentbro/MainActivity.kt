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
        val movedata: Button = findViewById(R.id.movedata)
        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnMoveActivity.setOnClickListener(this)
        movedata.setOnClickListener(this)
        btnDialPhone.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.movedata -> {
                val moveWithDataIntent = Intent(this@MainActivity, MoveActData::class.java)
                moveWithDataIntent.putExtra(MoveActData.EXTRA_NAME, "DicodingAcademy Boy")
                moveWithDataIntent.putExtra(MoveActData.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }
                R.id.btn_dial_number -> {
                    val phoneNumber = ""
                    val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                    startActivity(dialPhoneIntent)
                }
        }

    }

}








