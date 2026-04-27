package com.utama.satwalaya

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.SystemBarStyle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.utama.satwalaya.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Memaksa transparansi total pada status bar di halaman Register
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT),
            navigationBarStyle = SystemBarStyle.light(Color.TRANSPARENT, Color.TRANSPARENT)
        )

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegister.setOnClickListener {
            val name = binding.etFullName.text.toString()
            val email = binding.etEmailReg.text.toString()
            val phone = binding.etPhone.text.toString()
            val password = binding.etPasswordReg.text.toString()

            if (name.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()
                finish() // Back to Login
            } else {
                Toast.makeText(this, "Semua input wajib diisi", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnToLogin.setOnClickListener {
            finish()
        }
    }
}