package com.tsibteam.mobilefinancementor.presentation.lessonsfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tsibteam.mobilefinancementor.databinding.Lesson1InvestBinding

class Lesson1Fragment : Fragment() {

    private var _binding: Lesson1InvestBinding? = null
    private val binding: Lesson1InvestBinding
        get() = _binding ?: throw RuntimeException("Lesson1InvestBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = Lesson1InvestBinding.inflate(layoutInflater)
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
            .navigate(Lesson1FragmentDirections.actionLesson1FragmentToLesson2Fragment())
    }
}