package com.tsibteam.mobilefinancementor.presentation.lessonsfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tsibteam.mobilefinancementor.databinding.Lesson1InvestBinding
import com.tsibteam.mobilefinancementor.databinding.Lesson3AciiBinding
import com.tsibteam.mobilefinancementor.databinding.Lesson5FondsBinding
import java.lang.RuntimeException

class Lesson5Fragment : Fragment() {

    private var _binding : Lesson5FondsBinding? = null
    private val binding : Lesson5FondsBinding
    get() = _binding ?: throw RuntimeException("Lesson5FondsBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = Lesson5FondsBinding.inflate(layoutInflater)
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
            .navigate(Lesson5FragmentDirections.actionLesson5FragmentToLesson6Fragment())
    }
}