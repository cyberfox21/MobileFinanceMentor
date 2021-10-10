package com.tsibteam.mobilefinancementor.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tsibteam.mobilefinancementor.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    private var _binding: FragmentTestBinding? = null
    private val binding: FragmentTestBinding
        get() = _binding ?: throw RuntimeException("FragmentTestBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTestBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    override fun onDestroyView() {
        super.onDestroyView()
    }
}