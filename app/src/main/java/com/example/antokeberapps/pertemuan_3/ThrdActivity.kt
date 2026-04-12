package com.example.antokeberapps.pertemuan_3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.antokeberapps.databinding.ActivityThirdBinding

class ThrdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, ThirdResultActivity::class.java)

            intent.putExtra("EXTRA_NAMA", "Thariq")

            startActivity(intent)
        }
    }
}