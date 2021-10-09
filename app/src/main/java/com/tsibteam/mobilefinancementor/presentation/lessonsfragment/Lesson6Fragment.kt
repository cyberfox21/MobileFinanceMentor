package com.tsibteam.mobilefinancementor.presentation.lessonsfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tsibteam.mobilefinancementor.databinding.Lesson1InvestBinding
import com.tsibteam.mobilefinancementor.databinding.Lesson3AciiBinding
import com.tsibteam.mobilefinancementor.databinding.Lesson6CurrencyBinding
import java.lang.RuntimeException

class Lesson6Fragment : Fragment() {

    private var _binding : Lesson6CurrencyBinding? = null
    private val binding : Lesson6CurrencyBinding
    get() = _binding ?: throw RuntimeException("Lesson6CurrencyBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = Lesson6CurrencyBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnUnderstand.setOnClickListener {
            toNextLesson()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun toNextLesson() {
        findNavController()
            .navigate(Lesson6FragmentDirections.actionLesson6FragmentToLesson7Fragment())
    }
}