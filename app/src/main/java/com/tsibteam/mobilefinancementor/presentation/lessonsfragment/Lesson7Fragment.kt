package com.tsibteam.mobilefinancementor.presentation.lessonsfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tsibteam.mobilefinancementor.databinding.Lesson7MetalsBinding

class Lesson7Fragment : Fragment() {

    private var _binding: Lesson7MetalsBinding? = null
    private val binding: Lesson7MetalsBinding
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

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}