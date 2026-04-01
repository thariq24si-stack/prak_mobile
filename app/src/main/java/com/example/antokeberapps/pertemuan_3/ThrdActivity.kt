package com.example.antokeberapps.pertemuan_3

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.antokeberapps.R
import com.example.antokeberapps.databinding.ActivityThirdBinding

class ThrdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = 	ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        // Inisialisasi komponen
//        val inputNoTujuan: EditText = findViewById(R.id.inputNoTujuan)
//        val btnKirim: Button = findViewById(R.id.btnKirim)
       binding.btnKirim.setOnClickListener {
            //Mengambil value dari inputNama dan menampilkan di Logcat
            val nama = binding.inputNoTujuan.text
            Log.e("Klik btnSubmit","Tombol berhasil di tekan. Isi dari inputNama = $nama")

                Toast.makeText(this, "Pesan telah dikirim ke $nama", Toast.LENGTH_SHORT).show()

           val intent = Intent(this, ThirdResultActivity::class.java)
           startActivity(intent)
        }
    }
}