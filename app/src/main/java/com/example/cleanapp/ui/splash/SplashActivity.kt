package com.example.cleanapp.ui.splash

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.view.animation.OvershootInterpolator
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cleanapp.databinding.ActivitySplashBinding
import com.example.cleanapp.ui.base.BaseActivity
import com.example.cleanapp.ui.onboarding.OnboardingActivity
import com.example.cleanapp.util.SafeAreaUtils

class SplashActivity : BaseActivity() {

    private lateinit var binding: ActivitySplashBinding
    private var progressAnimator: ValueAnimator? = null
    private var pulseAnimator: ObjectAnimator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            val sideMargin = SafeAreaUtils.dpToPx(this, 48)
            val lp = binding.splashProgressBar.layoutParams as? android.view.ViewGroup.MarginLayoutParams
            lp?.let {
                it.leftMargin = insets.left + sideMargin
                it.rightMargin = insets.right + sideMargin
                it.bottomMargin = insets.bottom + SafeAreaUtils.dpToPx(this, 56)
                binding.splashProgressBar.layoutParams = it
            }
            windowInsets
        }

        setupInitialViewState()
        startSplashAnimations()
    }

    private fun setupInitialViewState() {
        // Center text container initial hidden & scaled down
        binding.centerLayout.alpha = 0f
        binding.centerLayout.scaleX = 0.4f
        binding.centerLayout.scaleY = 0.4f
        binding.centerLayout.translationY = SafeAreaUtils.dpToPx(this, 20).toFloat()

        // Status, progress text & bar initial hidden
        binding.tvSplashStatus.alpha = 0f
        binding.tvSplashProgress.alpha = 0f
        binding.splashProgressBar.alpha = 0f
    }

    private fun startSplashAnimations() {
        // 1. Entrance Animations for Center Layout
        val centerScaleX = ObjectAnimator.ofFloat(binding.centerLayout, View.SCALE_X, 0.4f, 1.0f)
        val centerScaleY = ObjectAnimator.ofFloat(binding.centerLayout, View.SCALE_Y, 0.4f, 1.0f)
        val centerAlpha = ObjectAnimator.ofFloat(binding.centerLayout, View.ALPHA, 0f, 1.0f)
        val centerTransY = ObjectAnimator.ofFloat(binding.centerLayout, View.TRANSLATION_Y, binding.centerLayout.translationY, 0f)

        val centerEntrance = AnimatorSet().apply {
            playTogether(centerScaleX, centerScaleY, centerAlpha, centerTransY)
            duration = 850L
            interpolator = OvershootInterpolator(1.4f)
        }

        val statusAlpha = ObjectAnimator.ofFloat(binding.tvSplashStatus, View.ALPHA, 0f, 1.0f)
        val progressTextAlpha = ObjectAnimator.ofFloat(binding.tvSplashProgress, View.ALPHA, 0f, 1.0f)
        val progressBarAlpha = ObjectAnimator.ofFloat(binding.splashProgressBar, View.ALPHA, 0f, 1.0f)

        val progressEntrance = AnimatorSet().apply {
            playTogether(statusAlpha, progressTextAlpha, progressBarAlpha)
            duration = 500L
            startDelay = 350L
            interpolator = DecelerateInterpolator()
        }

        AnimatorSet().apply {
            playTogether(centerEntrance, progressEntrance)
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    if (!isFinishing) {
                        startContinuousBreathing()
                    }
                }
            })
            start()
        }

        // 2. Linear Progress Bar Animation (0% to 100% over 5s)
        progressAnimator = ValueAnimator.ofInt(0, 100).apply {
            duration = 5000L
            interpolator = LinearInterpolator()
            addUpdateListener { animator ->
                val progress = animator.animatedValue as Int
                binding.splashProgressBar.progress = progress
                binding.tvSplashProgress.text = "$progress%"

                // Dynamic Status Messages
                binding.tvSplashStatus.text = when {
                    progress < 25 -> "Đang khởi tạo hệ thống dọn dẹp..."
                    progress < 50 -> "Quét & phân tích bộ nhớ AI..."
                    progress < 75 -> "Tối ưu hóa dung lượng thiết bị..."
                    progress < 99 -> "Hoàn tất chuẩn bị trải nghiệm..."
                    else -> "Sẵn sàng!"
                }
            }
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    if (!isFinishing) {
                        navigateToOnboarding()
                    }
                }
            })
            start()
        }
    }

    private fun startContinuousBreathing() {
        // Subtle center title breathing & vertical float
        val pvhScaleX = PropertyValuesHolder.ofFloat(View.SCALE_X, 1.0f, 1.05f)
        val pvhScaleY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1.0f, 1.05f)
        val pvhTranslationY = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, 0f, -6f)

        pulseAnimator = ObjectAnimator.ofPropertyValuesHolder(binding.centerLayout, pvhScaleX, pvhScaleY, pvhTranslationY).apply {
            duration = 1400L
            repeatCount = ValueAnimator.INFINITE
            repeatMode = ValueAnimator.REVERSE
            interpolator = AccelerateDecelerateInterpolator()
            start()
        }
    }

    private fun navigateToOnboarding() {
        val intent = Intent(this, OnboardingActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onDestroy() {
        progressAnimator?.cancel()
        pulseAnimator?.cancel()
        super.onDestroy()
    }
}
