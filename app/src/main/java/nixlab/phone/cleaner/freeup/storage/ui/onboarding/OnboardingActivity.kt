package nixlab.phone.cleaner.freeup.storage.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import nixlab.phone.cleaner.freeup.storage.MainActivity
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.databinding.ActivityOnboardingBinding
import nixlab.phone.cleaner.freeup.storage.ui.base.BaseActivity
import nixlab.phone.cleaner.freeup.storage.ui.language.LanguageSelectionActivity
import nixlab.phone.cleaner.freeup.storage.util.LocaleHelper
import nixlab.phone.cleaner.freeup.storage.util.SafeAreaUtils

class OnboardingActivity : BaseActivity() {

    private lateinit var binding: ActivityOnboardingBinding
    private lateinit var adapter: OnboardingAdapter

    private val slides = listOf(
        OnboardingSlide(
            lottieAssetPath = "lotties/animated_onboarding/v3/free_up_space.json",
            titleRes = R.string.onboarding_title_1,
            descRes = R.string.onboarding_desc_1
        ),
        OnboardingSlide(
            lottieAssetPath = "lotties/animated_onboarding/v1/clear_duplicates.json",
            titleRes = R.string.onboarding_title_2,
            descRes = R.string.onboarding_desc_2
        ),
        OnboardingSlide(
            lottieAssetPath = "lotties/animated_onboarding/v1/free_up_space_photos.json",
            titleRes = R.string.onboarding_title_3,
            descRes = R.string.onboarding_desc_3
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            binding.topBar.setPadding(
                insets.left + SafeAreaUtils.dpToPx(this, 16),
                insets.top + SafeAreaUtils.dpToPx(this, 8),
                insets.right + SafeAreaUtils.dpToPx(this, 16),
                SafeAreaUtils.dpToPx(this, 8)
            )
            val sideMargin = SafeAreaUtils.dpToPx(this, 24)
            val lp = binding.btnNext.layoutParams as? ViewGroup.MarginLayoutParams
            lp?.let {
                it.leftMargin = insets.left + sideMargin
                it.rightMargin = insets.right + sideMargin
                it.bottomMargin = insets.bottom + SafeAreaUtils.dpToPx(this, 24)
                binding.btnNext.layoutParams = it
            }
            windowInsets
        }

        setupViewPager()
        setupListeners()
    }

    private fun setupViewPager() {
        adapter = OnboardingAdapter(slides)
        binding.viewPagerOnboarding.adapter = adapter

        binding.viewPagerOnboarding.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                updateIndicators(position)
                if (position == slides.size - 1) {
                    binding.btnNext.text = getString(R.string.onboarding_get_started)
                } else {
                    binding.btnNext.text = getString(R.string.onboarding_next)
                }
            }
        })
    }

    private fun updateIndicators(position: Int) {
        val dots = listOf(binding.dot1, binding.dot2, binding.dot3)
        dots.forEachIndexed { index, dot ->
            val lp = dot.layoutParams
            if (index == position) {
                lp.width = SafeAreaUtils.dpToPx(this, 24)
                dot.setBackgroundResource(R.drawable.bg_badge_best)
            } else {
                lp.width = SafeAreaUtils.dpToPx(this, 8)
                dot.setBackgroundResource(R.drawable.bg_circle_icon)
            }
            dot.layoutParams = lp
        }
    }

    private fun setupListeners() {
        binding.btnNext.setOnClickListener {
            val current = binding.viewPagerOnboarding.currentItem
            if (current < slides.size - 1) {
                binding.viewPagerOnboarding.setCurrentItem(current + 1, true)
            } else {
                navigateToLanguageSelection()
            }
        }
    }

    private fun navigateToLanguageSelection() {
        val intent = Intent(this, LanguageSelectionActivity::class.java)
        startActivity(intent)
        finish()
    }
}
