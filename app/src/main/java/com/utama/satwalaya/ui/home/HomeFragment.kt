package com.utama.satwalaya.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.utama.satwalaya.R
import com.utama.satwalaya.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Setup Pet Hotel Item
        binding.itemHotel.apply {
            tvServiceName.text = "Pet Hotel"
            tvServiceDesc.text = "Comfortable stay for your pets"
            ivServiceIcon.setImageResource(R.drawable.ic_home)
            cvIcon.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.grad_orange))
        }

        // Setup Grooming Item
        binding.itemGrooming.apply {
            tvServiceName.text = "Grooming"
            tvServiceDesc.text = "Best treatment for your pets"
            ivServiceIcon.setImageResource(R.drawable.ic_grooming)
            cvIcon.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.grad_purple))
        }

        // Setup Pickup Item
        binding.itemPickup.apply {
            tvServiceName.text = "Pickup Service"
            tvServiceDesc.text = "Safe transport for your pets"
            ivServiceIcon.setImageResource(R.drawable.ic_pickup)
            cvIcon.setCardBackgroundColor(ContextCompat.getColor(requireContext(), R.color.grad_blue))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}