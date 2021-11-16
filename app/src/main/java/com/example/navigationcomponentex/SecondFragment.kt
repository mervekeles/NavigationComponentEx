package com.example.navigationcomponentex

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentex.databinding.FragmentSecondBinding
import com.example.navigationcomponentex.databinding.FragmentTaskDetailBinding

class SecondFragment : Fragment(R.layout.fragment_second){
    val args: SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = FragmentSecondBinding.bind(view)
        val profileInfo = args.profileInfo
        Log.v("Second Frag", "profile $profileInfo")


        if (profileInfo != null) {
            binding.profile = getString(R.string.hello_profile, profileInfo.username, profileInfo.email)
        }

    }
}