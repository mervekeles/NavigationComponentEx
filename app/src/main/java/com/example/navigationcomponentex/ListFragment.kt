package com.example.navigationcomponentex

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ListFragment : Fragment(R.layout.fragment_list){

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        val rv : RecyclerView = itemView.findViewById(R.id.recycler_view)
        rv.layoutManager = LinearLayoutManager(activity)
        val data =  mutableListOf("task 1","task 2", "task 3", "task 4")
        rv.adapter = TodoListAdapter(data)
    }



}