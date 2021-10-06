package com.tsibteam.mobilefinancementor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tsibteam.mobilefinancementor.databinding.SplashScreenBinding
import kotlinx.coroutines.*

class SplashScreen : AppCompatActivity() {

    private val coroutineScope = CoroutineScope(Dispatchers.Main)
    private lateinit var binding: SplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setContentView(binding.root)
        startSplash()
    }

    private fun startSplash() {
        coroutineScope.launch {
            setProgress()
            startActivity(MainActivity.newIntent(this@SplashScreen))
            finish()
        }
    }

    private suspend fun setProgress() {
        (0 until SPLASH_SCREEN_DURATION step (SPLASH_SCREEN_DURATION / PERCENT)).forEach { i ->
            val persents = getPercents(i)
            binding.progressBar.progress = persents
            delay(WAIT_DURATION.toLong())
        }
    }

    private fun setupBinding() {
        binding = SplashScreenBinding.inflate(layoutInflater)
    }

    private fun getPercents(part: Int) =
        ((part.toDouble() / SPLASH_SCREEN_DURATION) * 100).toInt()

    override fun onDestroy() {
        super.onDestroy()
        coroutineScope.cancel()
    }

    companion object {
        const val PERCENT = 100
        const val WAIT_DURATION = 10
        const val SPLASH_SCREEN_DURATION = 5000
    }
}