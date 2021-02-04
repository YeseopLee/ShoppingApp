package com.example.archstudy.ui.home

import androidx.fragment.app.viewModels
import com.example.archstudy.BaseFragment
import com.example.archstudy.R
import com.example.archstudy.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private val homeViewModel by viewModels<HomeViewModel>()
}
