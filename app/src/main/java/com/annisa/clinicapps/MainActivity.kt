package com.annisa.clinicapps

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //splash screen
        //Untuk delay beberapa detik, kemudian pindah otomatis ke page berikutnya
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, StarterPageActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // Waktu delay dalam milidetik (3000 ms = 3 detik)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}