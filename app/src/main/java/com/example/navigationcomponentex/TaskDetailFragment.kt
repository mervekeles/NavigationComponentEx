package com.example.navigationcomponentex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentex.databinding.FragmentTaskDetailBinding


class TaskDetailFragment : Fragment(R.layout.fragment_task_detail) {

    val args: TaskDetailFragmentArgs by navArgs()

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return FragmentTaskDetailBinding.inflate(inflater, container, false).root
//    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentTaskDetailBinding.bind(view)
        val taskname = args.task
        binding.task = taskname

    }
}