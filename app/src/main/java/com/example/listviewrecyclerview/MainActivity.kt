package com.example.listviewrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val burung = arrayOf("bapalo", "kenari", "gereja", "kakatua", "pipit", "elang", "rajawali")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, burung)
        lv_burung.adapter = adapter
        lv_burung.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "burung ${burung[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}