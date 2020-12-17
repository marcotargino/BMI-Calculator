package com.example.fda.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fda.MainViewModel
import com.example.fda.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment(), View.OnClickListener {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        calculateButton.setOnClickListener(this)

        buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_listFragment)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onClick(v: View) {
        val id = v.id
        if (id == R.id.calculateButton) {
            calculate()
        }
    }

    private fun calculate(){
        val height = editHeight.text.toString().toFloat()
        val weight = editWeight.text.toString().toFloat()

        val result = weight/(height*height)
        textBMIResult.text = "${"%.2f".format(result)}"
    }

}