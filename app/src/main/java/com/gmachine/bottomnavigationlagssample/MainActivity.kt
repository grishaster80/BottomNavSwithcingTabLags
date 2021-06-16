package com.gmachine.bottomnavigationlagssample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onStart() {
        super.onStart()
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)

        val navController = findNavController(R.id.nested_nav_host_fragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.menu_home_nav_graph -> {
                    navController.navigate(R.id.home)
                }
                R.id.menu_search_nav_graph -> {
                    navController.navigate(R.id.search)
                }
                else -> {
                    navController.navigate(R.id.settings)
                }
            }
            true
        }
    }
}