package com.example.antokeberapps.pertemuan_4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.antokeberapps.R
import com.example.antokeberapps.databinding.DashboardBinding
import com.example.antokeberapps.pertemuan_3.ThirdResultActivity

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: DashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogout.setOnClickListener {
            val builder = androidx.appcompat.app.AlertDialog.Builder(this)
            builder.setTitle("Konfirmasi Logout")
            builder.setMessage("Apakah Anda yakin ingin keluar?")

            builder.setPositiveButton("Iya") { _, _ ->
                val intent = Intent(this, ThirdResultActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            }

            builder.setNegativeButton("Tidak") { dialog, _ ->
                dialog.dismiss()
                com.google.android.material.snackbar.Snackbar.make(
                    binding.root,
                    "Logout dibatalkan",
                    com.google.android.material.snackbar.Snackbar.LENGTH_SHORT
                ).show()
            }

            builder.show()
        }

        binding.btnBangunRuang.setOnClickListener {
            val intent = Intent(this, BRuangActivity::class.java)

            intent.putExtra("EXTRA_FOOTER", "AppleApps")
            intent.putExtra("EXTRA_LOGO", R.drawable.apple)

            startActivity(intent)
        }
        binding.btnCustom1.setOnClickListener {
            val intent = Intent(this, Custom_1Activity::class.java)
            intent.putExtra("EXTRA_JUDUL", "Halaman Informasi")
            intent.putExtra("EXTRA_DESC", "Ini deskripsi detail untuk Custom Screen 1")
            intent.putExtra("EXTRA_FOOTER", "AppleApps")
            intent.putExtra("EXTRA_LOGO", R.drawable.apple)
            startActivity(intent)
        }
        binding.btnCustom2.setOnClickListener {
            val intent = Intent(this, Custom_2Activity::class.java)
            intent.putExtra("EXTRA_JUDUL", "Halaman Informasi")
            intent.putExtra("EXTRA_DESC", "Ini deskripsi detail untuk Custom Screen 2")
            intent.putExtra("EXTRA_FOOTER", "AppleApps")
            intent.putExtra("EXTRA_LOGO", R.drawable.apple)
            startActivity(intent)
        }
    }
}