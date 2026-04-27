package com.utama.satwalaya.ui.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.utama.satwalaya.data.HistoryItem
import com.utama.satwalaya.databinding.FragmentHistoryBinding
import com.utama.satwalaya.ui.adapters.HistoryAdapter

class HistoryFragment : Fragment() {

    private var _binding: FragmentHistoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val history = listOf(
            HistoryItem(1, "Full Grooming", "12 Oct 2023", "Completed"),
            HistoryItem(2, "Pet Hotel (VIP)", "15 Oct 2023", "Pending"),
            HistoryItem(3, "Pick Up Service", "10 Oct 2023", "Cancelled")
        )

        binding.rvHistory.layoutManager = LinearLayoutManager(context)
        binding.rvHistory.adapter = HistoryAdapter(history)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}