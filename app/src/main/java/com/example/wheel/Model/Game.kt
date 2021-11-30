package com.example.wheel.Model

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.wheel.ViewModel.GameViewModel
import com.example.wheel.databinding.FragmentGameBinding

class Game : Fragment() {
private var _binding: FragmentGameBinding? = null

    private val viewModel : GameViewModel by viewModels()
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGameBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.startNewGame()

       binding.apply {
           newGameButton.setOnClickListener {
               viewModel.startNewGame()
           }

       }

    }



}
