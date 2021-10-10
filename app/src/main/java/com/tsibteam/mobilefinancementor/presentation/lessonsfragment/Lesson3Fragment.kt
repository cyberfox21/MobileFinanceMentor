package com.tsibteam.mobilefinancementor.presentation.lessonsfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tsibteam.mobilefinancementor.databinding.Lesson3AciiBinding

class Lesson3Fragment : Fragment() {

    private var _binding: Lesson3AciiBinding? = null
    private val binding: Lesson3AciiBinding
        get() = _binding ?: throw RuntimeException("Lesson3AciiBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = Lesson3AciiBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnUnderstand.setOnClickListener {
            toNextLesson()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun toNextLesson() {
        findNavController()
            .navigate(Lesson3FragmentDirections.actionLesson3FragmentToLesson4Fragment())
    }
}