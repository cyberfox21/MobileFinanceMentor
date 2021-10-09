package com.tsibteam.mobilefinancementor.presentation.lessonsfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tsibteam.mobilefinancementor.databinding.Lesson4ObligationsBinding

class Lesson4Fragment : Fragment() {

    private var _binding: Lesson4ObligationsBinding? = null
    private val binding: Lesson4ObligationsBinding
        get() = _binding ?: throw RuntimeException("Lesson4ObligationsBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = Lesson4ObligationsBinding.inflate(layoutInflater)
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
            .navigate(Lesson4FragmentDirections.actionLesson4FragmentToLesson5Fragment())
    }
}