package com.example.interviewtestapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.interviewtestapplication.R
import com.example.interviewtestapplication.databinding.FragmentNoteHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NoteHomeFragment : Fragment() {

    private lateinit var binding : FragmentNoteHomeBinding

    private val viewModel by viewModels<NoteHomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getSampleNote()
        initView()
    }

    private fun initView() {
       // binding.recyclerView.

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerView.adapter = NotesAdapter(emptyList())
    }


}