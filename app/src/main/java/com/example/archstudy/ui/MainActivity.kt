package com.example.archstudy.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.archstudy.BaseActivity
import com.example.archstudy.R
import com.example.archstudy.databinding.ActivityMainBinding
import com.example.archstudy.ui.home.HomeFragment
import com.example.archstudy.ui.star.StarFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomnavigation.LabelVisibilityMode


class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main), BottomNavigationView.OnNavigationItemSelectedListener{

    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.viewModel = mainViewModel

        binding.mainBottomNavigation.setOnNavigationItemSelectedListener(this)
        //binding.mainBottomNavigation.labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_UNLABELED
        binding.mainBottomNavigation.selectedItemId = R.id.action_shopping
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.action_shopping -> {
                var FragmentA = HomeFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_framelayout, FragmentA).commit()

                return true
            }

            R.id.action_star -> {
                var FragmentB = StarFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.main_framelayout, FragmentB).commit()

                return true
            }

        }
        return false
    }
}