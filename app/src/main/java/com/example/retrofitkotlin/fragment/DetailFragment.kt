package com.example.retrofitkotlin.fragment


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.retrofitkotlin.R
import com.example.retrofitkotlin.databinding.LayoutFragmentDetailBindingImpl

class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding:LayoutFragmentDetailBindingImpl =DataBindingUtil.inflate(inflater,R.layout.layout_fragment_detail, container, false)
        return  binding.root
    }


}
