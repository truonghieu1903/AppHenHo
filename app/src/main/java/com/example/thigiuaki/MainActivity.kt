package com.example.thigiuaki

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var arr = ArrayList<Person>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnChon.setOnClickListener {
            for (x in 1..5) {
                val nameID = "editName"+x
                val resID = resources.getIdentifier(nameID, "id", packageName)
                val oldID = "editOld"+x
                val oID = resources.getIdentifier(oldID, "id", packageName)
                var name : EditText = findViewById(resID)
                var old : EditText = findViewById(oID)
                if (name.text.isNotEmpty() && old.text.isNotEmpty()) {
                    arr.add(Person(name.text.toString(),old.text.toString().toInt()))
                }
            }
            val rnds = (0..arr.size-1).random()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("name",arr[rnds].name)
            intent.putExtra("old", arr[rnds].old)
            startActivity(intent)
        }
        btnNhap.setOnClickListener {
            for (x in 1..5) {
                val nameID = "editName"+x
                val resID = resources.getIdentifier(nameID, "id", packageName)
                val oldID = "editOld"+x
                val oID = resources.getIdentifier(oldID, "id", packageName)
                var name : EditText = findViewById(resID)
                var old : EditText = findViewById(oID)
                name.text.clear()
                old.text.clear()
            }
        }
        btnThoat.setOnClickListener {
            finishAffinity()
        }
    }
}