package nixlab.phone.cleaner.freeup.storage.ui.language

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import nixlab.phone.cleaner.freeup.storage.MainActivity
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.databinding.ActivityLanguageSelectionBinding
import nixlab.phone.cleaner.freeup.storage.ui.base.BaseActivity
import nixlab.phone.cleaner.freeup.storage.util.LocaleHelper
import nixlab.phone.cleaner.freeup.storage.util.SafeAreaUtils

class LanguageSelectionActivity : BaseActivity() {

    private lateinit var binding: ActivityLanguageSelectionBinding
    private lateinit var adapter: LanguageAdapter
    private var fromSettings = false

    private val supportedLanguages = listOf(
        LanguageItem("vi", "🇻🇳", "Tiếng Việt", "Vietnamese"),
        LanguageItem("en", "🇺🇸", "English", "English (US)"),
        LanguageItem("es", "🇪🇸", "Español", "Spanish"),
        LanguageItem("fr", "🇫🇷", "Français", "French"),
        LanguageItem("de", "🇩🇪", "Deutsch", "German"),
        LanguageItem("ja", "🇯🇵", "日本語", "Japanese"),
        LanguageItem("ko", "🇰🇷", "한국어", "Korean"),
        LanguageItem("zh", "🇨🇳", "简体中文", "Simplified Chinese")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLanguageSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fromSettings = intent.getBooleanExtra(EXTRA_FROM_SETTINGS, false)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val insets = windowInsets.getInsets(
                WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.displayCutout()
            )
            binding.headerLayout.setPadding(
                insets.left + SafeAreaUtils.dpToPx(this, 16),
                insets.top + SafeAreaUtils.dpToPx(this, 8),
                insets.right + SafeAreaUtils.dpToPx(this, 16),
                SafeAreaUtils.dpToPx(this, 8)
            )
            val sideMargin = SafeAreaUtils.dpToPx(this, 24)
            val lp = binding.btnContinueLanguage.layoutParams as? ViewGroup.MarginLayoutParams
            lp?.let {
                it.leftMargin = insets.left + sideMargin
                it.rightMargin = insets.right + sideMargin
                it.bottomMargin = insets.bottom + SafeAreaUtils.dpToPx(this, 24)
                binding.btnContinueLanguage.layoutParams = it
            }
            binding.rvLanguages.setPadding(
                insets.left,
                0,
                insets.right,
                insets.bottom + SafeAreaUtils.dpToPx(this, 90)
            )
            windowInsets
        }

        setupViews()
    }

    private fun setupViews() {
        if (fromSettings) {
            binding.btnBack.visibility = View.VISIBLE
            binding.btnBack.setOnClickListener { finish() }
            binding.btnContinueLanguage.text = getString(R.string.btn_save)
        } else {
            binding.btnBack.visibility = View.GONE
            binding.btnContinueLanguage.text = getString(R.string.btn_continue)
        }

        val currentLang = LocaleHelper.getSelectedLanguage(this)
        val initialSelected = if (supportedLanguages.any { it.code.equals(currentLang, ignoreCase = true) }) {
            currentLang
        } else {
            "vi" // Default preference
        }

        adapter = LanguageAdapter(supportedLanguages, initialSelected) { selected ->
            // Update selection
        }

        binding.rvLanguages.layoutManager = LinearLayoutManager(this)
        binding.rvLanguages.adapter = adapter

        binding.btnContinueLanguage.setOnClickListener {
            val selectedCode = adapter.getSelectedCode()
            LocaleHelper.setLocale(this, selectedCode)
            LocaleHelper.setOnboardingCompleted(this, true)

            if (fromSettings) {
                // Restart MainActivity with updated locale
                val intent = Intent(this, MainActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                }
                startActivity(intent)
                finish()
            } else {
                val intent = Intent(this, MainActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                }
                startActivity(intent)
                finish()
            }
        }
    }

    companion object {
        const val EXTRA_FROM_SETTINGS = "extra_from_settings"

        fun start(context: Context, fromSettings: Boolean = false) {
            val intent = Intent(context, LanguageSelectionActivity::class.java).apply {
                putExtra(EXTRA_FROM_SETTINGS, fromSettings)
            }
            context.startActivity(intent)
        }
    }
}
