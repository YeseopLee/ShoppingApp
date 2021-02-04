package com.example.archstudy.ui.star

import androidx.fragment.app.viewModels
import com.example.archstudy.BaseFragment
import com.example.archstudy.R
import com.example.archstudy.databinding.FragmentHomeBinding
import com.example.archstudy.databinding.FragmentStarBinding
import com.example.archstudy.ui.home.HomeViewModel

class StarFragment : BaseFragment<FragmentStarBinding>(R.layout.fragment_star) {

    private val starViewModel by viewModels<StarViewModel>()
}