package com.example.fda.ui.main

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fda.R
import com.example.fda.ui.main.MainAdapter.*
import kotlinx.android.synthetic.main.reference_list.view.*

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val referenceTextView: TextView = itemView.reference_list
    }

    val listReference = listOf(
        "below 18.5 – you're in the underweight range",
        "between 18.5 and 24.9 – you're in the healthy weight range",
        "between 25 and 29.9 – you're in the overweight range",
        "between 30 and 39.9 – you're in the obese range")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val card = LayoutInflater.from(parent.context).inflate(R.layout.reference_list, parent, false)
        return MainViewHolder(card)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.referenceTextView.text=listReference[position]
    }

    override fun getItemCount() = listReference.size

}
