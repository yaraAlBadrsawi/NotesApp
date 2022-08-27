package com.kotlin.notesapp.views

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.notesapp.databinding.FragmentEditBinding


class EditFragment : Fragment() {

    private lateinit var  binding:FragmentEditBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentEditBinding.inflate(inflater)
        binding.editor.setEditorHeight(200)
        binding.editor.setEditorWidth(200)
        binding.editor.setFontSize(16)
        binding.editor.setEditorFontColor(Color.BLACK)
       // binding.editor.setBackgroundColor(Color.GRAY)
        binding.editor.setPadding(10,10,10,10)
        return binding.root
    }


}