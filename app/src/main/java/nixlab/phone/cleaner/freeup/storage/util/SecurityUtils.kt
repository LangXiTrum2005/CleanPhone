package nixlab.phone.cleaner.freeup.storage.util

import android.content.Context
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import java.security.MessageDigest

object SecurityUtils {

    private const val PREFS_NAME = "cleanup_security_prefs"
    private const val KEY_PIN_HASH = "key_pin_hash"
    private const val KEY_BIOMETRIC_ENABLED = "key_biometric_enabled"

    fun isPinSet(context: Context): Boolean {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        return prefs.getString(KEY_PIN_HASH, null) != null
    }

    fun savePin(context: Context, pin: String) {
        val hash = hashPin(pin)
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        prefs.edit().putString(KEY_PIN_HASH, hash).apply()
    }

    fun clearPin(context: Context) {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        prefs.edit().remove(KEY_PIN_HASH).apply()
    }

    fun verifyPin(context: Context, pin: String): Boolean {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val savedHash = prefs.getString(KEY_PIN_HASH, null) ?: return false
        return savedHash == hashPin(pin)
    }

    private fun hashPin(pin: String): String {
        val md = MessageDigest.getInstance("SHA-256")
        val bytes = md.digest(pin.toByteArray())
        return bytes.joinToString("") { "%02x".format(it) }
    }

    fun canAuthenticateBiometric(context: Context): Boolean {
        return try {
            val bm = BiometricManager.from(context)
            bm.canAuthenticate(BiometricManager.Authenticators.BIOMETRIC_STRONG or BiometricManager.Authenticators.BIOMETRIC_WEAK) == BiometricManager.BIOMETRIC_SUCCESS
        } catch (t: Throwable) {
            false
        }
    }

    fun showBiometricPrompt(
        fragment: Fragment,
        title: String = "Unlock Secret Vault",
        subtitle: String = "Scan your fingerprint or face",
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        try {
            if (!fragment.isAdded || fragment.context == null) return
            val executor = ContextCompat.getMainExecutor(fragment.requireContext())
            val prompt = BiometricPrompt(
                fragment,
                executor,
                object : BiometricPrompt.AuthenticationCallback() {
                    override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                        super.onAuthenticationSucceeded(result)
                        onSuccess()
                    }

                    override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                        super.onAuthenticationError(errorCode, errString)
                        onError(errString.toString())
                    }
                }
            )

            val promptInfo = BiometricPrompt.PromptInfo.Builder()
                .setTitle(title)
                .setSubtitle(subtitle)
                .setNegativeButtonText("Use PIN")
                .build()

            prompt.authenticate(promptInfo)
        } catch (t: Throwable) {
            t.printStackTrace()
            onError(t.localizedMessage ?: "Biometric error")
        }
    }

    fun showBiometricPrompt(
        activity: FragmentActivity,
        title: String = "Unlock Secret Vault",
        subtitle: String = "Scan your fingerprint or face",
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        try {
            val executor = ContextCompat.getMainExecutor(activity)
            val prompt = BiometricPrompt(
                activity,
                executor,
                object : BiometricPrompt.AuthenticationCallback() {
                    override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                        super.onAuthenticationSucceeded(result)
                        onSuccess()
                    }

                    override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                        super.onAuthenticationError(errorCode, errString)
                        onError(errString.toString())
                    }
                }
            )

            val promptInfo = BiometricPrompt.PromptInfo.Builder()
                .setTitle(title)
                .setSubtitle(subtitle)
                .setNegativeButtonText("Use PIN")
                .build()

            prompt.authenticate(promptInfo)
        } catch (t: Throwable) {
            t.printStackTrace()
            onError(t.localizedMessage ?: "Biometric error")
        }
    }
}
