package nixlab.phone.cleaner.freeup.storage.ui.settings

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import nixlab.phone.cleaner.freeup.storage.R
import nixlab.phone.cleaner.freeup.storage.databinding.FragmentSettingsBinding
import nixlab.phone.cleaner.freeup.storage.ui.paywall.PaywallActivity
import nixlab.phone.cleaner.freeup.storage.ui.swipe.TrashBinActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder

import android.text.InputFilter
import nixlab.phone.cleaner.freeup.storage.util.SecurityUtils

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
        setupSocial()
        setupSupport()
        setupAbout()
    }

    private fun setupUtilitiesAndSecurity() {
        val prefs = requireContext().getSharedPreferences("cleanapp_settings", Context.MODE_PRIVATE)

        binding.btnTrashBin.setOnClickListener {
            TrashBinActivity.start(requireContext())
        }

        binding.switchUsePin.isChecked = prefs.getBoolean("pref_use_pin", true)
        binding.switchUsePin.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean("pref_use_pin", isChecked).apply()
        }

        binding.switchUseBiometrics.isChecked = prefs.getBoolean("pref_use_biometrics", true)
        binding.switchUseBiometrics.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean("pref_use_biometrics", isChecked).apply()
        }

        binding.switchRemoveAfterImport.isChecked = prefs.getBoolean("pref_remove_after_import", false)
        binding.switchRemoveAfterImport.setOnCheckedChangeListener { _, isChecked ->
            prefs.edit().putBoolean("pref_remove_after_import", isChecked).apply()
        }

        binding.btnChangePin.setOnClickListener {
            showChangePinDialog()
        }
    }

    private fun showChangePinDialog() {
        val context = requireContext()
        val hasPin = SecurityUtils.isPinSet(context)

        val layout = LinearLayout(context).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(60, 30, 60, 20)
        }

        val lengthFilter = arrayOf<InputFilter>(InputFilter.LengthFilter(6))

        val etOldPin = EditText(context).apply {
            hint = getString(R.string.settings_old_pin_hint)
            inputType = android.text.InputType.TYPE_CLASS_NUMBER or android.text.InputType.TYPE_NUMBER_VARIATION_PASSWORD
            filters = lengthFilter
        }
        val etNewPin = EditText(context).apply {
            hint = getString(R.string.settings_new_pin_hint)
            inputType = android.text.InputType.TYPE_CLASS_NUMBER or android.text.InputType.TYPE_NUMBER_VARIATION_PASSWORD
            filters = lengthFilter
        }
        val etConfirmPin = EditText(context).apply {
            hint = getString(R.string.settings_confirm_new_pin_hint)
            inputType = android.text.InputType.TYPE_CLASS_NUMBER or android.text.InputType.TYPE_NUMBER_VARIATION_PASSWORD
            filters = lengthFilter
        }

        if (hasPin) {
            layout.addView(etOldPin)
        }
        layout.addView(etNewPin)
        layout.addView(etConfirmPin)

        val dialog = MaterialAlertDialogBuilder(context)
            .setTitle(R.string.settings_change_pin)
            .setView(layout)
            .setPositiveButton(R.string.btn_save, null)
            .setNegativeButton(R.string.btn_cancel, null)
            .create()

        dialog.setOnShowListener {
            val saveBtn = dialog.getButton(android.content.DialogInterface.BUTTON_POSITIVE)
            saveBtn.setOnClickListener {
                if (hasPin) {
                    val oldPin = etOldPin.text.toString().trim()
                    if (oldPin.length != 6 || !oldPin.all { it.isDigit() } || !SecurityUtils.verifyPin(context, oldPin)) {
                        Toast.makeText(context, R.string.secret_pin_wrong, Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }

                    val newPin = etNewPin.text.toString().trim()
                    val confirmPin = etConfirmPin.text.toString().trim()

                    if (newPin.length != 6 || !newPin.all { it.isDigit() }) {
                        Toast.makeText(context, R.string.pin_must_be_4_digits, Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }

                    if (newPin == oldPin) {
                        Toast.makeText(context, R.string.pin_same_as_old_error, Toast.LENGTH_SHORT).show()
                        etNewPin.setText("")
                        etConfirmPin.setText("")
                        etNewPin.requestFocus()
                        return@setOnClickListener
                    }

                    if (newPin != confirmPin) {
                        Toast.makeText(context, R.string.pin_confirm_mismatch, Toast.LENGTH_SHORT).show()
                        etConfirmPin.setText("")
                        etConfirmPin.requestFocus()
                        return@setOnClickListener
                    }

                    SecurityUtils.savePin(context, newPin)
                    Toast.makeText(context, R.string.secret_pin_create_success, Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                } else {
                    val newPin = etNewPin.text.toString().trim()
                    val confirmPin = etConfirmPin.text.toString().trim()

                    if (newPin.length != 6 || !newPin.all { it.isDigit() }) {
                        Toast.makeText(context, R.string.pin_must_be_4_digits, Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }

                    if (newPin != confirmPin) {
                        Toast.makeText(context, R.string.pin_confirm_mismatch, Toast.LENGTH_SHORT).show()
                        etConfirmPin.setText("")
                        etConfirmPin.requestFocus()
                        return@setOnClickListener
                    }

                    SecurityUtils.savePin(context, newPin)
                    Toast.makeText(context, R.string.secret_pin_create_success, Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
            }
        }

        dialog.show()
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

    private fun setupSocial() {
        binding.btnShareApp.setOnClickListener {
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(
                    Intent.EXTRA_TEXT,
                    getString(R.string.settings_share_text)
                )
                type = "text/plain"
            }
            startActivity(Intent.createChooser(sendIntent, getString(R.string.settings_share_app)))
        }

        binding.btnInstagram.setOnClickListener {
            openUrl("https://instagram.com")
        }

        binding.btnTiktok.setOnClickListener {
            openUrl("https://tiktok.com")
        }
    }

    private fun setupSupport() {
        binding.btnFaq.setOnClickListener {
            showFaqBottomSheet()
        }

        binding.btnRateUs.setOnClickListener {
            showRateUsDialog()
        }

        binding.btnContactUs.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:support@cleanup.app?subject=Feedback Cleanup Android")
            }
            try {
                startActivity(emailIntent)
            } catch (e: Exception) {
                Toast.makeText(requireContext(), getString(R.string.support_contact_toast_fmt, "support@cleanup.app"), Toast.LENGTH_LONG).show()
            }
        }

        binding.btnRestorePurchase.setOnClickListener {
            Toast.makeText(requireContext(), getString(R.string.subscriptions_checking_restored), Toast.LENGTH_LONG).show()
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
            showLegalBottomSheet(getString(R.string.settings_privacy_policy), getString(R.string.contact_us_four_answer))
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
