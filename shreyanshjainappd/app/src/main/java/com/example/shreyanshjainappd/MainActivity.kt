package com.example.shreyanshjainappd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button =findViewById(R.id.btn_submit)
        btn.setOnClickListener(View.OnClickListener{
            Toast.makeText( this,"bravo!! your response is submitted.", Toast.LENGTH_SHORT).show()
        })
    }
}
