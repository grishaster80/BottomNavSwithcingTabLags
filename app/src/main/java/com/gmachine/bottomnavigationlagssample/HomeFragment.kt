package com.gmachine.bottomnavigationlagssample

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")
        val formatted = current.format(formatter)
        Log.e("@@@","DummyFragment(Home) onCreate called at $formatted")
    }

    override fun onStart() {
        super.onStart()
        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")
        val formatted = current.format(formatter)
        Log.e("@@@","DummyFragment(Home) onStart called at $formatted")
    }

    override fun onResume() {
        super.onResume()
        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")
        val formatted = current.format(formatter)
        Log.e("@@@","DummyFragment(Home) onResume called at $formatted")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")
        val formatted = current.format(formatter)
        Log.e("@@@", "DummyFragment(Home) onViewCreated called at $formatted")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")
        val formatted = current.format(formatter)
        Log.e("@@@","DummyFragment(Home) onDestroyView called at $formatted")
    }

    override fun onPause() {
        super.onPause()
        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")
        val formatted = current.format(formatter)
        Log.e("@@@","DummyFragment(Home) onPause called at $formatted")
    }

    override fun onStop() {
        super.onStop()
        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")
        val formatted = current.format(formatter)
        Log.e("@@@","DummyFragment(Home) onStop called at $formatted")
    }

    override fun onDestroy() {
        super.onDestroy()
        val current = LocalDateTime.now()

        val formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")
        val formatted = current.format(formatter)
        Log.e("@@@","DummyFragment(Home) onDestroy called at $formatted")
    }
}