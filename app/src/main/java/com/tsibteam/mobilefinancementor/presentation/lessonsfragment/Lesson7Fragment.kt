package com.tsibteam.mobilefinancementor.presentation.lessonsfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tsibteam.mobilefinancementor.databinding.Lesson1InvestBinding
import com.tsibteam.mobilefinancementor.databinding.Lesson3AciiBinding
import com.tsibteam.mobilefinancementor.databinding.Lesson7MetalsBinding
import java.lang.RuntimeException

class Lesson7Fragment : Fragment() {

    private var _binding : Lesson7MetalsBinding? = null
    private val binding : Lesson7MetalsBinding
    get() = _binding ?: throw RuntimeException("Lesson7MetalsBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = Lesson7MetalsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        binding.btnUnderstand.setOnClickListener {
//            toNextLesson()
//        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}