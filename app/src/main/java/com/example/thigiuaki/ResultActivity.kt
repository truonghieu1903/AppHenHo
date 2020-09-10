package com.example.thigiuaki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btnChon
import kotlinx.android.synthetic.main.activity_main.btnNhap
import kotlinx.android.synthetic.main.activity_main.btnThoat
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    var name = ""
    var old = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val bundle: Bundle? = intent.extras
        bundle?.let {
            name =  bundle.get("name").toString()
             old = bundle.get("old").toString()
          nameRS.text = name
            oldRS.text = old
        }
        btnChon.setOnClickListener {
            Toast.makeText(this,"OK chúc bạn hạnh phúc!!!",Toast.LENGTH_LONG).show()
        }
        btnNhap.setOnClickListener {
            finish()
        }
        btnThoat.setOnClickListener {
            finishAffinity()
        }
    }
}