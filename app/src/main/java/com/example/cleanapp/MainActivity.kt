package com.example.cleanapp

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.OvershootInterpolator
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import androidx.fragment.app.Fragment
import com.example.cleanapp.databinding.ActivityMainBinding
import com.example.cleanapp.ui.appcleaner.AppCleanerFragment
import com.example.cleanapp.ui.base.BaseActivity
import com.example.cleanapp.ui.contacts.ContactsFragment
import com.example.cleanapp.ui.compressor.VideoCompressFragment
import com.example.cleanapp.ui.dashboard.DashboardFragment
import com.example.cleanapp.ui.swipe.PhotoSwipeFragment
import com.example.cleanapp.util.SafeAreaUtils

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private var indicatorAnimator: ValueAnimator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )

            // Safe Area padding for Fragment Container (Top, Left, Right)
            binding.fragmentContainer.setPadding(
                insets.left,
                insets.top,
                insets.right,
                0
            )

            // Safe Area padding and height extension for Bottom Navigation (Bottom, Left, Right)
            val baseNavHeight = SafeAreaUtils.dpToPx(this, 72f)
            binding.bottomNav.updateLayoutParams {
                height = baseNavHeight + insets.bottom
            }
            binding.bottomNav.setPadding(
                insets.left,
                0,
                insets.right,
                insets.bottom
            )

            windowInsets
        }

        setupBottomNavigation()

        if (savedInstanceState == null) {
            showFragment(DashboardFragment.newInstance())
        }

        // Initialize indicator position once BottomNav is measured
        binding.bottomNav.post {
            moveIndicatorToItem(binding.bottomNav.selectedItemId, animate = false)
        }
    }

    private fun setupBottomNavigation() {
        binding.bottomNav.setOnItemSelectedListener { item ->
            val fragment: Fragment = when (item.itemId) {
                R.id.nav_home -> DashboardFragment.newInstance()
                R.id.nav_apps -> AppCleanerFragment.newInstance()
                R.id.nav_contacts -> ContactsFragment.newInstance()
                R.id.nav_compress -> VideoCompressFragment.newInstance()
                R.id.nav_swipe -> PhotoSwipeFragment.newInstance()
                else -> DashboardFragment.newInstance()
            }

            // Animate Button Click (Futuristic Bounce, Float & Rotate)
            animateTabItem(item.itemId)

            // Animate Multi-Color Gliding Indicator & Background Particle Burst
            moveIndicatorToItem(item.itemId, animate = true)

            showFragment(fragment)
            true
        }
    }

    private fun animateTabItem(itemId: Int) {
        val itemView = binding.bottomNav.findViewById<View>(itemId) ?: return

        // 1. Futuristic Pop & Scale Bounce
        val scaleX = ObjectAnimator.ofFloat(itemView, View.SCALE_X, 0.82f, 1.22f, 1.0f)
        val scaleY = ObjectAnimator.ofFloat(itemView, View.SCALE_Y, 0.82f, 1.22f, 1.0f)

        // 2. Vertical Float Bounce
        val transY = ObjectAnimator.ofFloat(itemView, View.TRANSLATION_Y, 0f, -8f, 0f)

        // 3. Quick Tech Wobble Rotation
        val rotation = ObjectAnimator.ofFloat(itemView, View.ROTATION, 0f, -6f, 6f, 0f)

        AnimatorSet().apply {
            playTogether(scaleX, scaleY, transY, rotation)
            duration = 450L
            interpolator = OvershootInterpolator(2.2f)
            start()
        }
    }

    private fun moveIndicatorToItem(itemId: Int, animate: Boolean) {
        val itemView = binding.bottomNav.findViewById<View>(itemId) ?: return
        val itemCenterX = itemView.left + itemView.width / 2f
        val targetX = itemCenterX - binding.vNavIndicator.width / 2f

        // Harmonious Signature Multi-Color Palette per tab
        val (tabColors, accentColor) = when (itemId) {
            R.id.nav_home -> intArrayOf(Color.parseColor("#00E5FF"), Color.parseColor("#0052FF")) to Color.parseColor("#00E5FF") // Neon Cyan & Royal Blue
            R.id.nav_apps -> intArrayOf(Color.parseColor("#A855F7"), Color.parseColor("#6366F1")) to Color.parseColor("#A855F7") // Vivid Purple & Indigo
            R.id.nav_contacts -> intArrayOf(Color.parseColor("#10B981"), Color.parseColor("#06B6D4")) to Color.parseColor("#10B981") // Emerald & Mint Teal
            R.id.nav_compress -> intArrayOf(Color.parseColor("#F97316"), Color.parseColor("#F59E0B")) to Color.parseColor("#F97316") // Sunset Orange & Amber
            R.id.nav_swipe -> intArrayOf(Color.parseColor("#EC4899"), Color.parseColor("#E11D48")) to Color.parseColor("#EC4899") // Rose Pink & Crimson
            else -> intArrayOf(Color.parseColor("#00E5FF"), Color.parseColor("#0052FF")) to Color.parseColor("#00E5FF")
        }

        // Dynamically update BottomNav Active Color Tint state
        val colorStateList = ColorStateList(
            arrayOf(
                intArrayOf(android.R.attr.state_checked),
                intArrayOf()
            ),
            intArrayOf(
                accentColor,
                Color.parseColor("#94A3B8")
            )
        )
        binding.bottomNav.itemIconTintList = colorStateList
        binding.bottomNav.itemTextColor = colorStateList

        val indicatorDrawable = GradientDrawable(
            GradientDrawable.Orientation.LEFT_RIGHT,
            tabColors
        ).apply {
            cornerRadius = SafeAreaUtils.dpToPx(this@MainActivity, 2).toFloat()
        }
        binding.vNavIndicator.background = indicatorDrawable

        if (!animate) {
            binding.vNavIndicator.translationX = targetX
            return
        }

        // Trigger background celebration particle burst above the tapped tab
        val tabY = binding.bottomNav.top.toFloat() - 10f
        binding.mainBackgroundAura.triggerTapBurst(itemCenterX, tabY, accentColor)

        indicatorAnimator?.cancel()

        val startX = binding.vNavIndicator.translationX
        indicatorAnimator = ValueAnimator.ofFloat(startX, targetX).apply {
            duration = 380L
            interpolator = AccelerateDecelerateInterpolator()
            addUpdateListener { anim ->
                val fraction = anim.animatedFraction
                val currentX = anim.animatedValue as Float
                binding.vNavIndicator.translationX = currentX

                // Stretch laser beam dynamically during movement
                val stretch = 1.0f + 0.85f * kotlin.math.sin(fraction * Math.PI.toFloat())
                binding.vNavIndicator.scaleX = stretch
            }
            start()
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.fragment_slide_up,
                R.anim.fragment_fade_out
            )
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    override fun onDestroy() {
        indicatorAnimator?.cancel()
        super.onDestroy()
    }
}