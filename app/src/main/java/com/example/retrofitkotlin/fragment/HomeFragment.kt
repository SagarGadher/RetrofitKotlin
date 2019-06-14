package com.example.retrofitkotlin.fragment


import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.retrofitkotlin.R
import com.example.retrofitkotlin.adapert.HomeAdapter
import com.example.retrofitkotlin.databinding.LayoutFragmentHomeBinding
import com.example.retrofitkotlin.viewmodel.HomeViewModel

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding :LayoutFragmentHomeBinding =  DataBindingUtil.inflate(inflater,R.layout.layout_fragment_home, container, false)
        val viewModel:HomeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        binding.rvHome.adapter = HomeAdapter()
        return binding.root
    }
}
