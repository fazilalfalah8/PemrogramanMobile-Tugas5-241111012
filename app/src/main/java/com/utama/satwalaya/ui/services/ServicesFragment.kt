package com.utama.satwalaya.ui.services

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.utama.satwalaya.data.ServiceItem
import com.utama.satwalaya.databinding.FragmentServicesBinding
import com.utama.satwalaya.ui.adapters.ServiceAdapter

class ServicesFragment : Fragment() {

    private var _binding: FragmentServicesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentServicesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val services = listOf(
            ServiceItem(1, "Pet Hotel (Standard)", "Kamar nyaman dengan sirkulasi udara baik", "Rp 50.000 / day", 0),
            ServiceItem(2, "Pet Hotel (VIP)", "Kamar luas, AC, dan kamera pemantau", "Rp 150.000 / day", 0),
            ServiceItem(3, "Grooming Mandi", "Mandi bersih dengan shampoo premium", "Rp 40.000", 0),
            ServiceItem(4, "Grooming Lengkap", "Mandi, potong kuku, dan bersihkan telinga", "Rp 75.000", 0),
            ServiceItem(5, "Pick Up Service", "Antar jemput hewan kesayangan Anda", "Rp 25.000", 0)
        )

        binding.rvServices.layoutManager = LinearLayoutManager(context)
        binding.rvServices.adapter = ServiceAdapter(services)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}