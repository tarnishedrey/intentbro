package com.example.intentbro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MoveMyData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_my_data)
        val tvDataReceived: TextView = findViewById(R.id.Terimadata)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        val text = "Nama : $name\n Umur : $age \n "
        tvDataReceived.text = text
    }

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    @Composable
    fun MyImageComposable(message: String, from: String) {
        val imagePainter = painterResource(R.drawable.yejiii)
        Image(
            painter = imagePainter,
            contentDescription = "Image Description", // Replace with an appropriate description
            modifier = Modifier.size(100.dp) // Adjust the size as needed
        )
    }

    @Preview
    @Composable
    fun MyImageComposablePreview() {
        MyImageComposable("Hello", "User")
    }




}