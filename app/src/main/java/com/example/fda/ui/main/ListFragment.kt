package com.example.fda.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fda.MainViewModel
import com.example.fda.R
import com.example.fda.ui.main.MainAdapter
import kotlinx.android.synthetic.main.list_fragment.*
import kotlinx.android.synthetic.main.reference_list.*

class ListFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.list_fragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.adapter = MainAdapter()
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        buttonEmail.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_emailFragment)
        }

        buttonBack1.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_mainFragment)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }



}