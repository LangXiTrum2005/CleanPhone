package nixlab.phone.cleaner.freeup.storage.ui.settings

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.databinding.FragmentSettingsBinding
import nixlab.phone.cleaner.freeup.storage.ui.swipe.TrashBinActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    private var isFromActivity: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        isFromActivity = arguments?.getBoolean(ARG_IS_FROM_ACTIVITY) ?: false
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (isFromActivity) {
            binding.btnBack.visibility = View.VISIBLE
            binding.btnBack.setOnClickListener {
                activity?.finish()
            }
        } else {
            binding.btnBack.visibility = View.GONE
        }

        setupUtilitiesAndSecurity()
        setupGeneral()
        setupSupport()
        setupAbout()
    }

    private fun setupUtilitiesAndSecurity() {
        val prefs = requireContext().getSharedPreferences("cleanapp_settings", Context.MODE_PRIVATE)

        binding.btnTrashBin.setOnClickListener {
            TrashBinActivity.start(requireContext())
        }

        binding.switchRemoveAfterImport.isChecked = prefs.getBoolean("pref_remove_after_import", false)
        binding.switchRemoveAfterImport.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean("pref_remove_after_import", isChecked).apply()
        }
    }



    private fun setupGeneral() {
        val currentLang = nixlab.phone.cleaner.freeup.storage.util.LocaleHelper.getSelectedLanguage(requireContext())
        val displayLang = when (currentLang) {
            "vi" -> "Tiếng Việt 🇻🇳"
            "en" -> "English 🇺🇸"
            "es" -> "Español 🇪🇸"
            "fr" -> "Français 🇫🇷"
            "de" -> "Deutsch 🇩🇪"
            "ja" -> "日本語 🇯🇵"
            "ko" -> "한국어 🇰🇷"
            "zh" -> "简体中文 🇨🇳"
            else -> currentLang.uppercase()
        }
        binding.tvCurrentLanguage.text = displayLang

        binding.btnLanguage.setOnClickListener {
            nixlab.phone.cleaner.freeup.storage.ui.language.LanguageSelectionActivity.start(requireContext(), fromSettings = true)
        }

        binding.btnWidgets.setOnClickListener {
            MaterialAlertDialogBuilder(requireContext())
                .setTitle(R.string.settings_widgets)
                .setMessage(getString(R.string.settings_widgets_instructions))
                .setPositiveButton(R.string.popups_got_it, null)
                .show()
        }
    }

    private fun setupSupport() {
        binding.btnFaq.setOnClickListener {
            showFaqBottomSheet()
        }

        binding.btnRateUs.setOnClickListener {
            showRateUsDialog()
        }
    }

    private fun showFaqBottomSheet() {
        val dialog = BottomSheetDialog(requireContext())
        val view = layoutInflater.inflate(R.layout.dialog_faq_help, null)
        dialog.setContentView(view)
        dialog.show()
    }

    private fun showRateUsDialog() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.settings_rate_us)
            .setMessage(getString(R.string.settings_rate_us_msg))
            .setPositiveButton(getString(R.string.settings_rate_5_stars)) { d, _ ->
                d.dismiss()
                try {
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=nixlab.phone.cleaner.freeup.storage")))
                } catch (e: Exception) {
                    openUrl("https://play.google.com/store/apps/details?id=nixlab.phone.cleaner.freeup.storage")
                }
            }
            .setNegativeButton(R.string.popups_maybe_later, null)
            .show()
    }

    private fun setupAbout() {
        binding.btnPrivacy.setOnClickListener {
            openUrl(getString(R.string.privacy_policy_url))
        }

        binding.btnTerms.setOnClickListener {
            showLegalBottomSheet(getString(R.string.settings_terms_of_service), getString(R.string.settings_terms_content))
        }

        binding.btnCommunity.setOnClickListener {
            showLegalBottomSheet(getString(R.string.settings_community_guidelines), getString(R.string.settings_community_content))
        }
    }

    private fun showLegalBottomSheet(title: String, content: String) {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(title)
            .setMessage(content)
            .setPositiveButton(R.string.btn_close, null)
            .show()
    }

    private fun openUrl(url: String) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(requireContext(), url, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val ARG_IS_FROM_ACTIVITY = "is_from_activity"

        fun newInstance(isFromActivity: Boolean = false): SettingsFragment {
            val fragment = SettingsFragment()
            val args = Bundle().apply {
                putBoolean(ARG_IS_FROM_ACTIVITY, isFromActivity)
            }
            fragment.arguments = args
            return fragment
        }
    }
}
