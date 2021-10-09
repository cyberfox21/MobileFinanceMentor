package com.tsibteam.mobilefinancementor.presentation.lessonsfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tsibteam.mobilefinancementor.databinding.Lesson2BrockerBinding

class Lesson2Fragment : Fragment() {

    private var _binding: Lesson2BrockerBinding? = null
    private val binding: Lesson2BrockerBinding
        get() = _binding ?: throw RuntimeException("Lesson2BrockerBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = Lesson2BrockerBinding.inflate(layoutInflater)
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
            .navigate(Lesson2FragmentDirections.actionLesson2FragmentToLesson3Fragment())
    }
}