package com.utama.satwalaya

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.utama.satwalaya.databinding.ActivityRegisterDetailBinding

class RegisterDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFinishReg.setOnClickListener {
            val name = binding.inputNameDetail.editText?.text.toString()
            if (name.isNotEmpty()) {
                Toast.makeText(this, "Selamat datang, $name! Akun Satwalaya berhasil dibuat.", Toast.LENGTH_LONG).show()
                val intent = Intent(this, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
            } else {
                Toast.makeText(this, "Mohon isi nama lengkap Anda", Toast.LENGTH_SHORT).show()
            }
        }
    }
}