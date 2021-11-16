package com.example.navigationcomponentex

import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigationcomponentex.databinding.FragmentExBinding
import com.example.navigationcomponentex.databinding.FragmentTaskDetailBinding

class ExFragment : Fragment(R.layout.fragment_ex){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentExBinding>(inflater,
            R.layout.fragment_ex,container,false)

        binding.doneButton.setOnClickListener {
                view : View ->
            val profileName = binding.profileName.text.toString()
            val profileEmail = binding.email.text.toString()
            val profileInfo = ProfileInfo(profileName, profileEmail)
            val action = ExFragmentDirections.actionExFragmentToSecondFragment(profileInfo)

            view.findNavController().navigate(action)
        }
        return binding.root
    }
}
